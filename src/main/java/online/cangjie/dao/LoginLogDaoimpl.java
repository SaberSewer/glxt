package online.cangjie.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import online.cangjie.interfaces.dao.AdminLogDao;
import online.cangjie.po.LoginLogPo;

@Service
@Transactional
public class LoginLogDaoimpl implements AdminLogDao {

	@Autowired
	public SessionFactory sessionFactory;
	
	public void insertLog(LoginLogPo log) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		session.save(log);
		session.flush();
		session.close();
	}
	
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<LoginLogPo> selectLogById(Integer id){
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from LoginLogPo where id = ?");
		query.setParameter(0, id);
		List<LoginLogPo> list = query.list();
		return list;
	}
	
}
