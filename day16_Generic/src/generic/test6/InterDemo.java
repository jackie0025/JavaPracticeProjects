package generic.test6;

public class InterDemo {
	public static void main(String[] args) {
		Inter<String> inter=new InterImpl();
		inter.show("haha");
		Inter<Integer> inter2=new InterImpl<>();
		inter2.show(132);
	}
}
