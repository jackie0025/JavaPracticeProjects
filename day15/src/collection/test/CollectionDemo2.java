package collection.test;

import java.util.ArrayList;
import java.util.Collection;

/*
 * boolean addAll(Collection c):添加一个集合的元素
 * boolean removeAll(Collection c):移除一个集合的元素
 * 
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		// 创建集合
		Collection collection = new ArrayList();
		collection.add("abc1");
		collection.add("abc2");
		collection.add("abc3");
		collection.add("abc4");
		// 创建集合
		Collection collection2 = new ArrayList();
		collection2.add("abc1");
		collection2.add("abc2");
		collection2.add("abc3");
		collection2.add("abc4");
		collection2.add("abc5");
		collection2.add("abc6");
		collection2.add("abc7");
		collection2.add("abc8");

		// 添加一个集合的元素
		// System.out.println("addAll:"+collection.addAll(collection2));
		
		// 只要有一个元素移除了，就返回true
		// System.out.println("removeAll:"+collection.removeAll(collection2));
		
		// 只要包含所有的元素才叫包含
		// System.out.println("containsAll:"+collection.containsAll(collection2));
		
		// A对B做交集，最终的结果保存在A中，B不变
		// 返回结果表示A是否发生改变
		System.out.println("retainAll:" + collection.retainAll(collection2));
		
		System.out.println("collection:" + collection);
		System.out.println("collection2:" + collection2);

	}
}
