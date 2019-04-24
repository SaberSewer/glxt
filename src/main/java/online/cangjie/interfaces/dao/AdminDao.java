package online.cangjie.interfaces.dao;

import online.cangjie.po.AdminPo;
import online.cangjie.po.LoginLogPo;

public interface AdminDao {
	public AdminPo selectAdminByUserNameAndPwd(AdminPo admin);
}
