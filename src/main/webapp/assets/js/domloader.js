var table_body = $('.bbs-table-body'); 		// 게시판 글 있는 테이블 태그

var size_select 	= $('#selectSize');		// 한번에 게시글 몇개 씩 볼지 선택하는 태그
var orderby_select	= $('#selectOrder');	// 	 	
var searchInput 	= $('#searchInput');
var searchBtn 		= $('#searchBtn');

var rowGen = function(data)
{
	var UTC  = new Date(data.time);
	var yyyymmddhhmm = `${UTC.getFullYear()}-${UTC.getMonth()+1}-${UTC.getDate()}
						 ${UTC.getHours()}:${UTC.getMinutes()}`  
	
	var row = $('<tr class="bbs-table-row"></tr>').get(0);
	var id  = $(`<td>${data.id}</tr>`).get(0);
	var title  = $(`<td>${data.title}</tr>`).get(0);
	var time  = $(`<td>${yyyymmddhhmm}</tr>`).get(0);
    
    row.append(id);
    row.append(title);
    row.append(time);
    
    return row;
}

var pageContainer = $('.page-container');

