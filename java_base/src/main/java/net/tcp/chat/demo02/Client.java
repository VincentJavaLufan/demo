package net.tcp.chat.demo02;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client = new Socket("localhost",9999);
		new Thread(new Send(client)).start();
		new Thread(new Receive(client)).start();
		
//		DataInputStream dis = new DataInputStream(client.getInputStream());
//		while(true) {
//
//			String msg = dis.readUTF();
//			System.out.println(msg);
//		}
	}
}
