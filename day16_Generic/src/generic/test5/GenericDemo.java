package generic.test5;

import java.util.ArrayList;
import java.util.Collection;
/*
 * 泛型高级---通配符
 * ？：
 * ？ extends E:
 * ? super E:
 */
public class GenericDemo {
	public static void main(String[] args) {
		// 泛型明确些的时候，前后必须一致
		Collection<Object> collection = new ArrayList<Object>();
		// Collection<Object> collection2=new ArrayList<Animal>();
		// Collection<Object> collection3=new ArrayList<Dog>();
		// Collection<Object> collection4=new ArrayList<Cat>();
		// ? 表示任意的类型都是可以的
		Collection<?> collection5 = new ArrayList<Object>();
		Collection<?> collection6 = new ArrayList<Animal>();
		Collection<?> collection7 = new ArrayList<Dog>();
		Collection<?> collection8 = new ArrayList<Cat>();

		// ? extends E,向下限定，限定E及其子类
		// Collection<? extends Animal> collection9=new ArrayList<Object>();
		Collection<? extends Animal> collection10 = new ArrayList<Animal>();
		Collection<? extends Animal> collection11 = new ArrayList<Dog>();
		Collection<? extends Animal> collection12 = new ArrayList<Cat>();

		// ? super E,向上限定，限定E及其子类
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