package collection.test2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 用集合存储5个学生对象，并遍历
 */
public class StudentDemo {

	public static void main(String[] args) {
		// 创建集合
		Collection collection = new ArrayList();
		// 创建学生对象
		Student student = new Student("A", 18);
		Student student2 = new Student("B", 19);
		Student student3 = new Student("C", 20);
		Student student4 = new Student("D", 21);
		Student student5 = new Student("E", 22);
		Student student6 = new Student("F", 23);
		// 把学生添加到集合
		collection.add(student);
		collection.add(student2);
		collection.add(student3);
		collection.add(student4);
		collection.add(student5);
		collection.add(student6);
		
		
		// 把集合转成数组
		Object[] objects = collection.toArray();
		for (Object object : objects) {
			// System.out.println(object);//打印出来的是地址值
			Student student7 = (Student) object;
			System.out.println(student7.getName()+" "+student7.getAge());
		}
		
		System.out.println("---------------");
	
		Iterator iterator=collection.iterator();
		while (iterator.hasNext()) {
			//System.out.println(iterator.next());//地址值
			Student student0=(Student)iterator.next();
			System.out.println(student0.getName()+" "+student0.getAge());
		}
		System.out.println("---------------");
		//for 改写		
		for(Iterator iterator2=collection.iterator();iterator2.hasNext();){
			Student student0=(Student)iterator2.next();
			System.out.println(student0.getName()+" "+student0.getAge());
		}
	}

}
