package jackie.studio07;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getInt());
		
	}

	private static int getInt() {
		// TODO Auto-generated method stub
		int a=10;
		try {
			System.out.println(a/0);
			a=20;
		} catch (Exception e) {
			// TODO: handle exception
			a=30;
			return a;
			/**
			 * return a���ڳ���ִ����һ����ʱ����return 30���������·�����γ���
			 * ���Ƿ��ֺ��滹��finally�����Լ���ִ��finally��a=40;
			 * �ٴλص���ǰ�ķ���·����������return 30
			 */
		}finally {
			a=40;
		}
		return a;
	}

}
