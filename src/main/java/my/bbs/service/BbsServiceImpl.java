package my.bbs.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import my.bbs.model.dao.CrudDao;
import my.bbs.model.vo.BbsVO;
import my.bbs.model.vo.PageConditionVO;
import my.bbs.model.vo.PagingVO;

/**
 * 게시판 연동시 필요한 비즈니스 로직 
 * 
 * @author Sight
 *
 */
@Service("bbsService")
public class BbsServiceImpl implements RestCrudService<BbsVO, PageConditionVO>
{
	@Autowired
	CrudDao<BbsVO, PagingVO> bbsDao;
	
	// ------------------ Public Operations -----------------------
	
	@Override
	public int insert(BbsVO vo)
	{
		return bbsDao.insert(vo);
	}

	@Override
	public int edit(BbsVO vo) {
		return bbsDao.update(vo);
	}

	@Override
	public int destroy(BbsVO vo) {
		return bbsDao.destroy(vo);
	}

	@Override
	public BbsVO selectOne(BbsVO vo) {
		return bbsDao.selectOne(vo);
	}
	
	@Override
	public String selectAll(BbsVO vo, PageConditionVO cnd) 
	{	
		PagingVO pageVO = new PagingVO();				// 페이지 정보 
		pageVO.setCondition(cnd);						// 페이지에 주어진 검색조건 추가
		pageVO.setTotalCnt(countTotal(cnd));			// 페이지에 총 게시글 수 저장후 페이징 정보 계산	
		
		List<BbsVO> list = bbsDao.selectList(pageVO);	// Dao에서 결과를 리스트에 저장 

		String result = bbsStringify(list, pageVO);		// 게산된 페이징 정보와 게시글 리스트를 map에 저장후 JSON으로 변환
		
		return result;
	}

	@Override
	public int countTotal(PageConditionVO cnd) 
	{
		PagingVO pageVO = new PagingVO();				// 페이지 정보 
		pageVO.setCondition(cnd);						// 페이지 검색 조건 설정
		
		
		return bbsDao.countTotal(pageVO);				// 조건에 맞는 게시글들 수를 카운트후 리턴
	}

	// ----------------- Private Operations ------------------
	
	/**
	 * 페이지 정보 VO와 게시글 리스트를 JSON으로 변환해주는 함수
	 * 
	 * @param bbsList	게시글 리스트
	 * @param paging	페이지 상태 정보
	 * @return 두개의 정보를 가진 JSONs
	 */
	private String bbsStringify(List<BbsVO> bbsList, PagingVO paging) 
	{
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> map = new HashMap<>();
		String result = null;
		try {
			map.put("bbsList"   , bbsList);
			map.put("page_info" , paging);
			
			result =  mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);	// 여기서 JSON으로 변환
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			System.out.println("JSON 파싱 부분에서 문제 발생"); // TODO sout
		}
		return result;
	}
}
