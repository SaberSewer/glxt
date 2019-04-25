package online.cangjie;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import online.cangjie.interfaces.dao.AdminDao;
import online.cangjie.interfaces.dao.AdminLogDao;
import online.cangjie.po.AdminPo;
import online.cangjie.po.LoginLogPo;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class TestSpring {
	@Autowired
	private AdminDao adminDao;
	@Autowired
	private AdminLogDao adminLogDao;
	
	
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
}
