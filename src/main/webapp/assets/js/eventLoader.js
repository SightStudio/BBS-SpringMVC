// 정렬 순서 변경시 다시 Ajax 요청으로 페이지 갱신
$(document).ready(function()
{
	orderby_select.on('change', function() 
	{
		let size    = size_select.val();
		let search  = searchInput.val();
	    getList(size, 1, search, this.value);
	});
})

// 조회 개수 변경시 다시 Ajax 요청으로 페이지 갱신
$(document).ready(function()
{
	size_select.on('change', function()
	{	
		let search  = searchInput.val();
		let orderby = orderby_select.val();
		getList(this.value, 1, search, orderby);
	});
})


/**
 *  게시글 테이블에서 해당 row를 클릭 했을 때, 해당 게시글로 이동시켜주는 이벤트를 설정
 * 새로 게시글들이 바뀔때마다 이벤트를 다시 attach한다.
 */
$('.bbs-table-body').on('DOMNodeInserted', function()
{
	$('.bbs-table-body > tr').on('click', function()
	{
		let index = $(this).find('td').eq(0).html();
		location.href = `show.do?id=${index}`
	});
});

/**
 * 	페이지 번호 목록중에서 해당 번호를 클릭 했을 때, 
 * 해당 페이지로 이동시켜주는 이벤트를 설정한다.
 * 게시글들이 로딩 될 때마다 다시 이벤트를 attach 한다.
 */
pageContainer.on('DOMNodeInserted', function()
{
	let size = size_select.val();
	$('.page-container > li').on('click', function()
	{
		let page = $(this).html();
		let search = searchInput.val();
		let orderby = orderby_select.val();
		
		getList(size, page, search, orderby);
		console.log(size + '|' + page)
	});
});

/**
 * 검색 버튼 클릭시 키워드 검색에 맞는 첫번째 페이지를 가져온다
 */
searchBtn.on('click', function(){
	let size   = size_select.val();
	let search = searchInput.val();
    let orderby = orderby_select.val();
	getList(size, 1, search, orderby);	// 검색은 항상 첫번째 페이지에
})
