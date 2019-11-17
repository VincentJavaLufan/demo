package net.tcp.socket;
import java.io.BufferedWriter;
/**
 * ������������ָ���˿ڡ�ServerSocket(int port)
 * ���տͻ������ӣ�����ʽ��
 * 
 */
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		//1.������������ָ���˿ڡ�ServerSocket(int port)���˿ڱ���Ϳͻ���һ�¡�
		ServerSocket server = new ServerSocket(8888);
		//2.���տͻ������ӣ�����ʽ��
		Socket socket = server.accept();
		System.out.println("һ���ͻ��˽�������");
		
		//3.��������
		String msg = "��ӭʹ��";
		//�����
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(socket.getOutputStream()));
		bw.write(msg);
		bw.newLine();
		bw.flush();
	}
}
