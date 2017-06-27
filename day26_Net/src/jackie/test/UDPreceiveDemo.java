package jackie.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPreceiveDemo {
	public static void main(String[] args) throws IOException {
		DatagramSocket socket=new DatagramSocket(10086);
		byte[] bs=new byte[1024];
		int length=bs.length;
		DatagramPacket packet=new DatagramPacket(bs, length);
		
		socket.receive(packet);
		
		//获取对方IP
		InetAddress address1=packet.getAddress();
		String ip=address1.getHostAddress();
		
		byte[] bs2=packet.getData();
		int len=packet.getLength();
		String string=new String(bs2, 0, len);
		System.out.println(ip+":\r\n"+string);
		
		socket.close();
			
	}
}
