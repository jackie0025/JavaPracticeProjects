package chat.room.test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveThread implements Runnable {
	private DatagramSocket socket;
	public ReceiveThread (DatagramSocket socket) {
		this.socket=socket;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			while(true){
				//�������ݱ���
				byte[] bs=new byte[1024];
				DatagramPacket packet=new DatagramPacket(bs, bs.length);
				//��������
				socket.receive(packet);
				//��������
				String ip=packet.getAddress().getHostAddress();
				String string=new String(packet.getData(),0,packet.getLength());
				System.out.println("From"+ip+":\r\n"+string);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
