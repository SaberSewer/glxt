package online.cangjie;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import online.cangjie.interfaces.dao.AdminDao;
import online.cangjie.po.AdminPo;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class TestSpring {
	@Autowired
	private AdminDao adminDao;
	
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
		System.out.println("aaaaa");
	}
}
