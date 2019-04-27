package online.cangjie.interfaces.service;

import java.util.List;

import online.cangjie.po.AdminPo;
import online.cangjie.po.ArticleTagPo;
import online.cangjie.po.LoginLogPo;

public interface AjaxService {
	public boolean changePwd(AdminPo admin);
	
	public boolean changeInfo(AdminPo admin);
	
	public boolean insetTag(ArticleTagPo articleTag);
}
