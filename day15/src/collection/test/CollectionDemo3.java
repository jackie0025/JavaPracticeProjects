package collection.test;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo3 {

	public static void main(String[] args) {
		//创建集合
		Collection collection=new ArrayList();
		
		//添加元素
		collection.add("hello");
		collection.add("world");
		collection.add("java");
		
		//遍历
		//Object[] toArray()
		Object[] objects=collection.toArray();
		for (Object object : objects) {
			//System.out.println(object);
			//System.out.println(object.length);//没有length方法
			String string=(String)object;
			System.out.println(string+" "+string.length());
		}
	} 

}
