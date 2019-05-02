/**

 * 서버에서 게시글의 검색 조건에 맞는 결과를 가져오는 함수
 *  
 */
let getList = function(size = 10, page = 1, search='',  order='')
{
    $.ajax({
        type: 'GET',
        url:  'REST/selectBbs.do',
        data: `size=${size}&page=${page}&search=${search}&order=${order}`,
        success: (msg) => { 
            console.log(msg)
            refresh(msg)
        }
    })
}

// 전체 페이지 새로고침 
let refresh = function(msg)
{
	let list   = msg['bbsList'];
    let page_info = msg['page_info'];
    console.log(list)
    
    _refreshBbs(list);			// 페이지에서 게시글 새로고침
    _refreshPage(page_info);	// 페이지 하단 페이징바 새로고침
}

// 페이지 내 게시판 글 갱신
let _refreshBbs = function(list)
{
    table_body.empty();							// 게시판 기존 게시그 (tr 노드) 전부 제거
    for(let i = 0 ; i < list.length ; i++)		// 새로 가져온 tr 태그를 append
    {
        let row = rowGen(list[i]);
        table_body.get(0).append(row);
    }
}

// 게시판 아래 페이징 바 갱신
let _refreshPage = function(page_info)
{
    pageContainer.empty();						// 기존 페이징 바 제거
    let start = page_info['pageStart']			// 페이지 시작 번호
    let end   = page_info['pageEnd']			// 페이지 끝 번호
    
    for(let i = start ; i < end + 1 ; i++)		// 새로 가져온 데이터로 페이징 정보 추가
    {
        let page = $(`<li>${i}<li>`).get(0);
        pageContainer.get(0).append(page);
    }
}

// 페이지 최초 로딩시 게시글을 Ajax로 기본 10개 가져온다.
window.onload = function(){
    getList()
}






























