package jackie.studio02;
/**
 * Ïß³ÌËøËÀ²âÊÔ
 */
public class DeadLockDemo {
	public static void main(String[] args) {
		DeadLock deadLock=new DeadLock(true);
		DeadLock deadLock2=new DeadLock(false);
		
		deadLock.start();
		deadLock2.start();
	}
}
