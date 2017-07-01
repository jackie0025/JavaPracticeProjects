package jackie.studio03;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<String, String> hMap=new LinkedHashMap<>();
		
		hMap.put("6200870", "hello");
		hMap.put("6200871", "java");
		hMap.put("6200872", "world");
		hMap.put("6200870", "javeee");
		hMap.put("6200872", "android");
		
		Set<String> set=hMap.keySet();
		for(String key:set){
			String value=hMap.get(key);
			System.out.println(key+","+value);
		}
	}
}
