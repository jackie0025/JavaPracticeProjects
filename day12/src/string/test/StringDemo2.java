package string.test;

public class StringDemo2 {

	public static void main(String[] args) {
		/*String string="Hello";
		string+="World";
		System.out.println(string);*/
		/*
		 * == �Ƚ��������ͣ��Ƚϵ��ǵ�ֵַ�Ƿ���ͬ
		 * equals �Ƚ���������Ĭ��Ҳ�ǱȽϵ�ֵַ�Ƿ���ͬ
		 * ���ǣ�String����д��equals()�������Ƚϵ��������Ƿ���ͬ
		 */
		String string="hello";
		String string2=new String("hello");
		System.out.println(string==string2);//false
		System.out.println(string.equals(string2));//true
		System.out.println("-------------");
		
		String s1="hello";
		String s2="world";
		String s3="helloworld";
		//s1,s2ƴ�ӣ���Ϊ�Ǳ����������ȿ��ռ䣬����ƴ��
		System.out.println(s3==s1+s2);//false
		//
		System.out.println(s3.equals(s1+s2));//true
		//������ӣ����ȼӣ�Ȼ���ٳ��������ң�����о�ֱ�ӷ��أ�����ʹ���
		//.class�ļ��У������룬ʵ��Ϊs3=="helloworld"
		System.out.println(s3=="hello"+"world");//**false?**��actually it's true
		//
		System.out.println(s3.equals("hello"+"world"));//true
		
	}

}
