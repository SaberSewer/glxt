package online.cangjie.interfaces.dao;

import online.cangjie.po.AdminPo;

public interface AdminDao {
	public AdminPo selectAdminByUserNameAndPwd(AdminPo admin);
}
