package obejectTest;

public class Student {
	/**
	 * 封装演示
	 * private 私有化变量，隐藏对象的属性和实现细节
	 * 对外提供公共访问方式
	 */
	String name;
	private int age;
	/**
	 * @param age
	 */
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		if (age<0||age>120) {
			System.out.println("wrong age assignment");		
		}else {
			this.age = age;
		}
	}
	
	public void show(){
		System.out.println("name: "+name);
		System.out.println("age: "+age);
	}

}
