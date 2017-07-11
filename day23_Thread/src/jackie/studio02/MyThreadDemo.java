package jackie.studio02;

public class MyThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myThread = new MyThread();
		// myThread.run();
		// myThread.run();
		// java.lang.IllegalThreadStateException
		//myThread被调用了两次
		MyThread myThread2=new MyThread("线程2");
		myThread.setName("线程1");
		//myThread2.setName("线程2");
		myThread.start();
		myThread2.start();
		
		System.out.println(Thread.currentThread().getName());
	}

}
