package jackie.studio051;

public class MyRunnalbe implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}

}
