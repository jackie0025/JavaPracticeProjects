package obejectTest;

public class Student {
	/**
	 * ��װ��ʾ
	 * private ˽�л����������ض�������Ժ�ʵ��ϸ��
	 * �����ṩ�������ʷ�ʽ
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
