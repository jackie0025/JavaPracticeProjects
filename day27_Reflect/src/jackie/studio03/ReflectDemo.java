package jackie.studio03;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		// 获取字节码文件对象
		Class class1 = Class.forName("jackie.studio.Person");

		// 获取所有的成员变量
		// Field[] fields=class1.getFields();
		Field[] fields = class1.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
		}

		Constructor constructor = class1.getConstructor();
		Object obj = constructor.newInstance();
		System.out.println(obj);
		// 获取单个的成员变量
		// address
		Field addressField = class1.getField("address");
		addressField.set(obj, "成都");
		System.out.println(obj);
		// address
		Field nameField = class1.getDeclaredField("name");
		nameField.setAccessible(true);
		nameField.set(obj, "Jackie");
		System.out.println(obj);

	}
}
