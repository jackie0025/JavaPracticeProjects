package jackie.studio051;

public class MyRunnableTest {
	public static void main(String[] args) {
		MyRunnalbe myRunnalbe=new MyRunnalbe();
		
		Thread t1=new Thread(myRunnalbe);
		Thread t2=new Thread(myRunnalbe);

		t1.start();
		t2.start();
	}
}
