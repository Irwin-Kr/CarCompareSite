<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="layout"  tagdir="/WEB-INF/tags/layout" %>

<layout:common>
	<h3>회원가입</h3>
	<form>
		<div class="box">
			<label for="id">아이디 : </label>
			<input type="text" name="id" id="id" placeholder="아이디를 입력해주세요." />
			<button id="CheckForDuplicateId">중복확인</button>
		</div>
	</form>
</layout:common>