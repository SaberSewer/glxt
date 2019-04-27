package online.cangjie.interfaces.dao;

import java.util.List;

import online.cangjie.po.UserPo;

public interface UserDao {
	public List<UserPo> selectAll();
	
	public boolean insertUser(UserPo user);
	
	public UserPo selectUserById(Integer id);
	
	public boolean updateUser(UserPo user);
}
