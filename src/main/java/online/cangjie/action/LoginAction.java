package online.cangjie.action;

import java.util.Date;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import online.cangjie.interfaces.service.LoginService;
import online.cangjie.po.AdminPo;
import online.cangjie.po.LoginLogPo;

public class LoginAction extends ActionSupport {

	private AdminPo admin = new AdminPo();
	private String Code;


	@Autowired
	private LoginService loginService;

	public String login() {
		AdminPo u = loginService.login(admin);
		if (u != null) {
			LoginLogPo log = new LoginLogPo();
			log.setId(u.getId());
			log.setLoginTime(new Date());
			log.setLoginIP(ServletActionContext.getRequest().getLocalAddr());
			log.setUsername(u.getName());
			loginService.saveLog(log);
			Map<String, Object> map = ActionContext.getContext().getSession();
			map.put("user", u);
			map.put("login", true);
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
}
