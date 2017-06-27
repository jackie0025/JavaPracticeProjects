package jz.test;

public class IntegerDemo {

	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(31));
		System.out.println(Integer.toHexString(31));
		System.out.println(Integer.toOctalString(31));

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		String string = "100";
		int i = new Integer(string);
		Integer integer = new Integer(string);
		System.out.println(i);
		System.out.println(integer);
		
		//JDK5的新特性
		/*
		 * 自动装箱
		 * 自动拆箱
		 */
		Integer integer2=100;
		integer2+=200;
		System.out.println(integer2);
		//等价于
		Integer integer3=Integer.valueOf(100);//自动装箱：int类型变为Integer类型
		integer3=Integer.valueOf(integer3.intValue()+200);
		//integer3.intValue()转换为int类型，自动拆箱
		
	}

}
