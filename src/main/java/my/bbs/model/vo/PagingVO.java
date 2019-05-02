package my.bbs.model.vo;

/**
 * 페이지가 가져올 정보가 있는 
 * @author Sight
 *
 */
public class PagingVO 
{
	// Fields
	private int totalCnt;		  // 총 게시글 수
	private int displayCnt = 10;  // 화면에 보여줄 페이지 개수 ( 게시글 수 아님, 혼동주의 )
	private int pageStart;	 	  // 화면에 보이는 페이지 처음 번호
	private int pageEnd;		  // 화면에 보이는 페이지 끝    번호	
	private boolean prev;		  // 이전  페이지 존재 여부
	private boolean next;		  // 다음 페이지 존재 여부	

	// Composite Fields
	private PageConditionVO condition;	// 검색 조건
	
	// ----------- Private Operations -----------
	
	/**
	 * 페이지 숫자를 계산해 주는 함수 
	 * 이 함수는  setTotalCnt() 에서 호출합니다.
	 * 
	 * << [1], [2], [3], [4], [5] >> 형식으로 페이징되도록 처리한다.
	 */
	private void calc()
	{
		//  ( 페이지 번호 / 표시할 페이지 개수 ) * 표시할 페이지 개수 
		int pageNo = (int) ( Math.ceil( condition.getPage() / (double) displayCnt ) * displayCnt );
		int tempEndPage = (int) (Math.ceil(totalCnt / (double) condition.getSize()));
		
		pageEnd = pageNo ;	
		pageStart = (pageEnd - displayCnt) + 1;
		
		// 마지막 펭지 개수 다 안맞는에 대한 처리
		if(pageEnd > tempEndPage) {
			pageEnd = tempEndPage;
		}
		
		// 처음 페이지 일 때만 fals
		prev = pageStart == 1 ? false : true;	

		// 마지막 페이지 일때만 false
		next = pageEnd * condition.getSize() >= totalCnt ? false : true;
		
	}

	// ----------- getters & setters  ----------- 

	public int getTotalCnt() {
		return totalCnt;
	}

	public void setTotalCnt(int totalCnt) {
		this.totalCnt = totalCnt;
		calc();
	}

	public int getDisplayCnt() {
		return displayCnt;
	}

	public void setDisplayCnt(int displayCnt) {
		this.displayCnt = displayCnt;
	}

	public int getPageStart() {
		return pageStart;
	}

	public void setPageStart(int pageStart) {
		this.pageStart = pageStart;
	}

	public int getPageEnd() {
		return pageEnd;
	}

	public void setPageEnd(int pageEnd) {
		this.pageEnd = pageEnd;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public PageConditionVO getCondition() {
		return condition;
	}

	public void setCondition(PageConditionVO condition) {
		this.condition = condition;
	}

	
	// ---------------- toString ----------------
	@Override
	public String toString()
	{
		return String.format(
				"PagingVO [totalCnt=%s, displayCnt=%s, pageStart=%s, pageEnd=%s, prev=%s, next=%s, condition=%s]",
				totalCnt, displayCnt, pageStart, pageEnd, prev, next, condition);
	}
	

}
