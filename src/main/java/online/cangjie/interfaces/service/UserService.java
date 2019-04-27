package online.cangjie.interfaces.service;

import java.util.List;

import online.cangjie.po.UserPo;

public interface UserService {
	public List<UserPo> getAllInfo();
	
	public boolean insertUser(UserPo user);
	
	public boolean updateUser(UserPo user);
}
