package obejectTest;

public class StudentDemo {

	public static void main(String[] args) {
		//create class student
		System.out.println("----Initialization------");
		Student student=new Student();
		student.show();
		System.out.println("-----end-----");
		/*
		//variable assignment
		System.out.println("-----correct variable assignment-----");
		student.name="jackie";
		student.age=18;
		student.show();
		System.out.println("-----end-----");
		
		//variable assignment
		System.out.println("-----encapsulation variable assignment-----");
		student.name="jackie";
		student.age=-18;//wrong//��private���������ĸ�ֵ
		student.show();
		System.out.println("-----end-----");
		*/
		//variable assignment
		System.out.println("-----wrong variable assignment-----");
		student.setName("jackie");
		student.setAge(-18);//��װ����encapsulation test
		student.show();
		System.out.println("-----end-----");
		
		
	}

}
