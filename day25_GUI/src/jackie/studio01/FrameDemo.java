package jackie.studio01;

import java.awt.Frame;

/**
 * @author J.Z
 * @vesion Time:2017年7月24日上午9:29:36
 */
public class FrameDemo {
	public static void main(String[] args) {
		// 创建窗体对象
		Frame frame = new Frame();
		//设置标题
		frame.setTitle("HelloWorld");
		// 设置窗体大小
		frame.setSize(800, 600);
		//设置窗体位置
		frame.setLocation(300,300);
		frame.setVisible(true);
	}

}
