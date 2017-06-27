package scanner.test;

import java.util.Scanner;
/**
 * scanner.nextInt() Test
 * @author JZ
 *
 */
/*

public static final InputStream in

Scanner(InputStream source)
构造一个新的 Scanner，它生成的值是从指定的输入流扫描的。
      
*/
public class ScannerDemo {

	public static void main(String[] args) {
		//create objects
		Scanner scanner=new Scanner(System.in);
		
		/////////////////////////////////
		//get data
		//int x =scanner.nextInt();//if input data is a string,exception happens
		
		if (scanner.hasNextInt()) {
			int x=scanner.nextInt();
			System.out.println(x);
		}else {
			System.out.println("You input data is not integer");
		}
		///////////////////////////////
		//get two string type values
		/*
		String  s1=scanner.nextLine();
		String  s2=scanner.nextLine();
		System.out.println(s1+"__"+s2);
		*/
		///////////////////////////////////
		/*
		String  s2=scanner.nextLine();
		int  i=scanner.nextInt();
		System.out.println(s2+"__"+i);
		*/
		////////////////////////////////////
		/*int  i=scanner.nextInt();
		String  s2=scanner.nextLine();
		System.out.println(i+"__"+s2);
		//s2 无法扫描**********************
		*/
		////////////////////////////
		//解决方案1，创建多个scanner,   不好
		//解决方案2，所有的数据安装字符串获取，然后格式转换
		
		scanner.close();
		
	}

}
