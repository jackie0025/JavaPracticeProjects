package jackie.studio05;

import java.util.Date;

public class ThreadStop extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("start:"+new Date());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("线程被终止了");
		}
		
		System.out.println("end"+new Date());
	}
}
