package jackie.studio01;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;

/**
 * @author J.Z
 * @vesion Time:2017年7月24日上午9:29:36
 */
public class FrameDemo2 {
	public static void main(String[] args) {
		// 创建窗体对象
		Frame frame = new Frame("方法调用的前后关系");

		// frame.setVisible(true);
		//
		// try {
		// Thread.sleep(3000);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// // 设置窗体大小
		// //frame.setSize(800, 600);
		// Dimension dimension=new Dimension(800, 600);
		// frame.setSize(dimension);
		// // 设置窗体位置
		// //frame.setLocation(300, 300);
		// Point point=new Point(400, 300);
		// frame.setLocation(point);
		
		frame.setBounds(400, 200, 800, 600);

		frame.setVisible(true);
	}

}
