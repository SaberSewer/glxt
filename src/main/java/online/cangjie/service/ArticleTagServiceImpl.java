package online.cangjie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.cangjie.interfaces.dao.ArticleTagDao;
import online.cangjie.interfaces.service.ArticleTagService;

@Service("articleTagService")
public class ArticleTagServiceImpl implements ArticleTagService {

	@Autowired
	private ArticleTagDao articleTagDao;

	@Override
	public List getArticleTag() {
		// TODO Auto-generated method stub
		return articleTagDao.selectAllTag();
	}

}
