package irwin.mango;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.apache.ibatis.session.SqlSession;

import account.AccountDto;
import config.MybatisConnection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	SqlSession sqlSession = MybatisConnection.getSqlSession();
    	
    	AccountDto account = new AccountDto();
        account.setId("test");
        account.setAccountPw("qwe123!@");
        account.setFirst_name("test");
        account.setLast_name("kim");
        account.setNick_name("Tester");
        account.setEmail("test@test.org");
        account.setMobile("00000000");
        account.setAddress("Test!");
        account.setBirthday(LocalDate.of(2023, 10, 01));
        
        int affectedRows = sqlSession.insert("AccountMapper.regist", account);
        
        System.out.printf("%d개 저장\n", affectedRows);
        
        System.out.printf("회원 번호 : "+account.getNo());
        
        sqlSession.commit();
        sqlSession.close();
        
        
    }
}
