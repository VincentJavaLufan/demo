package server;

import javax.jws.WebService;

@WebService
public interface TestServerInf{

	public String ping(String hello);
}
