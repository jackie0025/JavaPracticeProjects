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
				//接收数据报包
				byte[] bs=new byte[1024];
				DatagramPacket packet=new DatagramPacket(bs, bs.length);
				//接收数据
				socket.receive(packet);
				//解析数据
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
