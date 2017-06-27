package linkedlist.test;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList linkedList=new LinkedList();
		linkedList.add("love");
		linkedList.add("me");
		linkedList.add("?");
		
		linkedList.addFirst("Do you ");
		System.out.println("linkedList:"+linkedList);
		System.out.println("getFist:"+linkedList.getFirst());
		System.out.println("getFist:"+linkedList.getLast());
		System.out.println("removeFist:"+linkedList.removeFirst());
		
		for(int index=0;index<linkedList.size();index++){
			String string=(String) linkedList.get(index);
			System.out.print(string);
		}
		Iterator iterator=linkedList.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.print(string);
			
		}
	}
}
