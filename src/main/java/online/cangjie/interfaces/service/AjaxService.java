package online.cangjie.interfaces.service;

import online.cangjie.po.AdminPo;
import online.cangjie.po.ArticleTagPo;
import online.cangjie.po.UserPo;

public interface AjaxService {
	public boolean changePwd(AdminPo admin);
	
	public boolean changeInfo(AdminPo admin);
	
	public boolean insetTag(ArticleTagPo articleTag);
	
	public UserPo getUser(Integer user);
	
	public boolean deleteUser(Integer id);
	
	public boolean deleteTag(Integer id);
}
