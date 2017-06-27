package jackie.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UDPsendDemo {
	public static void main(String[] args) throws IOException {
		//�������Ͷ�socket����
		DatagramSocket socket=new DatagramSocket();
		
		//�������ݲ����
		//DatagramPacket(byte[] buf, int length, InetAddress address, int port) 
		byte[] bs="hello, udp, I'm coming".getBytes();
		int length=bs.length;
		//IP adrress object
		InetAddress address=InetAddress.getByName("192.168.3.2");
		//Port
		int port=10086;
		DatagramPacket packet=new DatagramPacket(bs, length, address, port);
			
		//����socket����ķ��ͷ����������ݰ�
		socket.send(packet);
		//�ͷ���Դ
		socket.close();
		
		
	}
}
