package net.tcp.socket;
import java.io.DataInputStream;
//��������
import java.io.IOException;
import java.net.Socket;

/**
 * 1.�����ͻ��˵�ʱ�����ָ��  ������+�˿�  
 * ��ʱ��������Socket(String host,int port)
 * 2.��������+��������
 * @author FANFANER
 *
 */
public class Clinet {
	public static void main(String[] args) throws IOException {
		//1.�����ͻ��˵�ʱ�����ָ��  ������+�˿�  ������������ӡ�
		Socket clinet = new Socket("localhost",8888);
		//2.��������
		/*
		BufferedReader br = new BufferedReader(
				new InputStreamReader(clinet.getInputStream()));
		String echo = br.readLine();//����ʽ����
		System.out.println(echo);
		*/
		DataInputStream dis = 
			new DataInputStream(clinet.getInputStream());
		String echo = dis.readUTF();
		System.out.println(echo);
	}
}
