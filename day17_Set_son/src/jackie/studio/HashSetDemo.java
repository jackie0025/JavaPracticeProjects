package jackie.studio;

import java.util.HashSet;
import java.util.Set;

/*
 * Collection
 * 		List:
 * 			���򣬿��ظ�
 * 		Set:
 * 			����Ψһ
 */
public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		
		set.add("hello");
		set.add("world");
		set.add("jackie");
		set.add("hello");
		set.add("world");
		set.add("jackie");
		set.add("hello");
		set.add("world");
		set.add("!!");
		
		for(String string:set){
			System.out.println(string);
			
		}
	}
}
