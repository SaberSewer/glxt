package online.cangjie.interfaces.service;

import online.cangjie.po.AdminPo;
import online.cangjie.po.LoginLogPo;

public interface LoginService {
	public AdminPo login(AdminPo admin);
	
	public void saveLog(LoginLogPo log);
}
