package net.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetDemo01 {
	public static void main(String[] args) throws UnknownHostException {
	//ʹ��getLocalHost��������InetAddress����
	InetAddress addr = InetAddress.getLocalHost();
	System.out.println(addr.getHostAddress());
	System.out.println(addr.getHostName());//����������
	
	//���ʻ������ϵ�һ����ַ��
	addr = InetAddress.getByName("www.163.com");
	System.out.println(addr.getHostAddress());
	System.out.println(addr.getHostName());
	
	addr = InetAddress.getByName("123.183.164.137");
	System.out.println(addr.getHostAddress());
	System.out.println(addr.getHostName());
	}
}
