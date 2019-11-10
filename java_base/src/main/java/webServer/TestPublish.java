package webServer;

import javax.xml.ws.Endpoint;

public class TestPublish {

	public static void main(String[] args) {
		TestServiceInf wServiceInf = new TestServiceImpl();
		
		Endpoint.publish("http://192.168.0.109:1234/ws", wServiceInf);
	}
}
