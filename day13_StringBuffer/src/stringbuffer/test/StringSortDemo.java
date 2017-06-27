package stringbuffer.test;

import java.util.Arrays;

public class StringSortDemo {

	public static void main(String[] args) {
		String string="asdfghjklqwertyuiopzxcvbnm";
		System.out.println(string);
		char[] cs=string.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			for(int j=cs.length-1;j>i;j--){
				if (cs[j]<cs[j-1]) {
					char tmp=cs[j];
					cs[j]=cs[j-1];
					cs[j-1]=tmp;
				}
			}
		}
		System.out.println(String.valueOf(cs));
		System.out.println(Arrays.toString(cs));

	}

}
