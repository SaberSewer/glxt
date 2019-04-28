package online.cangjie.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import online.cangjie.interfaces.service.UserService;

public class UserAction extends ActionSupport{
	@Autowired
	private UserService userService;
	private List<?> list;

	public String initUser(){
		list = userService.getAllInfo();
		System.out.println(list);
		return "toUser";
	}
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}
	
	
	
}
