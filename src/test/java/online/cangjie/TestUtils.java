package online.cangjie;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import online.cangjie.po.AdminPo;
import online.cangjie.utils.BeanUtil;

public class TestUtils {
	@Test
	public void testField() throws NumberFormatException, IllegalArgumentException, IllegalAccessException{
		AdminPo admin = new AdminPo();
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", "1");
		map.put("name", "仓颉");
		map.put("username", "cangjie");
		map.put("password", "123456");
		map.put("sex", "1");
		map.put("phone", "13097973841");
		map.put("email", "317060952@qq.com");
		map.put("qq", "317060952");
		map.put("state", "1");
		admin = BeanUtil.getBean(map, admin);
		System.out.println(admin);
	}
	
}
