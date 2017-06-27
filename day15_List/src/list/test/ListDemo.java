package list.test;

//import java.awt.List;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {

	public static void main(String[] args) {
		//create List Object
		List list=new ArrayList();
		
		//
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//±éÀú¼¯ºÏ
		Iterator iterator=list.iterator();
		while(iterator.hasNext()){
			String string=(String) iterator.next();
			System.out.println(string);
		}
		
	}

}
