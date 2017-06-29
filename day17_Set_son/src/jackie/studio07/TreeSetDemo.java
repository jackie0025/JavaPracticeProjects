package jackie.studio07;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Student> treeSet = new TreeSet<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student s1,Student s2){
				// 比较姓名
				int num = s1.getName().compareTo(s2.getName());
				// 如果姓名相同，比较年龄
				int num2 = num == 0 ? s1.getAge() - s2.getAge() : num;
				return num2;
			}
			
		});

		Student student = new Student("Jackie", 18);
		Student student2 = new Student("Lucie", 17);
		Student student3 = new Student("Emma", 19);
		Student student4 = new Student("Anna", 20);
		Student student5 = new Student("Bob", 18);
		Student student6 = new Student("Lucie", 17);
		Student student7 = new Student("Emma", 22);

		treeSet.add(student);
		treeSet.add(student2);
		treeSet.add(student3);
		treeSet.add(student4);
		treeSet.add(student5);
		treeSet.add(student6);
		treeSet.add(student7);

		for (Student stu : treeSet) {
			System.out.println(stu.getName() + "," + stu.getAge());
		}

	}

}
