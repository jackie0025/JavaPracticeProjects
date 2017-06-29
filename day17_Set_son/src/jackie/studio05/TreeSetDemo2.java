package jackie.studio05;

import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		TreeSet<Student> treeSet=new TreeSet<>();
		
		Student student=new Student("Jackie",18);
		Student student2=new Student("Lucie",17);
		Student student3=new Student("Emma",19);
		Student student4=new Student("Anna",20);
		Student student5=new Student("Bob",18);
		Student student6=new Student("Lucie",17);
		Student student7=new Student("Emma",22);
		
		treeSet.add(student);
		treeSet.add(student2);
		treeSet.add(student3);
		treeSet.add(student4);
		treeSet.add(student5);
		treeSet.add(student6);
		treeSet.add(student7);
		
		for(Student stu:treeSet){
			System.out.println(stu.getName()+","+stu.getAge());
		}
	}
}
