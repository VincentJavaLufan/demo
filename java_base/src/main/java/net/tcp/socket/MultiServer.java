package net.tcp.socket;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {
	public static void main(String[] args) throws IOException {
		//1.������������ָ���˿ڡ�ServerSocket(int port)���˿ڱ���Ϳͻ���һ�¡�
		ServerSocket server = new ServerSocket(8888);
		//2.���տͻ������ӣ�����ʽ��
		while(true) {//��ѭ��
			Socket socket = server.accept();
			System.out.println("һ���ͻ��˽�������");
			
			//3.��������
			String msg = "��ӭʹ��";
			//�����
			
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(msg);
			dos.flush();
			while(true) {
				
			}
		}
	}
}
