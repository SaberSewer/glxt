package online.cangjie.action;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import online.cangjie.interfaces.service.AjaxService;
import online.cangjie.service.utils.JSONUtil;

public class AjaxAction extends ActionSupport{
	@Autowired
	private AjaxService ajaxService;
	
	HttpServletRequest request = ServletActionContext.getRequest();
	HttpServletResponse response = ServletActionContext.getResponse();
	public void changePassword(){
		try {
			Map<String, String> map = JSONUtil.getMap(request.getReader());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
