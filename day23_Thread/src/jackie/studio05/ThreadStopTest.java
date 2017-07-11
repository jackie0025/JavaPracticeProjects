package jackie.studio05;

import java.util.Date;

public class ThreadStopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadStop threadStop=new ThreadStop();
		threadStop.start();
		try {
			Thread.sleep(3000);
			//threadStop.stop();//让线程停止，过时了 但是还可以用
			threadStop.interrupt();//中断线程，把线程的状态终止，并抛出一个InterruptedException
			System.out.println("stop:"+new Date());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
