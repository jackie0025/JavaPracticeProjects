package jackie.studio03;
/*
 * SetThread ������
 * GetThread ������
 * 
 * ���⣺
 * 	���null,0
 * ԭ��
 * 	ÿ���߳��ж��������µ���Դ������Ҫ�����úͻ�ȡ�̵߳�ʱ����Դ��Ӧ����ͬһ��
 * ���ʵ�֣�
 * 	���������ٴ�������ͨ�����췽�����ݸ�������Դ
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
