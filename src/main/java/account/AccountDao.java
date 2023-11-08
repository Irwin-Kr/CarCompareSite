package account;

import org.apache.ibatis.session.SqlSession;

import config.CustomException;
import config.MybatisConnection;

public class AccountDao {
	
	private static AccountDao dao = new AccountDao();

	// 회원가입
	public AccountDto register(AccountDto account) {
		try {
			SqlSession sqlSession = MybatisConnection.getSqlSession();
			int result = sqlSession.insert("AccountMapper.regist", account);
			if(result <= 0) {
				throw new CustomException("회원 등록에 실패하였습니다.");
			}
			sqlSession.commit();
			sqlSession.close();
			
			return account;
		}catch(RuntimeException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	//회원 정보 수정
	public AccountDto update(AccountDto account) {
		try {
			SqlSession sqlSession = MybatisConnection.getSqlSession();
			sqlSession.update("AccountMapper.update", account);
			sqlSession.commit();
			sqlSession.close();
		}catch(RuntimeException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//아이디 중복 확인
	public boolean checkDuplicateId(String id) {
		SqlSession sqlSession = MybatisConnection.getSqlSession();
		AccountDto account = new AccountDto();
		account.setId(id);
		int result = sqlSession.selectOne("AccountMapper.searchId", account);
		if(result>0) {
			System.out.println("중복된 아이디가 있습니다.");
			return true;
		}else {
			System.out.println("중복된 아이디가 없습니다.");
			return false;
		}
	}
	
	public static AccountDao getInstance() {
		if (dao == null) {
			dao = new AccountDao();
		}
		
		return dao;
	}
	
}
