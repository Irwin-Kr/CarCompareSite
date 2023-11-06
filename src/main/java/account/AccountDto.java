package account;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AccountDto {

	private long no;
	private String id; // UNIQUE
	private String accountPw;
	private String name;
	private String nick_name; // UNIQUE
	private String email; // UNIQUE
	private String mobile; // UNIQUE
	private LocalDate birthday;
	private String Address;
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
	public String getAccountPw() {
		return accountPw;
	}
	public void setAccountPw(String accountPw) {
		this.accountPw = accountPw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
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
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
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
	@Override
	public String toString() {
		return "AccountDto [no=" + no + ", id=" + id + ", accountPw=" + accountPw + ", name=" + name + ", nick_name="
				+ nick_name + ", email=" + email + ", mobile=" + mobile + ", birthday=" + birthday + ", Address="
				+ Address + ", grant=" + grant + ", regDt=" + regDt + ", modDt=" + modDt + "]";
	}

}
