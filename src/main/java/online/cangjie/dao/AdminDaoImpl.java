package online.cangjie.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.cangjie.interfaces.dao.AdminDao;
import online.cangjie.po.AdminPo;

@Service
public class AdminDaoImpl implements AdminDao {

	@Autowired
	private SessionFactory sessionFactory;

	public AdminPo selectAdminByUserNameAndPwd(AdminPo admin) {
		// TODO 通过用户名和密码查询
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from AdminPo where username = ? and password = ?");
		query.setParameter(0, admin.getUsername());
		query.setParameter(1, admin.getPassword());
		List<AdminPo> list = query.list();
		try {

		} finally {
			session.close();
		}
		return list.get(0);
	}

}
