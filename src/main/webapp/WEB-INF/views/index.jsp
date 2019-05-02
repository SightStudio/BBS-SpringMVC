<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<title>환경설정 부들부들...</title>
	
	<!-- Global CSS -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/normalize.css" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/reset.css"     />
	
	<!-- page CSS -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/bbs.css"     />
	
	<!-- JQuery CDN -->
	<script src="https://code.jquery.com/jquery-3.3.1.js"
			integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
		  	crossorigin="anonymous">
	</script>
</head>
<body>
	<header>
		<div>
			<p>
				<a href="index.do"style="font-size:30px;">
				메인으로
				</a>
			</p>
		</div>
	</header>
	
	<main>
		<section class="contents">
			<article class="bbs-wrapper">
				<div class = "search-container">
					
					<label for="selectOrder">정렬</label>
					<select id="selectOrder">
						<option value="asc">오름차순</option>
						<option value="desc" selected>내림차순</option>
					</select>
				
					<label for="selectSize">조회 개수</label>
					<select id="selectSize">
						<option value="10">10개씩</option>
						<option value="30">30개씩</option>
						<option value="50">50개씩</option>
					</select>
					
					<input type="search" id="searchInput" size="10"/>
					<label for="selectSearch">
						<button id="searchBtn">검색</button>
					</label>
				</div>
				
				<div class="bbs-container">
					<table class="bbs-table">
						<thead>
							<tr>
								<th>번호</th>
								<th>제목</th>
								<th>등록일시</th>
							</tr>
						</thead>
						
						<tbody class="bbs-table-body">
							<!-- for statement -->
							<tr class="bbs-table-row">
								<td>XX</td>
								<td>XX</td>
								<td>XX</td>
							</tr>	
							<!-- for statement end -->
						</tbody>
					</table>
					
					<div>
						<ol class="page-container">
							<!--   for statement   -->
							
							<!-- for statement end -->
						</ol>
					</div>
					
					<div class="btn-container-control">
						<button onclick="location.href='write.do'">글 작성</button>
					</div>
				</div>
			</article>
		</section>
	</main>
	
	<footer>
	
	</footer>
	
	<!-- My JS -->
	<script src="${pageContext.request.contextPath}/assets/js/domloader.js"   type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/assets/js/bbs.js"         type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/assets/js/eventLoader.js" type="text/javascript"></script>
</body>
</html>
