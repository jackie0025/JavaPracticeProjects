package jackie.studio04;

public class Test {

	private static final int MAX_PRIORITY = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPPriority tPriority=new ThreadPPriority();
		ThreadPPriority tPriority2=new ThreadPPriority();
		ThreadPPriority tPriority3=new ThreadPPriority();
		
		tPriority.setName("线程1");
		tPriority2.setName("线程2");
		tPriority3.setName("线程3");
		
		tPriority.setPriority(MAX_PRIORITY);
		tPriority2.setPriority(5);
		tPriority3.setPriority(1);
		
		tPriority.start();
		tPriority2.start();
		tPriority3.start();
		
	}

}
