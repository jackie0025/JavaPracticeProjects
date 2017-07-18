package jackie.studio02;

import java.lang.reflect.Constructor;

import jackie.studio.Person;

public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		Class class1= Class.forName("jackie.studio.Person");
		// //Constructor[] constructors= class1.getConstructors();
		// Constructor[] constructors= class1.getDeclaredConstructors();
		// for(Constructor constructor:constructors){
		// System.out.println(constructor);
		// }
		
		Constructor constructor=class1.getConstructor();
		
		Object object=constructor.newInstance();
		
		System.out.println(object);
		
		Person person=(Person) object;
		person.show(); 
		
	}
}
