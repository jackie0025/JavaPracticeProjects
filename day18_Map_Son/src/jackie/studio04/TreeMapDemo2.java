package jackie.studio04;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Student, String> treeMap = new TreeMap<>(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
//				int num = o1.getAge() - o2.getAge();
//				int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
				int num = o1.getName().compareTo(o2.getName());
				int num2 = num == 0 ? o1.getAge() - o2.getAge(): num;
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

		treeMap.put(student, "中国");
		treeMap.put(student2, "美国");
		treeMap.put(student3, "法国");
		treeMap.put(student4, "德国");
		treeMap.put(student5, "英国");
		treeMap.put(student6, "俄国");
		treeMap.put(student7, "中国");

		Set<Student> set = treeMap.keySet();
		for (Student key : set) {
			String value = treeMap.get(key);
			System.out.println(key.getName() + "," + key.getAge() + "," + value);
		}
	}

}
