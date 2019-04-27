package online.cangjie.dao;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import online.cangjie.interfaces.dao.ArticleTagDao;
import online.cangjie.po.ArticleTagPo;

@Service
@Transactional
public class ArticleTagDaoImpl implements ArticleTagDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<ArticleTagPo> selectAllTag() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from ArticleTagPo");
		List<ArticleTagPo> list = query.list();
		session.close();
		return list;
	}

	@Override
	public boolean insetTag(ArticleTagPo articleTag) {
		// TODO Auto-generated method stub
		articleTag.setState(1);
		articleTag.setDate(new Date());
		Session session = sessionFactory.openSession();
		Object obj = session.save(articleTag);
		if (obj != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteTag(List<Integer> list) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("delete ArticleTagPo where id = ?");
		Iterator<?> iterator = list.iterator();
		int i = 0;
		while (iterator.hasNext()) {
			query.setParameter(0, iterator.next());
			i += query.executeUpdate();
		}
		if (i == list.size()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteTagById(Integer id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("delete ArticleTagPo where id = ?");
		query.setParameter(0, id);
		int i = query.executeUpdate();
		if (i == 1) {
			return true;
		}
		return false;
	}

}
