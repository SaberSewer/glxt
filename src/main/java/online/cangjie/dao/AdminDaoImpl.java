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
		AdminPo aaa = null;
		try {
			 aaa = list.get(0);
		} catch(IndexOutOfBoundsException e){
			return null;
		}finally {
			session.close();
		}
		return aaa;
	}

	@Override
	public boolean updatePassword(AdminPo admin) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("update AdminPo set password = ? where id = ?");
		query.setParameter(0, admin.getPassword());
		query.setParameter(1, admin.getId());
		int i = query.executeUpdate();
		if(i != 1)
		return false;
		
		return true;
	}

}
