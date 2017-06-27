package generic.test5;

import java.util.ArrayList;
import java.util.Collection;
/*
 * ���͸߼�---ͨ���
 * ����
 * �� extends E:
 * ? super E:
 */
public class GenericDemo {
	public static void main(String[] args) {
		// ������ȷЩ��ʱ��ǰ�����һ��
		Collection<Object> collection = new ArrayList<Object>();
		// Collection<Object> collection2=new ArrayList<Animal>();
		// Collection<Object> collection3=new ArrayList<Dog>();
		// Collection<Object> collection4=new ArrayList<Cat>();
		// ? ��ʾ��������Ͷ��ǿ��Ե�
		Collection<?> collection5 = new ArrayList<Object>();
		Collection<?> collection6 = new ArrayList<Animal>();
		Collection<?> collection7 = new ArrayList<Dog>();
		Collection<?> collection8 = new ArrayList<Cat>();

		// ? extends E,�����޶����޶�E��������
		// Collection<? extends Animal> collection9=new ArrayList<Object>();
		Collection<? extends Animal> collection10 = new ArrayList<Animal>();
		Collection<? extends Animal> collection11 = new ArrayList<Dog>();
		Collection<? extends Animal> collection12 = new ArrayList<Cat>();

		// ? super E,�����޶����޶�E��������
		Collection<? super Animal> collection13 = new ArrayList<Object>();
		Collection<? super Animal> collection14 = new ArrayList<Animal>();
		// Collection<? super Animal> collection15=new ArrayList<Dog>();
		// Collection<? super Animal> collection16=new ArrayList<Cat>();
	}
}

class Animal {

}

class Dog extends Animal {

}

class Cat extends Animal {

}