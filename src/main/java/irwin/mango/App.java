package irwin.mango;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.regex.Pattern;

import org.apache.ibatis.session.SqlSession;

import account.AccountDto;
import config.CustomException;
import config.MybatisConnection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*
    	SqlSession sqlSession = MybatisConnection.getSqlSession();
    	
    	AccountDto account = new AccountDto();
        account.setId("test");
        account.setAccountPw("qwe123!@");
        account.setName("test");
        account.setNick_name("Tester");
        account.setEmail("test@test.org");
        account.setMobile("00000000");
        account.setAddress("Test!");
        account.setBirthday(LocalDate.of(2023, 10, 01));
        
        int affectedRows = sqlSession.insert("AccountMapper.regist", account);
        
        System.out.printf("%d개 저장\n", affectedRows);
        
        System.out.printf("회원 번호 : "+account.getNo());
        
        AccountDto account2 = new AccountDto();
        account2.setAccountPw("1q2w3e!Q@W#E");
        
        int affectedRows2 = sqlSession.update("AccountMapper.update", account);
        
        System.out.printf("%d개 수정\n", affectedRows2);
        
        sqlSession.commit();
        sqlSession.close();
        */
    	
    	String email = "test@test.org";
    	
    	boolean test = Pattern.matches("\\w+@\\w.\\w+(\\.\\w+)?", email);
    	System.out.println(test);

    }
}
