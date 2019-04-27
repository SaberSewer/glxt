package online.cangjie.interfaces.dao;

import java.util.List;

import online.cangjie.po.ArticleTagPo;

public interface ArticleTagDao {
	public List selectAllTag();
	
	public boolean insetTag(ArticleTagPo articleTag);
	
	public boolean deleteTag(List<Integer> list);
}
