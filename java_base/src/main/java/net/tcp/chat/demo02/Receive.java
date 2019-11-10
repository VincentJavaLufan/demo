package net.tcp.chat.demo02;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * �����߳�
 * @author FANFANER
 *
 */
public class Receive implements Runnable{
	private DataInputStream dis;//������
	private boolean isRunning = true;//�̱߳�ʶ
	public Receive() {
		
	}
	public Receive(Socket client) {
		try {
			dis = new DataInputStream(client.getInputStream());
		} catch (IOException e) {
			//e.printStackTrace();
			isRunning = false;
			CloseUtil.closeAll(dis);
		}
	}
	public String receive() {//�������ݵķ���
		String msg = "";
		try {
			msg = dis.readUTF();
		} catch (IOException e) {
			e.printStackTrace();
			isRunning = false;
			CloseUtil.closeAll(dis);
		}
		return msg;
	}
	@Override
	public void run() {//�߳���
		while(isRunning) {
			System.out.println(receive());
		}
	}
}