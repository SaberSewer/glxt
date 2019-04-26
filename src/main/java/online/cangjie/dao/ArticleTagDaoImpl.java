package online.cangjie.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import online.cangjie.interfaces.dao.ArticleTagDao;

@Service
@Transactional
public class ArticleTagDaoImpl implements ArticleTagDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<?> selectAllTag() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from ArticleTagPo");
		List<?> list = query.list();
		
		return list;
	}
	
}
