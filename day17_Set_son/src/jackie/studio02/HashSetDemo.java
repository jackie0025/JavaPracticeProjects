package jackie.studio02;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO 创建集合对象
		HashSet<Student> hashSet=new HashSet<>();
		
		Student student=new Student("jackie",26);
		Student student2=new Student("bob",50);
		Student student3=new Student("lily",18);
		Student student4=new Student("lucie",17);
		Student student5=new Student("jackie",18);
		Student student6=new Student("jackie",18);
		Student student7=new Student("jackie",26);
		hashSet.add(student);
		hashSet.add(student2);
		hashSet.add(student3);
		hashSet.add(student4);
		hashSet.add(student5);
		hashSet.add(student6);
		hashSet.add(student7);
		
		for(Student student8:hashSet){
			System.out.println(student8.getName()+","+student8.getAge());
		}
	}

}
