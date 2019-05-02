package my.bbs.service;

/**
 *  기본적인 CRUD서비스용 인터페이스
 * 기본적인  삽입, 수정, 삭제, 조회는 이 인터페이스로 구현합니다.
 * 
 * @author Sight
 *
 * @param <VO> DB에서 가져올 테이블 VO
 * @param <ConditionVO>	검색 조건을 가지고 있는 VO 
 * 
 * 추가 : 인터페이스 더 구조화 시켜야..
 */
public interface RestCrudService<VO, ConditionVO>
{
	// 입력
	public int insert(VO vo);
	
	// 수정
	public int edit(VO vo);
	
	// 삭제 
	public int destroy(VO vo);
	
	// 특정 게시글 검색
	public VO selectOne(VO vo);
	
	// 다중 조회 - json 
	public String selectAll(VO vo, ConditionVO cnd);
	
	// 게시글 수 세기
	public int countTotal(ConditionVO cnd);
	
}
