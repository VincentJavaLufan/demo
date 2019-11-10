package net.url;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo01 {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://www.baidu.com:80/index.html#aa?uname=sdffdsa");
		System.out.println("protocol:"+url.getProtocol());
		System.out.println("port number:"+url.getHost());
		System.out.println("port:"+url.getPort());
		System.out.println("file:"+url.getFile());
		System.out.println("path:"+url.getPath());
		System.out.println("ref:"+url.getRef());
		System.out.println("query:"+url.getQuery());
		
		url = new URL("http://www.baidu.com:80/a/");
		url = new URL(url,"b.txt");
		System.out.println(url);
		
	}
}
