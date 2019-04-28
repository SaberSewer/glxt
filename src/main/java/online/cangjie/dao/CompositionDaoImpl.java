package online.cangjie.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import online.cangjie.interfaces.dao.CompositionDao;
import online.cangjie.po.CompositionPo;

@Service
@Transactional
public class CompositionDaoImpl implements CompositionDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public boolean insertComposition(CompositionPo composition) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		session.save(composition);
		return false;
		
	}

}
