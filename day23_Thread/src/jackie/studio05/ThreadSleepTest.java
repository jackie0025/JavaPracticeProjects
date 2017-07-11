package jackie.studio05;
/*
 * Thread.sleep()
 * .join()// join线程结束了，其余线程才能加入
 */
public class ThreadSleepTest {
	public static void main(String[] args) {
		ThreadSleep threadSleep=new ThreadSleep();
		ThreadSleep threadSleep2=new ThreadSleep();
		ThreadSleep threadSleep3=new ThreadSleep();
		threadSleep.setName("刘备");
		threadSleep2.setName("司马懿");
		threadSleep3.setName("司马孚");
		threadSleep.start();
		try {
			threadSleep.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		threadSleep2.start();
		threadSleep3.start();
	}
}
