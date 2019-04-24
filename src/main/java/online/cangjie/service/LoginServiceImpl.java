package online.cangjie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.cangjie.interfaces.dao.AdminDao;
import online.cangjie.interfaces.dao.AdminLogDao;
import online.cangjie.interfaces.service.LoginService;
import online.cangjie.po.AdminPo;
import online.cangjie.po.LoginLogPo;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
	@Autowired
	private AdminDao adminDao;
	@Autowired
	private AdminLogDao adminLogDaoo;

	@Override
	public AdminPo login(AdminPo admin) {

		AdminPo user = adminDao.selectAdminByUserNameAndPwd(admin);
		return user;
	}

	@Override
	public void saveLog(LoginLogPo log) {

		adminLogDaoo.insertLog(log);
	}

}
