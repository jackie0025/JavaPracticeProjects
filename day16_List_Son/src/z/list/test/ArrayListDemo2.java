package z.list.test;

import java.util.ArrayList;
import java.util.Iterator;
/*
 * 去掉重复元素
 */
public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList<>();
		arrayList.add("hello");
		arrayList.add("world");
		arrayList.add("java");
		arrayList.add("hello");
		arrayList.add("hello");
		arrayList.add("world");
		arrayList.add("hello");
		arrayList.add("hello");
		arrayList.add("java");
		
		for(int i=0;i<arrayList.size()-1;i++){
			for(int j=i+1;j<arrayList.size();j++){
				if (arrayList.get(i).equals(arrayList.get(j))) {
					arrayList.remove(j);
					j--;//回到补位的那个元素
				}
			}
		}
		for(int i=0;i<arrayList.size();i++){
			String string=(String)arrayList.get(i);
			System.out.println(string);
		}
	
	}
}
