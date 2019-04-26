package online.cangjie.interfaces.dao;

import java.util.List;

import online.cangjie.po.LoginLogPo;

public interface AdminLogDao {
	public void insertLog(LoginLogPo log);
	
	public List<?> selectLog();
}
