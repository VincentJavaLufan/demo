package net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * �����
 * 1.���������+�˿�
 * 2.׼����������
 * 3.��װ�ɰ�
 * 4.��������
 * @author FANFANER
 *
 */
public class MyServer {

	public static void main(String[] args) throws IOException {
		// 1.���������+�˿�
		DatagramSocket server = new DatagramSocket(8888);//ָ���˿ڡ�
		 // 2.׼����������
		byte[] container = new byte[1024];
		 // 3.��װ�ɰ�
		DatagramPacket packet = new DatagramPacket(container, container.length);
		 // 4.��������
		server.receive(packet);
		//5.��������
		byte[] data = packet.getData();
		int len = packet.getLength();
		System.out.println(new String(data,0,len));
		//6.�ͷ�
		server.close();
	}
}
