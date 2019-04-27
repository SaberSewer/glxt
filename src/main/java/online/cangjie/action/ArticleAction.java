package online.cangjie.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import online.cangjie.interfaces.service.ArticleTagService;

/**
 * 
 * @author 仓颉
 * 文章相关的Action
 */
public class ArticleAction extends ActionSupport{
	@Autowired
	private ArticleTagService articleTagService;
	private List<?> list;
	//初始化页面
	public String getTag(){
		list = articleTagService.getArticleTag();
		ActionContext.getContext().getSession().put("tag", list);
		return "tag";
	}
	
	public String initList(){
		this.list = articleTagService.getArticleTag();
		ActionContext.getContext().put("taglist", list);
		return "list";
	}
	
	public ArticleTagService getArticleTagService() {
		return articleTagService;
	}

	public void setArticleTagService(ArticleTagService articleTagService) {
		this.articleTagService = articleTagService;
	}

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}
	

}
