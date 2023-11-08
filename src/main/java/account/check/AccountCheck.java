package account.check;

import java.util.regex.Pattern;

import account.AccountDao;
import config.CustomException;

public interface AccountCheck {

	// 아이디 중복 확인
	default void checkDupId(String id) {
		if(AccountDao.getInstance().checkDuplicateId(id)) {
			throw new CustomException("아이디가 중복됩니다.");
		}
	}
	
	// 패스워드 복잡도 확인
	default void checkPw(String id, String pw) {
		// 패스워드 영문자, 숫자, 특수문자, 8자리 이상
		if(!Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z])(?=.*\\\\d)(?=.*\\\\W).{8,20}$", pw)) {
			throw new CustomException("비밀번호는 8자리 이상, 대/소문자, 숫자, 특수문자가 포함되어야합니다.");
		}
		
		// 패스워드에 아이디 포함 확인
		if(pw.contains(id)) {
			throw new CustomException("비밀번호에 아이디를 포함할 수 없습니다.");
		}
		
		if(Pattern.matches("^(?=.\\b)", pw)) {
			throw new CustomException("비밀번호에 공백을 포함할 수 없습니다.");
		}

	}
	
	// 이메일 형식 확인
	default void checkEmail(String email) {

		if(!Pattern.matches("\\w+@\\w.\\w+(\\.\\w+)?", email)) {
			throw new CustomException("이메일 형식이 알맞지 않습니다.");
		}
		
	}
	
}
