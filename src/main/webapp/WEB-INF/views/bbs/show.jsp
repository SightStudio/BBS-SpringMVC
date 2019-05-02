<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>작성</title>
	
	<!-- Global CSS -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/normalize.css" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/reset.css"     />
	
	<!-- page CSS -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/editor.css"     />
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
		<section class="bbs-container">
			<article>
				<div>
					<p>제목 :  ${bbsVO.title}</p>
					<p>
						작성 시간 : <fmt:formatDate value="${bbsVO.time}" pattern="yyyy-MM-dd HH:mm" />
					</p>
				</div>
				
				<textarea cols="30" rows="10" readonly>${bbsVO.content}</textarea>
			</article>
			<article>
				<p>
					<button onclick="location.href = 'patch.do?id=${bbsVO.id}'">수정하기</button>
				</p>
				<p>
					<form:form action="delete.do">
						<input type="hidden" name="_method" value="delete" />
						<input type="hidden" name="id" value="${bbsVO.id}"/>
						<input type="submit" value="삭제하기" />
					</form:form>
				</p>
			</article>
		</section>
	</main>
	
	<!-- END HTML -->
	<script></script>
</body>
</html>