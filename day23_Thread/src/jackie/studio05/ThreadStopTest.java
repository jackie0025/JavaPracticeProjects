package jackie.studio05;

import java.util.Date;

public class ThreadStopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadStop threadStop=new ThreadStop();
		threadStop.start();
		try {
			Thread.sleep(3000);
			//threadStop.stop();//���߳�ֹͣ����ʱ�� ���ǻ�������
			threadStop.interrupt();//�ж��̣߳����̵߳�״̬��ֹ�����׳�һ��InterruptedException
			System.out.println("stop:"+new Date());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
