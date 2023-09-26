<%@ tag pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="layout"  tagdir="/WEB-INF/tags/layout"  %>
<%@ attribute name="footer" fragment="true" %>
<%@ attribute name="addCss" fragment="true" %>
<%@ attribute name="addJs" fragment="true" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<!-- CSS 관련 -->
		<link rel="stylesheet" href="//cdn.jsdelivr.net/npm/xeicon@2.3.3/xeicon.min.css" />
		<link rel="stylesheet" type="text/css" href="<c:url value='/common/common.css' />" />
		<c:if test="${ !empty addCss}">
			<c:forEach var="css" items="${ addCss }">
				<link rel="stylesheet" type="text/css" href="<c:url value='/css/${css}.css' />" />
			</c:forEach>
		</c:if>
		<!-- JavaScript 관련 -->
		<!-- <script src="<c:url value='/common/js/common.js'/>"></script>
		-->
		<c:if test="${ !empty addJs}">
			<c:forEach var="js" items="${ addJs }">
				<script src="<c:url value='/js/${js}.js' />"></script>
			</c:forEach>
		</c:if>
	</head>
	<body>
		<layout:header>
		</layout:header>
		<main>
			<jsp:doBody />
		</main>
		<footer>
			<jsp:invoke fragment="footer" />
		</footer>
	</body>
</html>