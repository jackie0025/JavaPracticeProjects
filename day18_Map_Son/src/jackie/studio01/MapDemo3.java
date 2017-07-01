package jackie.studio01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(62000870, "Jackie");
		map.put(62000871, "Bob");
		map.put(62000869, "Lucie");
		map.put(62000469, "Lily");
			
		//遍历
		
		//获取所有键值		
		Set<Integer> set=map.keySet();
		for(int key:set){
			String value=map.get(key);
			System.out.println(key+","+value);
		}
		System.out.println("--------------------");
		//获取所有键值对对象的集合
		Set<Map.Entry<Integer, String>> set2=map.entrySet();
		for(Map.Entry<Integer, String> meEntry:set2){
			int key=meEntry.getKey();
			String value=meEntry.getValue();
			System.out.println(key+","+value);
		}
	}

}
