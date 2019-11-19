package net.tcp.chat.demo01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(9999);
		Socket clinet = server.accept();
		
		DataInputStream dis = new DataInputStream(clinet.getInputStream());
		String msg = dis.readUTF();
		DataOutputStream dos = new DataOutputStream(clinet.getOutputStream());
		dos.writeUTF("������----��"+msg);
		dos.flush();
	}
}
