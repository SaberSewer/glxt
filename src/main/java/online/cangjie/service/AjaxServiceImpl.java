package online.cangjie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import online.cangjie.interfaces.dao.AdminDao;
import online.cangjie.interfaces.service.AjaxService;
import online.cangjie.po.AdminPo;

@Service("ajaxService")
@Transactional
public class AjaxServiceImpl implements AjaxService {
	@Autowired
	private AdminDao adminDao;
	
	@Override
	public boolean changePwd(AdminPo admin) {
		// TODO Auto-generated method stub
		
		return adminDao.updatePassword(admin);
	}

	@Override
	public boolean changeInfo(AdminPo admin) {
		// TODO Auto-generated method stub
		return adminDao.updateAdmin(admin);
	}

}
