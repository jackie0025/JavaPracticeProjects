package string.test;

public class StringDemo2 {

	public static void main(String[] args) {
		/*String string="Hello";
		string+="World";
		System.out.println(string);*/
		/*
		 * == 比较引用类型，比较的是地址值是否相同
		 * equals 比较引用类型默认也是比较地址值是否相同
		 * 但是，String类重写了equals()方法，比较的是内容是否相同
		 */
		String string="hello";
		String string2=new String("hello");
		System.out.println(string==string2);//false
		System.out.println(string.equals(string2));//true
		System.out.println("-------------");
		
		String s1="hello";
		String s2="world";
		String s3="helloworld";
		//s1,s2拼接，因为是变量，所以先开空间，再做拼接
		System.out.println(s3==s1+s2);//false
		//
		System.out.println(s3.equals(s1+s2));//true
		//常量相加，是先加，然后再常量池里找，如果有就直接返回，否则就创建
		//.class文件中，反编译，实际为s3=="helloworld"
		System.out.println(s3=="hello"+"world");//**false?**，actually it's true
		//
		System.out.println(s3.equals("hello"+"world"));//true
		
	}

}
