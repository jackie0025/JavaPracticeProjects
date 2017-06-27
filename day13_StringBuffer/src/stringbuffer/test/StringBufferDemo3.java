package stringbuffer.test;

public class StringBufferDemo3 {
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("hello").append("world").append("java");
		System.out.println(stringBuffer);
		
		/*//É¾³ýµÚ2¸ö×Ö·ûe
		stringBuffer.deleteCharAt(1);*/
		//É¾³ýworld
		//stringBuffer.delete(5, 10);
		//È«É¾
		//stringBuffer.delete(0, stringBuffer.length());
		
		System.out.println(stringBuffer);
		
		
		
	}
}
