package online.cangjie.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import online.cangjie.interfaces.dao.AdminDao;
import online.cangjie.po.AdminPo;

@Transactional
@Service
public class AdminDaoImpl implements AdminDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
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
		} catch (IndexOutOfBoundsException e) {
			return null;
		} finally {
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
		if (i != 1)
			return false;

		return true;
	}

	public boolean updateAdmin(AdminPo admin) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("update AdminPo set phone = ? , sex = ?, email = ?, qq = ?");
		query.setParameter(0, admin.getPhone());
		query.setParameter(1, admin.getSex());
		query.setParameter(2, admin.getEmail());
		query.setParameter(3, admin.getQq());
		int i = query.executeUpdate();
		if(i == 1){
			return true;
		}
		return false;
	}

}
