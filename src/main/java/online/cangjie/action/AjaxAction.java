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
import online.cangjie.po.ArticleTagPo;
import online.cangjie.po.UserPo;
import online.cangjie.utils.BeanUtil;
import online.cangjie.utils.JSONUtil;

public class AjaxAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer pageNo = 1;
	private Integer pageSize = 10;
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
			if (admin.getPassword().equals(map.get("oldpwd"))) {
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

	public void changeInf() throws IOException, IllegalArgumentException, IllegalAccessException {
		JSONObject json = new JSONObject();
		boolean tag = false;
		Map<String, String> map = JSONUtil.getMap(request.getReader());
		AdminPo admin = BeanUtil.getBean(map, new AdminPo());
		tag = ajaxService.changeInfo(admin);
		if (tag) {
			ActionContext.getContext().getSession().put("user", admin);
		}
		json.put("tag", Boolean.toString(tag));
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		response.getWriter().print(json.toString());
	}

	public void insertTag() throws IOException, IllegalArgumentException, IllegalAccessException {
		JSONObject json = new JSONObject();
		boolean tag = false;
		Map<String, String> map = JSONUtil.getMap(request.getReader());
		ArticleTagPo articleTag = BeanUtil.getBean(map, new ArticleTagPo());
		tag = ajaxService.insetTag(articleTag);
		json.put("tag", Boolean.toString(tag));
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		response.getWriter().print(json.toString());
	}

	public void getUserInfo() throws IOException{
		JSONObject json = new JSONObject();
		boolean tag = false;
		Map<String, String> map = JSONUtil.getMap(request.getReader());
		
	}
	
	public void deleteUser() throws IOException, IllegalArgumentException, IllegalAccessException{
		JSONObject json = new JSONObject();
		boolean tag = false;
		Map<String, String> map = JSONUtil.getMap(request.getReader());
		UserPo user = BeanUtil.getBean(map, new UserPo());
		tag = ajaxService.deleteUser(user.getId());
		json.put("tag", Boolean.toString(tag));
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		response.getWriter().print(json.toString());
	}
	
	public void deleteTagById() throws IOException, IllegalArgumentException, IllegalAccessException{
		JSONObject json = new JSONObject();
		boolean tag = false;
		Map<String, String> map = JSONUtil.getMap(request.getReader());
		tag = ajaxService.deleteTag(Integer.parseInt(map.get("id")));
		json.put("tag", Boolean.toString(tag));
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		response.getWriter().print(json.toString());
	}
	
	public void addUser() throws IOException, IllegalArgumentException, IllegalAccessException{
		JSONObject json = new JSONObject();
		boolean tag = false;
		Map<String, String> map = JSONUtil.getMap(request.getReader());
		UserPo user = BeanUtil.getBean(map, new UserPo());
		tag = ajaxService.addUser(user);
		json.put("tag", Boolean.toString(tag));
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		response.getWriter().print(json.toString());
	}

	public AjaxService getAjaxService() {
		return ajaxService;
	}

	public void setAjaxService(AjaxService ajaxService) {
		this.ajaxService = ajaxService;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

}
