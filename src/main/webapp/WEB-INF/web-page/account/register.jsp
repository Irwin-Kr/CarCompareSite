<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="layout"  tagdir="/WEB-INF/tags/layout" %>

<layout:common>
	<div id="register_box">
		<p style="text-align: center; font-weight: bold; font-size: 2.5rem; margin-top: 30px;">회원가입<p>
		<hr style="margin: 3% auto; width: 90%; padding: border: solid 3px orange;" />
		<form id="form_box">
			<div class="box">
				<label for="id">아이디</label>
				<input type="text" name="id" id="id" placeholder="아이디를 입력해주세요." />
				<button id="CheckForDuplicateId"  >중복확인</button>
			</div>
			<div class="box">
				<label for="pw">비밀번호</label>
				<input type="password" name="pw" id="pw" placeholder="비밀번호를 입력해주세요." />
				<button></button>
			</div>
			<div class="box">
				<label for="pw">비밀번호 확인</label>
				<input type="password" name="pwCheck" id="pwCheck" placeholder="비밀번호를 다시 입력해주세요." />
				<button></button>
			</div>
			<div class="box">
				<label for="name">이름</label>
				<input type="text" name="name" id="name" placeholder="이름을 입력해주세요." />
				<button></button>
			</div>
			<div class="box">
				<label for="email">이메일</label>
				<input type="email" name="email" id="email" placeholder="이메일을 입력해주세요." />
				<button></button>
			</div>
			<div class="box">
				<label for="phone">연락처</label>
				<input type="text" name="phone" id="phone" placeholder="연락처를 입력해주세요." />
				<button></button>
			</div>
			<div class="box">
				<label for="birthday">생년월일</label>
				<input type="date" name="birthday" id="birthday" placeholder="비밀번호를 다시 입력해주세요." />
				<button></button>
			</div>
		</form>
	</div>
</layout:common>