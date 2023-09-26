<%@ tag pageEncoding="UTF-8" %>
<%@ taglib prefix="layout"  tagdir="/WEB-INF/tags/layout"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header>
			<section class="top_nav">
				<div id="menu">
				</div>
				<div id="logo">
					<img src="<c:url value='/images/mangoCar.png'/>" />
				</div>
				<!-- 비회원의 경우 -->
				<div id="account">
					<a href="https://www.naver.com">로그인</a>
					<a href="https://www.google.com">회원가입</a>
				</div>
				<!-- 회원의 경우 -->
			</section>
			<section>
				<nav id="search_nav">
					<ul>
						<li>차종별</li>
						<li>제조사별</li>
						<li>유종별</li>
					</ul>
				</nav>
			</section>
</header>