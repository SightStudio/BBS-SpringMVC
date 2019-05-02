package my.bbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import my.bbs.model.vo.BbsVO;
import my.bbs.model.vo.PageConditionVO;
import my.bbs.service.RestCrudService;


@Controller
public class BbsController 
{
	@Autowired
	RestCrudService<BbsVO, PageConditionVO> bbsService;
	
	// 메인 페이지
	@RequestMapping(value = "/index.do", method = RequestMethod.GET)
	public String home(Model mo) 
	{	
		return "index";
	}
	
	/**
	 * 게시글 작성 페이지로 이동
	 */
	@RequestMapping(value="/write.do", method=RequestMethod.GET)
	public String insert(Model mo)
	{
		BbsVO select = new BbsVO();
		mo.addAttribute(select);
		mo.addAttribute("action_url", "write.do");		// 게시글 form action 값
		mo.addAttribute("action_method", "POST");		// 게시글 form 요청 method
		mo.addAttribute("action_name", "글 작성하기");		// 게시글 form 작성 번호
		return "bbs/write";
	}
	
	/**
	 * 게시글 작성처리하는 URL
	 * @param vo GET write.do에서 입력된 값
	 *
	 * @return	작성 완료 후 메인 페이지로 이동
	 */
	@RequestMapping(value="/write.do", method=RequestMethod.POST)
	public String insertAction(@ModelAttribute("bbsVO") BbsVO vo, Model mo)
	{	
		bbsService.insert(vo);
		return "redirect:/index.do";
	}
	

	/**
	 * 게시글 조회 페이지 
	 * @param id 조회할 게시글 ID
	 * @param mo
	 * @return 해당 조회 페이지로 이동
	 */
	@RequestMapping(value = "/show.do", method = RequestMethod.GET)
	public String show(@RequestParam("id") int id, Model mo)
	{
		BbsVO vo = new BbsVO(id);
		
		mo.addAttribute("bbsVO",bbsService.selectOne(vo));
		return "bbs/show";
	}
	
	/**
	 * 작성한 게시글을 사용자가 수정하는 페이지
	 * 
	 * @param id 사용자가 수정하려는 게시글 데이터
	 * @return write 페이지
	 */
	@RequestMapping(value="/patch.do", method=RequestMethod.GET)
	public String patch(@RequestParam("id") int id, Model mo)
	{
		BbsVO vo = new BbsVO(id);								// 가져올 게시글 id 세팅
		mo.addAttribute("bbsVO",bbsService.selectOne(vo));		// 게시글 검색후 model에 추가
		mo.addAttribute("action_url", "patch.do");				// 제출 경로
		mo.addAttribute("action_method", "PATCH");				// 일부 수정이여서 PATCH 요청 사용
		mo.addAttribute("action_name", "글 수정하기");				// form 버튼 이름
		return "bbs/write";									
	}
	
	/**
	 * 실제 수정이 발생하는 경로
	 * 
	 * @param vo 수정 할 VO
	 * @return 수정 후 메인으로
	 */
	@RequestMapping(value="/patch.do", method=RequestMethod.PATCH)
	public String patchAction(@ModelAttribute("bbsVO") BbsVO vo, Model mo)
	{
		bbsService.edit(vo);
		return "redirect:/index.do";
	}
	
	/**
	 * 게시글 삭제 요청을 처리하는 페이지
	 * 실제로 데이터베이스에서 삭제되지는 않고, 
	 * 게시판 DB의 flag 값을 1에서 0으로 UPDATE 한다.
	 * 
	 * @param id 삭제할 게시글 ID (DB의 PK)
	 * @return 삭제완료시 메인 페이지로 이동
	 */
	@RequestMapping(value="/delete.do", method=RequestMethod.DELETE)
	public String deleteAction(@RequestParam("id") int id, Model mo)
	{
		BbsVO vo = new BbsVO(id);
		bbsService.destroy(vo);
		return "redirect:/index.do";
	}
	
	// -------------------- REST requests --------------------
	
	/**
	 * 게시글 목록을 JSON으로 출력해주는 경로
	 * 아래 조건들에 맞춰서 DB에서 조회 후 JSON 형태로 변환 후, 뿌려준다. 
	 * @param vo		데이터를 담을 VO
	 * @param page		요청 페이지
	 * @param size		한번에 가져올 게시글 수
	 * @param order		정렬 순서
	 * @param keyword	검색 키워드
	 * @return 페이징 정보, 게시글 정보가 담긴 JSON
	 */
	@ResponseBody
	@RequestMapping(value="/REST/selectBbs.do", method=RequestMethod.GET,  produces = "application/json; charset=utf8")
	public String selectBbsAll(BbsVO vo, @RequestParam("page")   int page, 
										 @RequestParam("size")   int size,
										 @RequestParam(value = "order" , required =false) String order,
										 @RequestParam(value = "search", required =false) String keyword)
	{
		PageConditionVO cnd = new PageConditionVO(page, size, keyword, order);	// 검색 조건 VO세팅
		return bbsService.selectAll(vo, cnd);
	}
	
}