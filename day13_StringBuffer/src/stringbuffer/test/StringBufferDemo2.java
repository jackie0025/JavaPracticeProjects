package stringbuffer.test;

public class StringBufferDemo2 {

	public static void main(String[] args) {
		//������һ��������
		StringBuffer stringBuffer = new StringBuffer();
		
		/*
		//�ڻ�����׷��������hello,�������ַ�������������
		StringBuffer stringBuffer2 = stringBuffer.append("hello");
		System.out.println("stringBuffer:" + stringBuffer);//hello
		System.out.println("stringBuffer2:" + stringBuffer2);//hello
		System.out.println(stringBuffer==stringBuffer2);//true
		*/
		
		/*//һ�������
		stringBuffer.append("hello");
		stringBuffer.append("true");
		stringBuffer.append(12);
		stringBuffer.append(3.14);*/
		
		//��ʽ���
		stringBuffer.append("hello").append(true).append(12).append(3.14);
		System.out.println("stringBuffer:" + stringBuffer);
		
		//public StringBuffer insert(int offset, String str)
		//ָ��λ�ò��������������ݣ����ַ������������������ַ�����������
		stringBuffer.insert(5, "world");
		System.out.println("stringBuffer:"+stringBuffer);
		
	}

}
