package udp.tranceiver.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPreceiveDemo {
	public static void main(String[] args) throws IOException {
		//�������ݱ����Ķ���
		DatagramSocket socket=new DatagramSocket(10087);
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
		
		
		//socket.close();
	}
}
