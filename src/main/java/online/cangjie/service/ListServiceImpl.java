package online.cangjie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.cangjie.interfaces.dao.AdminLogDao;
import online.cangjie.interfaces.service.ListService;
import online.cangjie.po.LoginLogPo;

@Service("listService")
public class ListServiceImpl implements ListService {
	@Autowired
	private AdminLogDao adminLogDao;

	@Override
	public List<LoginLogPo> getLogBylist() {

		return adminLogDao.selectLog();
	}

}
