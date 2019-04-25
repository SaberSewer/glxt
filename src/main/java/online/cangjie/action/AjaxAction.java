package online.cangjie.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import online.cangjie.interfaces.service.AjaxService;

public class AjaxAction extends ActionSupport{
	@Autowired
	private AjaxService ajaxService;
	
	public void changePassword(){
		
	}
}
