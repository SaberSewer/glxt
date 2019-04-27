package online.cangjie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.cangjie.interfaces.dao.UserDao;
import online.cangjie.interfaces.service.UserService;
import online.cangjie.po.UserPo;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	@Override
	public List<UserPo> getAllInfo() {
		// TODO Auto-generated method stub
		
		return userDao.selectAll();
	}

}
