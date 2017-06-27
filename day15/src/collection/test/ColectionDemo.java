package collection.test;

import java.util.ArrayList;
import java.util.Collection;

public class ColectionDemo {

	public static void main(String[] args) {
		//接口不能实例化Cannot instantiate the type Collection
		//Collection collection=new Collection();
		Collection collection=new ArrayList();
		
		//boolean add(Object obj)//add an element
		//System.out.println("add:"+collection.add("Hello"));//true
		
		collection.add("hello");
		collection.add("world");
		collection.add("java");
		
		//void clear():clear all elements
		//collection.clear();
		
		//boolean remove(Object obj): remove an element
		//System.out.println("remove:"+collection.remove("java"));
		
		//boolean contains(Object obj): if there is an specific element
		System.out.println("contains:"+collection.contains("hello"));
		
		//booleam isEmpty()
		System.out.println("isEmpty:"+collection.isEmpty());
		System.out.println("collection:"+collection);
	}

}
