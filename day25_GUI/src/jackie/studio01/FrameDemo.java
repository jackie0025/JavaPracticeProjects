package jackie.studio01;

import java.awt.Frame;

/**
 * @author J.Z
 * @vesion Time:2017��7��24������9:29:36
 */
public class FrameDemo {
	public static void main(String[] args) {
		// �����������
		Frame frame = new Frame();
		//���ñ���
		frame.setTitle("HelloWorld");
		// ���ô����С
		frame.setSize(800, 600);
		//���ô���λ��
		frame.setLocation(300,300);
		frame.setVisible(true);
	}

}
