package jackie.studio05;
/*
 * Thread.sleep()
 * .join()// join�߳̽����ˣ������̲߳��ܼ���
 */
public class ThreadSleepTest {
	public static void main(String[] args) {
		ThreadSleep threadSleep=new ThreadSleep();
		ThreadSleep threadSleep2=new ThreadSleep();
		ThreadSleep threadSleep3=new ThreadSleep();
		threadSleep.setName("����");
		threadSleep2.setName("˾��ܲ");
		threadSleep3.setName("˾����");
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
