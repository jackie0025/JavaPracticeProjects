package jackie.studio01;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;

/**
 * @author J.Z
 * @vesion Time:2017��7��24������9:29:36
 */
public class FrameDemo2 {
	public static void main(String[] args) {
		// �����������
		Frame frame = new Frame("�������õ�ǰ���ϵ");

		// frame.setVisible(true);
		//
		// try {
		// Thread.sleep(3000);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// // ���ô����С
		// //frame.setSize(800, 600);
		// Dimension dimension=new Dimension(800, 600);
		// frame.setSize(dimension);
		// // ���ô���λ��
		// //frame.setLocation(300, 300);
		// Point point=new Point(400, 300);
		// frame.setLocation(point);
		
		frame.setBounds(400, 200, 800, 600);

		frame.setVisible(true);
	}

}
