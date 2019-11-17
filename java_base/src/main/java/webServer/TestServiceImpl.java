package webServer;

import javax.jws.WebService;

@WebService
public class TestServiceImpl implements TestServiceInf{
	
	@Override
	public String ping(String hello) {
		System.out.println("接口调用：" + hello);
		return "pong";
	}
}
