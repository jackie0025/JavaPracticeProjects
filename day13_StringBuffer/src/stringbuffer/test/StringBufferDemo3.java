package stringbuffer.test;

public class StringBufferDemo3 {
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("hello").append("world").append("java");
		System.out.println(stringBuffer);
		
		/*//ɾ����2���ַ�e
		stringBuffer.deleteCharAt(1);*/
		//ɾ��world
		//stringBuffer.delete(5, 10);
		//ȫɾ
		//stringBuffer.delete(0, stringBuffer.length());
		
		System.out.println(stringBuffer);
		
		
		
	}
}
