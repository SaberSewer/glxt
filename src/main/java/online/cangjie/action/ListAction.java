package online.cangjie.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import online.cangjie.interfaces.service.ListService;
import online.cangjie.po.LoginLogPo;

public class ListAction extends ActionSupport {
	@Autowired
	private ListService listService;
	
	private List<?> list;
	public String toInfo(){
		list = listService.getLogBylist();
		
		return "admin_info";
	}

	public ListService getListService() {
		return listService;
	}

	public void setListService(ListService listService) {
		this.listService = listService;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}
}
