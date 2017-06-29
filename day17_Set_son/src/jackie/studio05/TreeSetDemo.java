package jackie.studio05;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> treeSet=new TreeSet<>();
		
		treeSet.add("watermelon");
		treeSet.add("apple");
		treeSet.add("banana");
		treeSet.add("apple");
		treeSet.add("cherry");
		treeSet.add("apple");
		treeSet.add("apple");
		
		for(String string:treeSet){
			System.out.println(string);
		}
		
		
	}
}
