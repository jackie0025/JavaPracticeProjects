package chat.room.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendThread implements Runnable {
	private DatagramSocket socket;
	public SendThread(DatagramSocket socket) {
		// TODO Auto-generated constructor stub
		this.socket=socket;
	}
	@Override
	public void run() {
		try{
		// TODO Auto-generated method stub
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
					InetAddress.getByName(host),10086);
			//发送数据
			socket.send(packet);
		}
		
		
		//释放资源
		socket.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
