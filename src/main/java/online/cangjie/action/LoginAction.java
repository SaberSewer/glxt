package online.cangjie.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import online.cangjie.interfaces.service.LoginService;
import online.cangjie.po.AdminPo;

public class LoginAction extends ActionSupport {
	private AdminPo admin = new AdminPo();
	private String Code;

	public AdminPo getAdmin() {
		return admin;
	}

	public void setAdmin(AdminPo admin) {
		this.admin = admin;
	}

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	@Autowired
	private LoginService loginService;

	public String login() {
		AdminPo u = loginService.login(admin);
		if (u != null) {
			return "isLogin";
		}
		return "toLogin";
	}

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

}
