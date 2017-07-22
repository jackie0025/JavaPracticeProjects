package jackie.studio02;

import java.lang.reflect.Constructor;

/**
 * ͨ�����䣬��ȡ˽�й��췽����ʹ��
 * @author jackie0025@163.com
 *
 */
public class RefectDemo3 {
	public static void main(String[] args) throws Exception {
		//��ȡ�ֽ����ļ�����
		Class class1= Class.forName("jackie.studio.Person");
		
		//��ȡ˽�й��췽������
		//NoSuchMethodException
		//Constructor constructor=class1.getConstructor(String.class);
		
		
		//IllegalAccessException: Class jackie.studio.Person with modifiers "private"
		Constructor constructor=class1.getDeclaredConstructor(String.class);
		
		//��������
		constructor.setAccessible(true);
		
		//�ø�˽�й��췽����������
		Object object =constructor.newInstance("jakcie");
		
		System.out.println(object);
	}
}
