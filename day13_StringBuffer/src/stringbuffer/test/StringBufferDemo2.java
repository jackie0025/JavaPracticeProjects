package stringbuffer.test;

public class StringBufferDemo2 {

	public static void main(String[] args) {
		//创建了一个缓冲区
		StringBuffer stringBuffer = new StringBuffer();
		
		/*
		//在缓冲区追加了数据hello,并返回字符串缓冲区本身
		StringBuffer stringBuffer2 = stringBuffer.append("hello");
		System.out.println("stringBuffer:" + stringBuffer);//hello
		System.out.println("stringBuffer2:" + stringBuffer2);//hello
		System.out.println(stringBuffer==stringBuffer2);//true
		*/
		
		/*//一个个添加
		stringBuffer.append("hello");
		stringBuffer.append("true");
		stringBuffer.append(12);
		stringBuffer.append(3.14);*/
		
		//链式编程
		stringBuffer.append("hello").append(true).append(12).append(3.14);
		System.out.println("stringBuffer:" + stringBuffer);
		
		//public StringBuffer insert(int offset, String str)
		//指定位置插入任意类型数据，到字符串缓冲区，并返回字符缓冲区本身
		stringBuffer.insert(5, "world");
		System.out.println("stringBuffer:"+stringBuffer);
		
	}

}
