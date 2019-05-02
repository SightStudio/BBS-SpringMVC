package my.bbs.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import my.bbs.model.vo.BbsVO;
import my.bbs.model.vo.PagingVO;

@Repository("bbsDAO")
public class BbsDaoImpl implements CrudDao<BbsVO, PagingVO>
{
	@Autowired
	SqlSessionTemplate sqlSession;
	
	@Override
	public int insert(BbsVO vo) 
	{
		return sqlSession.insert("bbs.insert", vo);
	}

	@Override
	public int update(BbsVO vo) {
		return sqlSession.update("bbs.update", vo);
	}

	@Override
	public int destroy(BbsVO vo) {
		return sqlSession.delete("bbs.delete", vo);
	}

	@Override
	public BbsVO selectOne(BbsVO vo) {
		return sqlSession.selectOne("bbs.selectOne", vo);
	}
	
	@Override
	public List<BbsVO> selectList(PagingVO page) {
		return sqlSession.selectList("bbs.selectBbsList", page);
	}
	
	@Override
	public int countTotal(PagingVO page) {
		return sqlSession.selectOne("bbs.countTotal", page);
	}
}
