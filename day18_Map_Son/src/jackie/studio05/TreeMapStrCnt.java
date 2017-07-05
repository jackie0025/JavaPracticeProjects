package jackie.studio05;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapStrCnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Character, Integer> treeMap=new TreeMap<>();
		String str="aaaaabbcdefgasdfg";
		
		char[] cs=str.toCharArray();
		Set<Character> set=treeMap.keySet();
		
		for(char c:cs){
			Integer integer=treeMap.get(c);
			if (integer==null) {
				treeMap.put(c, 1);
			}else {
				integer++;
				treeMap.put(c, integer);
			}
		}
		System.out.println("---");
		for(char key:set){
			int value=treeMap.get(key);
			System.out.println(key+","+value);
		}
	}

}
