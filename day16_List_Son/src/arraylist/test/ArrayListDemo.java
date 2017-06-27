package arraylist.test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList();
		arrayList.add("hello");
		arrayList.add("world");
		arrayList.add("java");
		
		//±éÀú
		Iterator iterator=arrayList.iterator();
		while (iterator.hasNext()) {
			// Object object = (Object) iterator.next();
			// System.out.println(object);
			String string=(String)iterator.next();
			System.out.println(string);
		}
		
		System.out.println("---------------");
		for(int i=0;i<arrayList.size();i++){
			String string=(String)arrayList.get(i);
			System.out.println(string);
		}
		
	}
}
