<%@ tag pageEncoding="UTF-8" %>
<%@ taglib prefix="layoutC"  tagdir="/WEB-INF/tags/layout" %>
<layoutC:common>
	<jsp:attribute name="header">
		<h1>헤드</h1>
	</jsp:attribute>
	<jsp:attribute name="footer">
		COPYRIGHT 
	</jsp:attribute>
	<jsp:body>
		<jsp:doBody />
	</jsp:body>
</layoutC:common>