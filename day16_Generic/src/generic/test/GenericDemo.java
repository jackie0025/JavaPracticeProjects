package generic.test;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ���ͣ���һ�ְ�������ȷ�Ĺ����Ƴٵ�����������ߵ��÷�����ʱ���ȥ��ȷ����������
 * ���������ͣ������͵��ɲ�������
 * <��������>
 * �˴�����������ֻ������������
 * 
 * �ŵ㣺
 * ������ʹ���������ǰ���˱����ڼ�
 * ������ǿ������ת��
 * �Ż��˳�����ƣ�����˻�ɫ������
 */
public class GenericDemo {
	public static void main(String[] args) {

		// ArrayList<E>
		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("hello");
		arrayList.add("world");
		arrayList.add("java");
		// arrayList.add(10);//���뷺�ͺ���ǰ����
		// arrayList.add(new Integer(10));

		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}
}
