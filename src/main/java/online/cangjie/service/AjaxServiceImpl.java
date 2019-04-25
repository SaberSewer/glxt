package online.cangjie.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import online.cangjie.interfaces.service.AjaxService;
import online.cangjie.po.AdminPo;

@Service
@Transactional
public class AjaxServiceImpl implements AjaxService {

	@Override
	public boolean changePwd(AdminPo admin) {
		// TODO Auto-generated method stub
		
		return false;
	}

}
