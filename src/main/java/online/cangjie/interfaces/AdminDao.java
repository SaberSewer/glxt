package online.cangjie.interfaces;

import online.cangjie.po.AdminPo;

public interface AdminDao {
	public AdminPo selectAdminByUserNameAndPwd(AdminPo admin);
}
