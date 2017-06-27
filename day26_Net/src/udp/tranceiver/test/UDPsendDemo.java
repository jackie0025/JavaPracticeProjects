package udp.tranceiver.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPsendDemo {
	public static void main(String[] args)throws IOException {
		//创建socket对象
		DatagramSocket socket=new DatagramSocket();
	
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String line=null;
		while((line=reader.readLine())!=null){
			if("exit".equals(line)){
				System.out.println("程序结束");
				break;
			}
			//创建数据并打包
			byte[] bs=line.getBytes();
			//String host="192.168.3.2";
			String host="127.0.0.1";
			DatagramPacket packet=new DatagramPacket(bs, bs.length,
					InetAddress.getByName(host),10087);
			//发送数据
			socket.send(packet);
		}
		
		
		//释放资源
		socket.close();
		
	}
}
