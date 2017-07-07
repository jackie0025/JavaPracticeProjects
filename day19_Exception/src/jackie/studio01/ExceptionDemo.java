package jackie.studio01;

public class ExceptionDemo {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int[] str={1,2,3};
		try {
			a=a/b;
			System.out.println(str[3]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}finally {
			// TODO: handle finally clause
			// สอทลืสิด
		}
		
		
		
		
	}
}
