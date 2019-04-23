package online.cangjie.po;

import java.io.Serializable;
import java.util.Date;

public class AdminPo implements Serializable {
	private Integer id;
	private String name;
	private String username;
	private String password;
	private Integer sex;
	private String phone;
	private String email;
	private String qq;
	private Integer state;
	private Date registration;

	public AdminPo() {
		super();
	}

	public AdminPo(Integer id, String name, String username, String password, Integer sex, String phone, String email,
			String qq, Integer state, Date registration) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.phone = phone;
		this.email = email;
		this.qq = qq;
		this.state = state;
		this.registration = registration;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Date getRegistration() {
		return registration;
	}

	public void setRegistration(Date registration) {
		this.registration = registration;
	}

	@Override
	public String toString() {
		return "AdminPo [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + ", sex="
				+ sex + ", phone=" + phone + ", email=" + email + ", qq=" + qq + ", state=" + state + ", registration="
				+ registration + "]";
	}

}
