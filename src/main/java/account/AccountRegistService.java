package account;

import org.springframework.web.bind.annotation.RequestParam;

import account.check.AccountCheck;

public class AccountRegistService implements AccountCheck{
	
	public void regist(@RequestParam String id, @RequestParam String pw, @RequestParam String email) {
		
		checkDupId(id);
		
		checkPw(pw);
		
		checkEmail(email);
		
		AccountDao dao = AccountDao.getInstance();
	}

}
