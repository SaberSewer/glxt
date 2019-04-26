package online.cangjie.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

public class JSONUtil {
	public static Map<String, String> getMap(BufferedReader reader) {
		Map<String, String> map = new HashMap<String, String>();
		try {
			String str[] = reader.readLine().split("&");
			;
			for (int i = 0; i < str.length; i++) {
				String property[] = str[i].split("=");
				map.put(property[0], property[1]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}

	public static JSONObject listToJSON(List<?> list) {
		JSONObject json = new JSONObject();
		int x = 1;
		Iterator<?> iterator = list.iterator();
		while (iterator.hasNext()) {
			Object object = iterator.next();
			Class<?> cs = object.getClass();
			Field field[] = cs.getDeclaredFields();
			JSONObject js = new JSONObject();
			for (int i = 0; i < field.length; i++) {
				field[i].setAccessible(true);
				try {
					Object obj = field[i].get(object);
					js.put(field[i].getName(), obj.toString());
				} catch (IllegalArgumentException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			json.put(x++, js);
		}
		return json;
	}
}