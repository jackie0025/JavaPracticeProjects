package jackie.studio02;

import java.lang.reflect.Constructor;

/**
 * 通过反射，获取私有构造方法并使用
 * @author jackie0025@163.com
 *
 */
public class RefectDemo3 {
	public static void main(String[] args) throws Exception {
		//获取字节码文件对象
		Class class1= Class.forName("jackie.studio.Person");
		
		//获取私有构造方法对象
		//NoSuchMethodException
		//Constructor constructor=class1.getConstructor(String.class);
		
		
		//IllegalAccessException: Class jackie.studio.Person with modifiers "private"
		Constructor constructor=class1.getDeclaredConstructor(String.class);
		
		//暴力访问
		constructor.setAccessible(true);
		
		//用该私有构造方法创建对象
		Object object =constructor.newInstance("jakcie");
		
		System.out.println(object);
	}
}
