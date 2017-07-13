package jackie.studio02;

public class DeadLock extends Thread {
	private boolean flag;

	public DeadLock(boolean flag) {
		// TODO Auto-generated constructor stub
		this.flag = flag;
	}
	/**
	 * Ïß³ÌËøËÀ´úÂë
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (flag) {
			synchronized (MyLock.objA) {
				System.out.println("if objA");
				synchronized (MyLock.objB) {
					System.out.println("if objB");
				}
			}
		}else {
			synchronized (MyLock.objB) {
				System.out.println("else objB");
				synchronized (MyLock.objA) {
					System.out.println("else objA");
				}
			}
		}
	}
}
