package online.cangjie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import online.cangjie.interfaces.dao.AdminDao;
import online.cangjie.interfaces.dao.AdminLogDao;
import online.cangjie.interfaces.service.AjaxService;
import online.cangjie.po.AdminPo;
import online.cangjie.po.LoginLogPo;

@Service("ajaxService")
@Transactional
public class AjaxServiceImpl implements AjaxService {
	@Autowired
	private AdminDao adminDao;
	@Autowired
	private AdminLogDao adminLogDao;
	
	
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

	@Override
	public List<LoginLogPo> getLog(Integer pageNo, Integer num) {
		// TODO Auto-generated method stub
		List<LoginLogPo> list = adminLogDao.selectLog();	
		return list.subList(pageNo * num, pageNo * num + num);
	}

}
