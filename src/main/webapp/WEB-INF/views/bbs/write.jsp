<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>작성</title>
	
	<!-- Global CSS -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/normalize.css" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/reset.css"     />
	
	<!-- page CSS -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/write.css"       />
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
		<section>
			<article>
				<form:form action="${action_url}" commandName="bbsVO">
					<div>
						<input type="hidden" name="_method" value="${action_method}"/>
						<form:label path="title">제목</form:label>
						<form:input path="title"/>
					</div>
					
					<div>
						<form:label    path="content">내용</form:label>
						<form:textarea path="content"/>
					</div>
					
					<div>
						<form:hidden path="id"/>
						<input type="submit" value="${action_name}"/>
					</div>
				</form:form>
			</article>
		</section>
	</main>
	
	<!-- END HTML -->
	<script></script>
</body>
</html>