package jackie.studio04;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		//
		TreeMap<Integer, String> treeMap=new TreeMap<>();
		
		treeMap.put(62000870, "Jackie");
		treeMap.put(62000871, "Bob");
		treeMap.put(62000869, "Lucie");
		treeMap.put(62000469, "Lily");
		treeMap.put(62000469, "Haah");
			
		
		Set<Integer> set=treeMap.keySet();
		for(Integer key:set){
			String value=treeMap.get(key);
			System.out.println(key+","+value);
		}
	}
}
