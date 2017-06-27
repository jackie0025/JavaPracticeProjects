package generic.test2;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {
	public static void main(String[] args) {
		//create Collection object
		//JDK7�������ԣ������ƶ�//new ArrayList<>();
		//ArrayList<Student> arrayList=new ArrayList<>();
		///��������ô����Ϊ�˼����ԣ���д��
		ArrayList<Student> arrayList=new ArrayList<Student>();
		
		//create element object
		Student student=new Student("A",18);
		Student student2=new Student("B",19);
		Student student3=new Student("C",20);
		Student student4=new Student("D",21);
		
		arrayList.add(student);
		arrayList.add(student2);
		arrayList.add(student3);
		arrayList.add(student4);
		//����
		Iterator<Student> iterator=arrayList.iterator();
		while (iterator.hasNext()) {
			Student student5 = (Student) iterator.next();
			System.out.println(student5.getName()+" "+student5.getAge());
		}
		System.out.println("----------------");
		//����
		for (int i = 0; i < arrayList.size(); i++) {
			Student student5=arrayList.get(i);
			System.out.println(student5.getName()+" "+student5.getAge());
		}
	}
}
