<%@ tag pageEncoding="UTF-8" %>
<%@ taglib prefix="layout"  tagdir="/WEB-INF/tags/layout"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header>
			<section class="top_nav">
				<div id="menu">
				</div>
				<a href="/CarCompareSite" id="logo">
					<img src="<c:url value='/images/mangoCar.png'/>" />
				</a>
				<!-- 비회원의 경우 -->
				<div id="account">
					<a href="https://www.naver.com">로그인</a>
					<div class="xi-minus xi-rotate-90" ></div>
					<a href="/CarCompareSite/register">회원가입</a>
				</div>
				<!-- 회원의 경우 -->
			</section>
			<section >
				<nav>
					<ul id="search_nav">
						<li class="search_nav_li">
							<a href="naver.com">차종별</a>
						</li>
						<li class="search_nav_li">
							<a href="naver.com">제조사별</a>
						</li>
						<li class="search_nav_li">
							<a href="naver.com">유종별</a>
						</li>
					</ul>
				</nav>
			</section>
</header>