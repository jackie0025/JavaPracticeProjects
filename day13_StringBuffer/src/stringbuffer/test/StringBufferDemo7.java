package stringbuffer.test;

public class StringBufferDemo7 {

	public static void main(String[] args) {
		String string="hello";
		//StringBuffer stringBuffer="hello";//cannot convert from String to StringBuffer
		//StringBuffer stringBuffer=string;//cannot convert from String to StringBuffer
		//通过构造方法
		StringBuffer stringBuffer=new StringBuffer(string);
		//通过append()方法
		StringBuffer stringBuffer2=new StringBuffer();
		stringBuffer2.append(string);
		//output
		System.out.println(stringBuffer);
		System.out.println(stringBuffer2);
		

	}

}
