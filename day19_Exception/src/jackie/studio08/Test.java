package jackie.studio08;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ñ§Éú³É¼¨£º");
		int score=scanner.nextInt();
		
		Teacher teacher=new Teacher();
		try {
			teacher.check(score);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		scanner.close();
	}
}
