package list.test2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * List�������й���
 * 
 */
public class ListDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		//
		list.add("hello");
		list.add("world");
		list.add("java");

		list.add(3, "android");
		// list.remove(3);
		System.out.println("get:" + list.get(1));

		System.out.println("list:" + list);
		
		System.out.println("------------");
		// ��������
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		System.out.println("------------");
		// List�ı�������
		for (int i = 0; i < list.size(); i++) {
			String string = (String) list.get(i);
			System.out.println(string);
		}

	}
}
