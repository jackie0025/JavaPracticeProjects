package collection.test;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo3 {

	public static void main(String[] args) {
		//��������
		Collection collection=new ArrayList();
		
		//���Ԫ��
		collection.add("hello");
		collection.add("world");
		collection.add("java");
		
		//����
		//Object[] toArray()
		Object[] objects=collection.toArray();
		for (Object object : objects) {
			//System.out.println(object);
			//System.out.println(object.length);//û��length����
			String string=(String)object;
			System.out.println(string+" "+string.length());
		}
	} 

}
