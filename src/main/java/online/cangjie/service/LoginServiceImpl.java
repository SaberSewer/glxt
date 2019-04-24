package online.cangjie.service;

import org.springframework.beans.factory.annotation.Autowired;

import online.cangjie.interfaces.dao.AdminDao;
import online.cangjie.interfaces.service.LoginService;
import online.cangjie.po.AdminPo;

public class LoginServiceImpl implements LoginService {
	@Autowired
	private AdminDao adminDao;
	
	@Override
	public AdminPo login(AdminPo admin) {
		// TODO Auto-generated method stub
		AdminPo user = adminDao.selectAdminByUserNameAndPwd(admin);
		return user;
	}

}
