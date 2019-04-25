package online.cangjie.action;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONObject;
import online.cangjie.interfaces.service.AjaxService;
import online.cangjie.po.AdminPo;
import online.cangjie.service.utils.BeanUtil;
import online.cangjie.service.utils.JSONUtil;

public class AjaxAction extends ActionSupport {
	@Autowired
	private AjaxService ajaxService;

	private HttpServletRequest request = ServletActionContext.getRequest();
	private HttpServletResponse response = ServletActionContext.getResponse();

	public void changePassword() throws IOException {
		JSONObject json = new JSONObject();
		boolean tag = false;
		try {
			Map<String, String> map = JSONUtil.getMap(request.getReader());
			System.out.println(map);
			Map<String, Object> session = ActionContext.getContext().getSession();
			AdminPo admin = (AdminPo) session.get("user");
			System.out.println(session);
			if(admin.getPassword().equals(map.get("oldpwd"))){
				admin.setPassword(map.get("pwd"));
				tag = ajaxService.changePwd(admin);
				session.clear();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		json.put("tag", Boolean.toString(tag));
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		response.getWriter().print(json.toString());
	}
	
	public void changeInf() throws IOException, IllegalArgumentException, IllegalAccessException{
		JSONObject json = new JSONObject();
		boolean tag = false;
		Map<String, String> map = JSONUtil.getMap(request.getReader());
		AdminPo admin = BeanUtil.getBean(map, new AdminPo());
	}

	public AjaxService getAjaxService() {
		return ajaxService;
	}

	public void setAjaxService(AjaxService ajaxService) {
		this.ajaxService = ajaxService;
	}

}
