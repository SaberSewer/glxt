package online.cangjie.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import online.cangjie.interfaces.dao.UserDao;
import online.cangjie.po.UserPo;

@Service
@Transactional
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<UserPo> selectAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from UserPo");
		List<UserPo> list = query.list();
		session.close();
		return list;
	}

	@Override
	public boolean insertUser(UserPo user) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Object obj = session.save(user);
		if (obj != null) {
			return true;
		}
		session.close();
		return false;
	}

	@Override
	public UserPo selectUserById(Integer id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from UserPo where id = ?");
		query.setParameter(0, id);
		List<UserPo> list = query.list();
		session.close();
		return list.get(0);
	}

	@Override
	public boolean updateUser(UserPo user) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		try {
			session.update(user);
		} catch (Exception e) {
			return false;
		} finally {
			session.close();
		}
		return true;
	}

}
