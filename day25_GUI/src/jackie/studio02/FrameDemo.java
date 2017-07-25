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
*@version Time:2017��7��24������9:46:02
*/
public class FrameDemo {
	public static void main(String[] args) {
		//�����������
		Frame frame=new Frame();
		//���ô�������
		frame.setBounds(400,200,600,350);
		
		// //�ô���ر�
		// //�¼�Դ
		// //�¼����Դ���Ĵ���
		// //�¼������رմ���
		// //�¼�����
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
		
		//WindowListener�෽��̫�࣬�ò�����ô��
		//ʹ���������࣬����ѡ����Ҫ�ķ���
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
		//���ô���ɼ�
		frame.setVisible(true);
	}
	
}
