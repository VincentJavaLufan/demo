package net.udp;
//udp����������
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.util.Scanner;

/*
 * �ͻ���
 * 1.�����ͻ���+�˿�
 * 2.׼������
 * 3.���
 * 4.����
 * 5.�ͷ�
 */
public class MyClinet {

	public static void main(String[] args) throws IOException {
		 // 1.�����ͻ���+�˿�
		DatagramSocket clinet = new DatagramSocket(6666);
		 // 2.׼������
		Scanner scan = new Scanner(System.in);
		
		String msg =scan.nextLine();
		byte[] data = msg.getBytes();
		 // 3.���(���͵ĵص㣬���˿ڣ�
		DatagramPacket packet = 
				new DatagramPacket(data,data.length,
						new InetSocketAddress("localhost",8888));//�������ĵ�ַ
		//4.����
		clinet.send(packet);
		//5.�ͷ�
		clinet.close();
	}
}
