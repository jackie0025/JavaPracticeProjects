package jackie.studio05;

/*
 * Ҫ���ܹ�������Ȼ���򣬾ͱ���ʵ����Ȼ����ӿ�
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

		// �Ƚ�����
		// int num = this.age - o.age;
		// // ��Ҫ����
		// // ���������ͬ,�Ƚ�����
		// int num2 = num == 0 ? this.name.compareTo(o.name) : num;
		// return num2;

		// �Ƚ�����
		int num = this.name.compareTo(o.name);
		// ���������ͬ���Ƚ�����
		int num2 = num == 0 ? this.age - o.age : num;
		return num2;
	}
}
