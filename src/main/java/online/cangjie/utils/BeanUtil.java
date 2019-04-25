package online.cangjie.utils;

import java.lang.reflect.Field;
import java.util.Map;

public class BeanUtil {
	public static <T> T getBean(Map<String, String> map, T t) throws IllegalArgumentException, IllegalAccessException {
		Class<?> cs = t.getClass();
		Field field[] = cs.getDeclaredFields();
		for (int i = 0; i < field.length; i++) {
			field[i].setAccessible(true);
			switch (field[i].getType().toString()) {
			case "class java.lang.Integer":
				try {
					field[i].set(t, Integer.parseInt(map.get(field[i].getName())));
				} catch (NumberFormatException | NullPointerException e) {
					field[i].set(t, null);
				}
				break;
			case "class java.lang.String":
				field[i].set(t, map.get(field[i].getName()));
				break;
			default:
				continue;
			}
		}
		return t;
	}
}
