package collection.test;

import java.util.ArrayList;
import java.util.Collection;

/*
 * boolean addAll(Collection c):���һ�����ϵ�Ԫ��
 * boolean removeAll(Collection c):�Ƴ�һ�����ϵ�Ԫ��
 * 
 */
public class CollectionDemo2 {
	public static void main(String[] args) {
		// ��������
		Collection collection = new ArrayList();
		collection.add("abc1");
		collection.add("abc2");
		collection.add("abc3");
		collection.add("abc4");
		// ��������
		Collection collection2 = new ArrayList();
		collection2.add("abc1");
		collection2.add("abc2");
		collection2.add("abc3");
		collection2.add("abc4");
		collection2.add("abc5");
		collection2.add("abc6");
		collection2.add("abc7");
		collection2.add("abc8");

		// ���һ�����ϵ�Ԫ��
		// System.out.println("addAll:"+collection.addAll(collection2));
		
		// ֻҪ��һ��Ԫ���Ƴ��ˣ��ͷ���true
		// System.out.println("removeAll:"+collection.removeAll(collection2));
		
		// ֻҪ�������е�Ԫ�زŽа���
		// System.out.println("containsAll:"+collection.containsAll(collection2));
		
		// A��B�����������յĽ��������A�У�B����
		// ���ؽ����ʾA�Ƿ����ı�
		System.out.println("retainAll:" + collection.retainAll(collection2));
		
		System.out.println("collection:" + collection);
		System.out.println("collection2:" + collection2);

	}
}
