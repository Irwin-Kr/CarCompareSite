package account;

import org.springframework.web.bind.annotation.RequestParam;

public class AccountRegistService {
	
	public void regist(@RequestParam String id) {
		
		checkDuplicateId(id);
		
		AccountDao dao = AccountDao.getInstance();
	}

}
