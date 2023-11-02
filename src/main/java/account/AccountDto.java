package account;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AccountDto {

	private long no;
	private String id;
	private String pw;
	private String name;
	private String email;
	private String mobile;
	private LocalDate birthday;
	private Grant grant;
	private LocalDateTime regDt;
	private LocalDateTime modDt;
	
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public Grant getGrant() {
		return grant;
	}
	public void setGrant(Grant grant) {
		this.grant = grant;
	}
	public LocalDateTime getRegDt() {
		return regDt;
	}
	public void setRegDt(LocalDateTime regDt) {
		this.regDt = regDt;
	}
	public LocalDateTime getModDt() {
		return modDt;
	}
	public void setModDt(LocalDateTime modDt) {
		this.modDt = modDt;
	}
	
	public AccountDto(long no, String id, String pw, String name, String email, String mobile, LocalDate birthday, LocalDateTime regDt, LocalDateTime modDt) {
		super();
		this.no = no;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.birthday = birthday;
		this.regDt = regDt;
		this.modDt = modDt;
	}
	@Override
	public String toString() {
		return "AccountDto [no=" + no + ", id=" + id + ", pw=" + pw + ", name=" + name + ", email=" + email
				+ ", mobile=" + mobile + ", birthday=" + birthday + ", grant=" + grant + ", regDt=" + regDt + ", modDt="
				+ modDt + "]";
	}
	
	
}
