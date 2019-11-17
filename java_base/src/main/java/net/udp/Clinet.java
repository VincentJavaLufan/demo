package net.udp;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.util.Scanner;

public class Clinet {
	public static void main(String[] args) throws IOException {
		 // 1.�����ͻ���+�˿�
		DatagramSocket clinet = new DatagramSocket(6666);
		 // 2.׼������
		double num = 29.12124321;
		byte[] data = convert(num);
		 // 3.���(���͵ĵص㣬���˿ڣ�
		DatagramPacket packet = 
				new DatagramPacket(data,data.length,
						new InetSocketAddress("localhost",8888));//�������ĵ�ַ
		//4.����
		clinet.send(packet);
		//5.�ͷ�
		clinet.close();
	}
	/**
	 * �ֽ����� ����Դ +Date�����
	 * @param num
	 * @return 
	 * @throws IOException
	 */
	public static byte[] convert(double num) throws IOException{
		byte[] data = null;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		dos.writeDouble(num);

		//��ȡ����
		data = bos.toByteArray();
		return data;
	}
}