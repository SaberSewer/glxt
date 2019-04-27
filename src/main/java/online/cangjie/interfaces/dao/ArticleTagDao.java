package online.cangjie.interfaces.dao;

import java.util.List;

import online.cangjie.po.ArticleTagPo;

public interface ArticleTagDao {
	public List<ArticleTagPo> selectAllTag();
	
	public boolean insetTag(ArticleTagPo articleTag);
	
	public boolean deleteTag(List<Integer> list);
	
	public boolean deleteTagById(Integer id);
}
