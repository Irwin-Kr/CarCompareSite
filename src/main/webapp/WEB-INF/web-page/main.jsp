<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tagM" tagdir="/WEB-INF/tags/layout" %>

<tagM:main>
	<div class="slider-container">
		<img class="slider-img" src="<c:url value='/images/Car/sportage_feature_bg_pc.jpg' />" />
		<img class="slider-img" src="<c:url value='/images/Car/trailblazer-mast-l-xl.jpg'/> " />
		<img class="slider-img" src="<c:url value='/images/Car/qm6_banner.jpg'/>" />
		<img class="slider-img" src="<c:url value='images/Car/tivoli_visualbg2004.jpg'/>" />
		<div class="buttons">
			<button class="xi-angle-left" onclick="plusDivs(-1)"></button>
			<button class="xi-angle-right" onclick="plusDivs(1)"></button>
		</div>
	</div>
	<h1>본문</h1>
</tagM:main>