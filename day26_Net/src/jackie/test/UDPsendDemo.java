package jackie.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UDPsendDemo {
	public static void main(String[] args) throws IOException {
		//创建发送端socket对象
		DatagramSocket socket=new DatagramSocket();
		
		//创建数据并打包
		//DatagramPacket(byte[] buf, int length, InetAddress address, int port) 
		byte[] bs="hello, udp, I'm coming".getBytes();
		int length=bs.length;
		//IP adrress object
		InetAddress address=InetAddress.getByName("192.168.3.2");
		//Port
		int port=10086;
		DatagramPacket packet=new DatagramPacket(bs, length, address, port);
			
		//调用socket对象的发送方法发送数据包
		socket.send(packet);
		//释放资源
		socket.close();
		
		
	}
}
