package jackie.studio02;

public class Student {
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
//	
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		//return super.hashCode();
//		
//		//return this.name.hashCode()+this.age;
//		//if	this.name.hashCode()=40,age=30
//		//		this.name.hashCode()=20,age=50
//		//so
//		
//		return this.name.hashCode()+this.age*31;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		//return super.equals(obj);
//		if (this==obj) {
//			return true;
//		}
//		if (!(obj instanceof Student)) {
//			return false;
//		}
//		Student student=(Student) obj;
//		return this.name.equals(student.name) && this.age==student.age;
//		
//	}
	/**
	 * 重写hashCode
	 * 因为hashSet.add方法，需要计算哈希值，(这里add是引用对象，必须重写)
	 */

	@Override	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
