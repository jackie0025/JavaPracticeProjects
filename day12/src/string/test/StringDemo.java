package string.test;

public class StringDemo {
	 public static void main(String[] args) {
		 //public String():空构造
		 String string=new String();
		 System.out.println("string:"+string);
		 System.out.println("string.length:"+string.length());
		 System.out.println("-------------");
		 
		 //public String(byte[] bytes):把字节数组转换成字符串
		 byte[] bs={48,49,50,65,66,67};
		 String string2=new String(bs);
		 //转换成了字符，ASCII
		 System.out.println("string2:"+string2);//string2:012ABC
		 System.out.println("string2.length:"+string2.length());
		 System.out.println("-------------");
		 //public String(byte[] bytes，int index,int length):把字节数组的一部分转换成字符串
		 String string3=new String(bs, 1, 3);
		 System.out.println("string3:"+string3);//string2:012ABC
		 System.out.println("string3.length:"+string3.length());
		 System.out.println("-------------");
		 //public String(char[] value):把字符数组转换成字符串
		 char[] cs={'a','b','c','嗨','美','女'};
		 String string4=new String(cs);
		 String string5=new String(cs, 1, 3);
		 System.out.println("string4:"+string4);
		 System.out.println("string4.length:"+string4.length());
		 System.out.println("string5:"+string5);
		 System.out.println("string5.length:"+string5.length());
		 System.out.println("-------------");
		 
		 String string6="abcdefdasdfasdfa";
		 System.out.println("string6:"+string6);
		 System.out.println("string6.length:"+string6.length());
		 System.out.println("-------------");
		 
		 
		 for(int i=100;i>=-80;i--){
			 System.out.print(i+",");
		 }
		// System.out.println(1740+Math.round(1740*(18-20)*0.0175/5));
	}
}
