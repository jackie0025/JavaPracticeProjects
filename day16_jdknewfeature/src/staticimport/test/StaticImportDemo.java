package staticimport.test;


//æ≤Ã¨µº»Î
import static java.lang.Math.abs;
public class StaticImportDemo {
	public static void main(String[] args) {
		System.out.println(java.lang.Math.abs(-100));
		System.out.println(Math.abs(-200));
		
		System.out.println(abs(-300));
	}
}
