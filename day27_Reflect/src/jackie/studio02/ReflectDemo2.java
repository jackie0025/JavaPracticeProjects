package jackie.studio02;

import java.lang.reflect.Constructor;

public class ReflectDemo2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class class1=Class.forName("jackie.studio.Person");
		
		Constructor constructor=class1.getConstructor(String.class,int.class,String.class);
		
		Object object=constructor.newInstance("jackie",27,"CTU");
		System.out.println(object);
		
	}

}
