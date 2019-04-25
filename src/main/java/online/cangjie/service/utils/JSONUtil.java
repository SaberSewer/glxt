package online.cangjie.service.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class JSONUtil {
	public static Map<String, String> getMap(BufferedReader reader){
		Map<String, String> map = new HashMap<String, String>();
		try {
			String str[] = reader.readLine().split("&");;
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
}