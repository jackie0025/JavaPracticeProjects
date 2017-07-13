package jackie.studio03;
/*
 * SetThread 生产者
 * GetThread 消费者
 * 
 * 问题：
 * 	结果null,0
 * 原因：
 * 	每个线程中都创建了新的资源，我们要求设置和获取线程的时候，资源都应该是同一个
 * 如何实现：
 * 	外界把这个暑假创建处理，通过构造方法传递给其他资源
 */
public class StudentDemo {
	public static void main(String[] args) {
		Student student=new Student();
		SetThread setThread=new SetThread(student);
		GetThread getThread=new GetThread(student);
		
		Thread t1=new Thread(setThread);
		Thread t2=new Thread(getThread);
		t2.setPriority(10);
		t1.start();
		t2.start();
	}
}
