package online.cangjie.po;

import java.io.Serializable;
import java.util.Date;

public class LoginLogPo implements Serializable {
	private Integer id;
	private String username;
	private Date loginTime;
	private String loginAddress;
	private String loginIP;

	public LoginLogPo() {
		super();
	}

	public LoginLogPo(Integer id, String username, Date loginTime, String loginAddress, String loginIP) {
		super();
		this.id = id;
		this.username = username;
		this.loginTime = loginTime;
		this.loginAddress = loginAddress;
		this.loginIP = loginIP;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public String getLoginAddress() {
		return loginAddress;
	}

	public void setLoginAddress(String loginAddress) {
		this.loginAddress = loginAddress;
	}

	public String getLoginIP() {
		return loginIP;
	}

	public void setLoginIP(String loginIP) {
		this.loginIP = loginIP;
	}

	@Override
	public String toString() {
		return "LoginLogPo [id=" + id + ", username=" + username + ", loginTime=" + loginTime + ", loginAddress="
				+ loginAddress + ", loginIP=" + loginIP + "]";
	}

}
