package jackie.studio02;

public class MyThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myThread = new MyThread();
		// myThread.run();
		// myThread.run();
		// java.lang.IllegalThreadStateException
		//myThread������������
		MyThread myThread2=new MyThread();
		
		myThread.start();
		myThread2.start();
	}

}
