package generic.test;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 泛型：是一种把类型明确的工作推迟到创建对象或者调用方法的时候才去明确的特殊类型
 * 参数化类型，把类型当成参数传递
 * <数据类型>
 * 此处的数据类型只能是引用类型
 * 
 * 优点：
 * 把运行使其的问题提前到了编译期间
 * 避免了强制类型转换
 * 优化了程序设计，解决了黄色警告线
 */
public class GenericDemo {
	public static void main(String[] args) {

		// ArrayList<E>
		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("hello");
		arrayList.add("world");
		arrayList.add("java");
		// arrayList.add(10);//加入泛型后，提前报错
		// arrayList.add(new Integer(10));

		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}
}
