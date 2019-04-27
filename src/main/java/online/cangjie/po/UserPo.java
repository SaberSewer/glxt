package online.cangjie.po;

import java.io.Serializable;
import java.util.Date;

public class UserPo implements Serializable {
	private Integer id;
	private String name;
	private Integer sex;
	private String phone;
	private String email;
	private String address;
	private Date join;
	private Integer level;
	private Integer state;

	public UserPo() {
		super();
	}

	public UserPo(Integer id, String name, Integer sex, String phone, String email, String address, Date join,
			Integer level, Integer state) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.join = join;
		this.level = level;
		this.state = state;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getJoin() {
		return join;
	}

	public void setJoin(Date join) {
		this.join = join;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "UserPo [id=" + id + ", name=" + name + ", sex=" + sex + ", phone=" + phone + ", email=" + email
				+ ", address=" + address + ", join=" + join + ", level=" + level + ", state=" + state + "]";
	}

}
