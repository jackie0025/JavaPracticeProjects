package stringbuffer.test;

/**
 * @author JZ StringBuffer线程安全
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		// public StringBuffer():无参构造方法
		StringBuffer stringBuffer = new StringBuffer();
		System.out.println("stringBuffer:" + stringBuffer);
		System.out.println(".capacity:" + stringBuffer.capacity());
		System.out.println(".length:" + stringBuffer.length());
		System.out.println("---------------");
		StringBuffer stringBuffer2 = new StringBuffer(50);
		System.out.println("stringBuffer2:" + stringBuffer2);
		System.out.println(".capacity:" + stringBuffer2.capacity());
		System.out.println(".length:" + stringBuffer2.length());
		System.out.println("---------------");
		StringBuffer stringBuffer3 = new StringBuffer("hello");
		System.out.println("stringBuffer3:" + stringBuffer3);
		System.out.println(".capacity:" + stringBuffer3.capacity());
		System.out.println(".length:" + stringBuffer3.length());
		System.out.println("---------------");

	}
}
