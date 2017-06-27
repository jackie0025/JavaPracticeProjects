package udp.tranceiver.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPreceiveDemo {
	public static void main(String[] args) throws IOException {
		//接收数据报包的对象
		DatagramSocket socket=new DatagramSocket(10087);
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
		
		
		//socket.close();
	}
}
