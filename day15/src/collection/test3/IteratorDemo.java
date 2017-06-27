package collection.test3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Iterator iterator():�����������ϵ�ר�ñ�����ʽ
 * 	Object next():��ȡԪ��
 */
public class IteratorDemo {
	public static void main(String[] args) {
		Collection collection = new ArrayList();

		collection.add("hello");
		collection.add("world");
		collection.add("java");

		// Iterator iterator():�����������ϵ�ר�ñ�����ʽ
		Iterator iterator = collection.iterator();

		// Object object=iterator.next();
		// System.out.println(object);

		// System.out.println(iterator.next());
		// System.out.println(iterator.next());
		// System.out.println(iterator.next());
		// System.out.println(iterator.next());//NoSuchElementException

		// �ж��Ƿ�����һ��Ԫ��
		// if (iterator.hasNext()) {
		//
		// }

		while (iterator.hasNext()) {
			// System.out.println(iterator.next());
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}
}
