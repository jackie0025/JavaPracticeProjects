package jackie.studio02;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
*@author J.Z
*@version Time:2017年7月24日上午9:46:02
*/
public class FrameDemo {
	public static void main(String[] args) {
		//创建窗体对象
		Frame frame=new Frame();
		//设置窗体属性
		frame.setBounds(400,200,600,350);
		
		// //让窗体关闭
		// //事件源
		// //事件：对窗体的处理
		// //事件处理：关闭窗口
		// //事件监听
		// frame.addWindowListener(new WindowListener() {
		//
		// @Override
		// public void windowOpened(WindowEvent e) {
		// // TODO Auto-generated method stub
		//
		// }
		//
		// @Override
		// public void windowIconified(WindowEvent e) {
		// // TODO Auto-generated method stub
		//
		// }
		//
		// @Override
		// public void windowDeiconified(WindowEvent e) {
		// // TODO Auto-generated method stub
		//
		// }
		//
		// @Override
		// public void windowDeactivated(WindowEvent e) {
		// // TODO Auto-generated method stub
		//
		// }
		//
		// @Override
		// public void windowClosing(WindowEvent e) {
		// // TODO Auto-generated method stub
		// System.exit(0);
		// }
		//
		// @Override
		// public void windowClosed(WindowEvent e) {
		// // TODO Auto-generated method stub
		//
		// }
		//
		// @Override
		// public void windowActivated(WindowEvent e) {
		// // TODO Auto-generated method stub
		//
		// }
		// });
		
		//WindowListener类方法太多，用不了那么多
		//使用适配器类，可以选择需要的方法
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		frame.setLayout(new FlowLayout());
		
		Button button=new Button("button");
		button.setSize(20, 10);
		frame.add(button);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("button clicked");
			}
		});
		//设置窗体可见
		frame.setVisible(true);
	}
	
}
