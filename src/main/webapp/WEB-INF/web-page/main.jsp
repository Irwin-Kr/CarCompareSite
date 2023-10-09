<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tagM" tagdir="/WEB-INF/tags/layout" %>

<tagM:main>
	<div id="search_box">
		<div id="search">
			<input type="text" id="search_text" />
			<button class="xi-search xi-2x"></button>
		</div>
	</div>

	<div class="slider-container">
		<!-- 사진 해상도 고정시킬것. -->
		<img class="slider-img" src="<c:url value='/images/Car/sportage_feature_bg_pc.jpg' />" />
		<img class="slider-img" src="<c:url value='/images/Car/trailblazer-mast-l-xl.jpg'/> " />
		<img class="slider-img" src="<c:url value='/images/Car/qm6_banner.jpg'/>" />
		<img class="slider-img" src="<c:url value='images/Car/tivoli_visualbg2004.jpg'/>" />
		<div id="btns">
			<button class="xi-angle-left xi-3x" onclick="plusDivs(-1)"></button>
			<section id="sel_btns">
				<div id="num_btns">
					<button class="xi-full-moon xi-1x" ></button>
					<button class="xi-radiobox-blank xi-1x" ></button>
					<button class="xi-radiobox-blank xi-1x" ></button>
					<button class="xi-radiobox-blank xi-1x" ></button>
				</div>
			</section>
			<button class="xi-angle-right xi-3x" onclick="plusDivs(1)"></button>
		</div>
	</div>
	<h1>본문</h1>
</tagM:main>