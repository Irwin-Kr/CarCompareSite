package account.check;

import account.AccountDao;

public interface AccountCheck {

	default void checkId(String id) {
		if(AccountDao.getInstance().checkDuplicateId(id)) {
			throw new RuntimeException();
		}
	}
	
	default void checkComplexityPw(String pw) {
		//Matcher, Pattern
		if(pw == null || pw.length()<8) {
			
		}
	}
	
}
