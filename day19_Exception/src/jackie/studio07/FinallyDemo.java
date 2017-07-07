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
			 * return a；在程序执行这一步的时候，是return 30；这个返回路径就形成了
			 * 但是发现后面还有finally，所以继续执行finally，a=40;
			 * 再次回到以前的返回路径，继续走return 30
			 */
		}finally {
			a=40;
		}
		return a;
	}

}
