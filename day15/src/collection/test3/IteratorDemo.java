package collection.test3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Iterator iterator():迭代器，集合的专用遍历方式
 * 	Object next():获取元素
 */
public class IteratorDemo {
	public static void main(String[] args) {
		Collection collection = new ArrayList();

		collection.add("hello");
		collection.add("world");
		collection.add("java");

		// Iterator iterator():迭代器，集合的专用遍历方式
		Iterator iterator = collection.iterator();

		// Object object=iterator.next();
		// System.out.println(object);

		// System.out.println(iterator.next());
		// System.out.println(iterator.next());
		// System.out.println(iterator.next());
		// System.out.println(iterator.next());//NoSuchElementException

		// 判读是否有下一个元素
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
