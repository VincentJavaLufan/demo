package json.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ReadJSONSample {

	public static void main(String[] args) throws IOException, JSONException {
		File file = new File(ReadJSONSample.class.getResource("JSONDemo.json").getFile());
		String content = FileUtils.readFileToString(file);
		JSONObject jsonObj = new JSONObject(content);
		
		System.out.println("姓名是：" + jsonObj.getString("name"));
		if(!jsonObj.isNull("nickname")) {
			System.out.println("姓名是：" + jsonObj.getString("nickname"));
		}else {
			System.out.println("是空的");
		}
		System.out.println("年龄是：" + jsonObj.getDouble("age"));
		System.out.println(jsonObj.getJSONArray("major"));
		JSONArray majorArray = jsonObj.getJSONArray("major");
		for(int i=0;i<majorArray.length();i++) {
			String mm = (String) majorArray.get(i);
			System.out.println(mm);
		}
	}
}
