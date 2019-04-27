package online.cangjie;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import net.sf.json.JSONObject;
import online.cangjie.interfaces.dao.AdminDao;
import online.cangjie.interfaces.dao.AdminLogDao;
import online.cangjie.interfaces.dao.ArticleTagDao;
import online.cangjie.po.AdminPo;
import online.cangjie.po.ArticleTagPo;
import online.cangjie.po.LoginLogPo;
import online.cangjie.utils.JSONUtil;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class TestSpring {
	@Autowired
	private AdminDao adminDao;
	@Autowired
	private AdminLogDao adminLogDao;
	@Autowired
	private ArticleTagDao articleTagDao;
	
	@Test
	public void testSpring(){
		AdminPo admin = new AdminPo();
		admin.setUsername("cangjie");
		admin.setPassword("123456");
		AdminPo admin1 = adminDao.selectAdminByUserNameAndPwd(admin);
		System.out.println(admin1);
	}
	
	@Test
	public void sss(){
		LoginLogPo log = new LoginLogPo(1, "cangjie", new Date(), "192", "192");
		adminLogDao.insertLog(log);
	}
	
	@Test
	public void testUpdatePWD(){
		AdminPo admin = new AdminPo();
		admin.setId(1);
		admin.setPassword("123");
		adminDao.updatePassword(admin);
		
	}
	
	@Test
	public void testListUtil(){
		List<LoginLogPo> list = adminLogDao.selectLog();
		JSONObject json = JSONUtil.listToJSON(list);
		System.out.println(json.toString());
	}
	
	@Test
	public void testInsetHql(){
		ArticleTagPo articleTag = new ArticleTagPo();
		articleTag.setName("hahaha");
		articleTag.setPreson("xxxxxx");
		System.out.println(articleTagDao.insetTag(articleTag));
	}
	
	@Test
	public void testDeleteHQL(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		System.out.println(articleTagDao.deleteTag(list));
	}
}
