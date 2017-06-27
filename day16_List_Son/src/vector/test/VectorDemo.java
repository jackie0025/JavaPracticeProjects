package vector.test;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/*
 * Vector 特有功能
 * addElement---------------------------add 替代
 * public Enumeration<E> elements()-----Iterator，hasNext替代
 */
public class VectorDemo {
	public static void main(String[] args) {
		//create Collection Objects
		Vector vector=new Vector();
		//add  elements
		vector.addElement("do");
		vector.addElement("you");
		vector.addElement("love");
		vector.addElement("me");
		//traversal
		Iterator iterator=vector.iterator();
		System.out.println("iterator.next():");
		while (iterator.hasNext()) {
			String  string = (String ) iterator.next();
			System.out.print(string+" ");
		}
		
		System.out.println("------------------");
		//traversal by for
		System.out.println("vector.get(index):");
		for(int index = 0;index<vector.size();index++){
			String string=(String) vector.get(index);
			System.out.print(string+" ");
		}
		
		System.out.println("------------------");
		//elementAt
		System.out.println("vector.elementAt(index):");
		for(int index = 0;index<vector.size();index++){
			String string=(String) vector.elementAt(index);
			System.out.print(string+" ");
		}	
		System.out.println("------------------");
		//Enumeration
		System.out.println("enumeration.nextElement():");
		Enumeration enumeration=vector.elements();
		while(enumeration.hasMoreElements()){
			String string=(String) enumeration.nextElement();
			System.out.print(string+" ");
		}
	}
}
