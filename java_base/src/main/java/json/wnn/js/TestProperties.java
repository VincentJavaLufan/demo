package json.wnn.js;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.jupiter.api.Test;

public class TestProperties {

	@Test
	public void test() throws IOException {
		Properties pro = new Properties();
		InputStream in = TestProperties.class.getClassLoader().getResourceAsStream("dbconfig.properties");
		pro.load(in);
		String url = pro.getProperty("url");
		System.out.println(url);
		
		String name = pro.getProperty("name","aaa");
		System.out.println(name);
		
	}
}
