package jackie.studio02;

public class MyThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		for(int i=0;i<100000;i++){
			if (i%10000==0) {
				System.out.println(getName()+":"+i);
			}
		}
	}
}
