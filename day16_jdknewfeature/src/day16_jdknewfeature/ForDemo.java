package day16_jdknewfeature;

import java.util.ArrayList;
/*
 * 增强for
 * 其目标不能为null
 */
public class ForDemo {
	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<>();
		arrayList.add("hello");
		arrayList.add("world");
		arrayList.add("java");
		
		for(String string:arrayList){
			System.out.println(string);
		}
		
		int[] is={1,2,3,4};
		for(int i:is){
			System.out.println(i);
		}
//		int[] is2=null;
//		for(int i:is2){
//			System.out.println(i);
//		}
//		java.lang.NullPointerException
	}
}
