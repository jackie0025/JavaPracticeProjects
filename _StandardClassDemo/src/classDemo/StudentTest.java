/**
 * 
 */
package classDemo;

/**
 * @author JZ
 *
 */
class Student{
	private String name;
	private int age;
	
	public Student(){
		
	}
	
	public Student(String name,int age){
		this.name =name;
		this.age=age;
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
	
	//output 
	public void show(){
		System.out.println(name+"--"+age);
	}
}
public class StudentTest {
	public static void main(String[] args) {
		//��ʽ1����Ա������ֵ��set������ֵ
		//�޲ι���+setXXX()
		Student student=new Student();
		student.setName("jackie");//���ַ����������
		student.setAge(18);
		//output
		System.out.println(student.getName()+"--"+student.getAge());
		//��ʽ2����Ա������ֵ�����ι��췽����ֵ
		Student student1=new Student("lucie",100);//�����Ӽ�
		//output
		student1.show();		
	}
}
