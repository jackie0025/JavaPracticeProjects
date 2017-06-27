package argsdemo.test;
/*
 * 可变参数
 */
public class ArgsDemo {
	public static void main(String[] args) {
		System.out.println(sum(1,2,3,4));;
		System.out.println(sum(1,2,3,4,5));;
	}
	public static int sum(int... is){
		int tmp=0;
		for (int i : is) {
			tmp+=i;
		}
		return tmp;
	}

}
