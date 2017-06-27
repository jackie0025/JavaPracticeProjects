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
		//方式1给成员变量赋值，set方法赋值
		//无参构造+setXXX()
		Student student=new Student();
		student.setName("jackie");//这种方法，更灵活
		student.setAge(18);
		//output
		System.out.println(student.getName()+"--"+student.getAge());
		//方式2给成员变量赋值，带参构造方法赋值
		Student student1=new Student("lucie",100);//这样子简单
		//output
		student1.show();		
	}
}
