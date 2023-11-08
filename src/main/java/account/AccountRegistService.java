package account;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestParam;

import account.check.AccountCheck;

public class AccountRegistService implements AccountCheck{
	
	public void regist(HttpServletRequest req) {
		
		String regId = req.getParameter("id");
		String regPw = req.getParameter("pw");
		String regCheckPw = req.getParameter("checkPw");
		String regName = req.getParameter("name");
		String regNickName = req.getParameter("nick_name");
		String regEmail = req.getParameter("email");
		String regPhone = req.getParameter("phone");
		String regBirth = req.getParameter("birthday");
		
		checkDupId(regId);
		
		checkPw(regId, regPw);
		
		checkEmail(regEmail);
		
		AccountDto account = new AccountDto();
		account.setId(regId);
		account.setAccountPw(regPw);
		account.setName(regName);
		account.setNick_name(regNickName);
		account.setEmail(regEmail);
		account.setPhone(regPhone);
		account.setBirthday(LocalDate.parse(regBirth));
		
		
		
		AccountDao dao = AccountDao.getInstance();
		AccountDto dto = dao.register(null);
	}

}
