package arraylist.test;
/*
 * 存储自定义对象并遍历
 */

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		//create collection object 
		ArrayList arrayList=new ArrayList();
		//create Student object
		Student student=new Student("jacke",18);
		Student student2=new Student("jacy",17);
		Student student3=new Student("Mikky",1);
		Student student4=new Student("Bill",66);
		//add Elements
		arrayList.add(student);
		arrayList.add(student2);
		arrayList.add(student3);
		arrayList.add(student4);
		
		Iterator iterator=arrayList.iterator();
		while (iterator.hasNext()) {
			Student student5=(Student) iterator.next();
			System.out.println(student5.getName()+","+student5.getAge());
		}
		System.out.println("-------------");
		for(int x=0;x<arrayList.size();x++){
			Student student5=(Student) arrayList.get(x);
			System.out.println(student5.getName()+","+student5.getAge());
		}
	}
}

