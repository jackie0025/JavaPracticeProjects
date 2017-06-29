package jackie.studio05;

/*
 * 要想能够进行自然排序，就必须实现自然排序接口
 */
public class Student implements Comparable<Student> {
	private String name;
	private int age;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		// return 0;

		// 比较年龄
		// int num = this.age - o.age;
		// // 次要条件
		// // 如果年龄相同,比较姓名
		// int num2 = num == 0 ? this.name.compareTo(o.name) : num;
		// return num2;

		// 比较姓名
		int num = this.name.compareTo(o.name);
		// 如果姓名相同，比较年龄
		int num2 = num == 0 ? this.age - o.age : num;
		return num2;
	}
}
