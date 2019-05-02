package my.bbs.model.dao;

import java.util.List;

/**
 * 
 * @author Sight
 *
 * @param <T>
 */
public interface CrudDao<VO, Page>
{
	// 삽입
	public int insert(VO vo);
	
	// 수정
	public int update(VO vo);
	
	// 삭제
	public int destroy(VO vo);

	// 조회
	public VO selectOne(VO vo);
	
	// 특정 범위 조회 
	public List<VO> selectList(Page page);

	// 총 개수 집계
	public int countTotal(Page page);
}
