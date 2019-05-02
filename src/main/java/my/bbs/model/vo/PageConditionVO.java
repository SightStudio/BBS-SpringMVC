package my.bbs.model.vo;

import java.util.Optional;

/**
 * 페이지의 검색 조건을 가지고 있는 VO
 * 주의 : DB에는 없는 데이터이다. 
 * @author Sight
 *
 */
public class PageConditionVO 
{
	// Fields
	private int page;		// 조회할 페이지 번호
	private int size;		// 페이지당 보여줄 게시글 양
	private String search;	// 페이지 검색어
	private String order;	// 페이지 정렬 순서
	
	
	// Constructors		
	public PageConditionVO() {}
	
	public PageConditionVO(int page, int size, String search, String order) 
	{
		this.page   = page;		
		this.size   = size;
		this.search = Optional.ofNullable(search).orElse("");
		this.order  = Optional.ofNullable(order).orElse("");
	}
	
	// ------------- Public Operations -------------
	
	public int getStartIndex()
	{
		return (this.page - 1) * size;
	}
	
	// ------------- getters & setters -------------
	
	public int getPage() 
	{
		return page;
	}

	public void setPage(int page) 
	{
		if(page > 0)
		{
			this.page = page;
		} else {
			this.page = 1;
		}
	}

	public int getSize() 
	{
		return size;
	}

	public void setSize(int perPage)
	{
		this.size = perPage;
	}

	
	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	// ------------- toString() -------------
	@Override
	public String toString() 
	{
		return String.format("PageConditionVO [page=%s, size=%s, search=%s, order=%s]", 
				page, size, search, order);
	}

}
