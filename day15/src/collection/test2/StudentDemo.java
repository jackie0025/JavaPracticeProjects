package collection.test2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * �ü��ϴ洢5��ѧ�����󣬲�����
 */
public class StudentDemo {

	public static void main(String[] args) {
		// ��������
		Collection collection = new ArrayList();
		// ����ѧ������
		Student student = new Student("A", 18);
		Student student2 = new Student("B", 19);
		Student student3 = new Student("C", 20);
		Student student4 = new Student("D", 21);
		Student student5 = new Student("E", 22);
		Student student6 = new Student("F", 23);
		// ��ѧ����ӵ�����
		collection.add(student);
		collection.add(student2);
		collection.add(student3);
		collection.add(student4);
		collection.add(student5);
		collection.add(student6);
		
		
		// �Ѽ���ת������
		Object[] objects = collection.toArray();
		for (Object object : objects) {
			// System.out.println(object);//��ӡ�������ǵ�ֵַ
			Student student7 = (Student) object;
			System.out.println(student7.getName()+" "+student7.getAge());
		}
		
		System.out.println("---------------");
	
		Iterator iterator=collection.iterator();
		while (iterator.hasNext()) {
			//System.out.println(iterator.next());//��ֵַ
			Student student0=(Student)iterator.next();
			System.out.println(student0.getName()+" "+student0.getAge());
		}
		System.out.println("---------------");
		//for ��д		
		for(Iterator iterator2=collection.iterator();iterator2.hasNext();){
			Student student0=(Student)iterator2.next();
			System.out.println(student0.getName()+" "+student0.getAge());
		}
	}

}
