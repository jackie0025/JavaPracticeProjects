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
����һ���µ� Scanner�������ɵ�ֵ�Ǵ�ָ����������ɨ��ġ�
      
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
		//s2 �޷�ɨ��**********************
		*/
		////////////////////////////
		//�������1���������scanner,   ����
		//�������2�����е����ݰ�װ�ַ�����ȡ��Ȼ���ʽת��
		
		scanner.close();
		
	}

}
