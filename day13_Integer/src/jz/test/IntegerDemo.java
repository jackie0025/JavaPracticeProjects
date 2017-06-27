package jz.test;

public class IntegerDemo {

	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(31));
		System.out.println(Integer.toHexString(31));
		System.out.println(Integer.toOctalString(31));

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		String string = "100";
		int i = new Integer(string);
		Integer integer = new Integer(string);
		System.out.println(i);
		System.out.println(integer);
		
		//JDK5��������
		/*
		 * �Զ�װ��
		 * �Զ�����
		 */
		Integer integer2=100;
		integer2+=200;
		System.out.println(integer2);
		//�ȼ���
		Integer integer3=Integer.valueOf(100);//�Զ�װ�䣺int���ͱ�ΪInteger����
		integer3=Integer.valueOf(integer3.intValue()+200);
		//integer3.intValue()ת��Ϊint���ͣ��Զ�����
		
	}

}
