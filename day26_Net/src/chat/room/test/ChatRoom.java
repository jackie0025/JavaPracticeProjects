package chat.room.test;

import java.io.IOException;
import java.net.DatagramSocket;

public class ChatRoom {
	public static void main(String[] args)throws IOException {
		DatagramSocket socketSend=new DatagramSocket();
		DatagramSocket socketReceive=new DatagramSocket(10086);
		
		SendThread  sendThread=new SendThread(socketSend);
		ReceiveThread receiveThread=new ReceiveThread(socketReceive);
		
		Thread thread=new Thread(sendThread);
		Thread thread2=new Thread(receiveThread);
		thread.start();
		thread2.start();
	}
}
