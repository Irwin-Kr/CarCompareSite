<%@ tag pageEncoding="UTF-8" %>
<%@ taglib prefix="layoutC"  tagdir="/WEB-INF/tags/layout" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<layoutC:common>
	<jsp:attribute name="header">
		<section class="top_nav">
			<div id="menu">
			</div>
			<div id="logo">
				<img src="<c:url value='/images/mangoCar.png'/>" />
			</div>
			<div id="account">
				<a href="https://www.naver.com">로그인</a>
				<a href="https://www.google.com">회원가입</a>
			</div>
		</section>
	</jsp:attribute>
	<jsp:attribute name="footer">
		COPYRIGHT 
	</jsp:attribute>
	<jsp:body>
		<jsp:doBody />
	</jsp:body>
</layoutC:common>