package z.list.test;

import java.util.ArrayList;
import java.util.Iterator;
/*
 * ȥ���ظ�Ԫ��
 */
public class ArrayListDemo {
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

		ArrayList arrayList2=new ArrayList<>();

		
		//ȥ���ظ�Ԫ��
		Iterator iterator=arrayList.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			if (!arrayList2.contains(string)) {
				arrayList2.add(string);
			}
			
		}
		//����
		for(int i=0;i<arrayList2.size();i++){
			String string=(String) arrayList2.get(i);
			System.out.println(string);
		}
		
	}
}
