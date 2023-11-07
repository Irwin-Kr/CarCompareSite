package account.check;

import java.time.LocalDate;
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
	default void checkPw(String pw) {
		String upperCase = "[A-Z]";
	}
	
	// 이메일 형식 확인
	default void checkEmail(String email) {

		if(!Pattern.matches("\\w+@\\w.\\w+(\\.\\w+)?", email)) {
			throw new CustomException("이메일 형식이 알맞지 않습니다.");
		}
		
	}
	
}
