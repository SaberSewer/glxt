package online.cangjie.interfaces.dao;

import java.util.List;

import online.cangjie.po.UserPo;

public interface UserDao {
	public List<UserPo> selectAll();
}
