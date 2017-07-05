package jackie.studio05;

import java.util.HashMap;
import java.util.Set;
/*
 * HashMap÷–”–HashMap
 * 
 */
public class HashMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, HashMap<String, Integer>> hashMap=new HashMap<>();
		
		//
		HashMap<String, Integer> basicClassMap=new HashMap<>();
		basicClassMap.put("jackie", 22);
		basicClassMap.put("lucie", 21);
		//
		hashMap.put("basic", basicClassMap);
		
		
		//
		HashMap<String, Integer> advancedClassMap=new HashMap<>();
		advancedClassMap.put("bob", 18);
		advancedClassMap.put("lily", 17);
		hashMap.put("advanced", advancedClassMap);
		
		//
		Set<String> set=hashMap.keySet();
		for(String key:set){
			System.out.println("----------"+key+"----------");
			//System.out.println("----------"+hashMap.get(key)+"----------");
			HashMap<String, Integer> valueMap=hashMap.get(key);
			Set<String> setClass=valueMap.keySet();
			for(String keyClass:setClass){
				Integer value=valueMap.get(keyClass);
				System.out.println(keyClass+","+value);
			}
		}
		
	}

}
