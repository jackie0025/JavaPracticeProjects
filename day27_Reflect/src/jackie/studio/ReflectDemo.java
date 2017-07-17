package jackie.studio;

public class ReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException {
		Person person=new Person();
		Class class1=person.getClass();
		
		Person person2=new Person();
		Class class2=person2.getClass();
		
		System.out.println(person==person2);
		System.out.println(class1==class2);
		
		Class class3=Person.class;
		System.out.println(class1==class3);
		
		Class class4=Class.forName("jackie.studio.Person");
		System.out.println(class1==class4);
	}
}
