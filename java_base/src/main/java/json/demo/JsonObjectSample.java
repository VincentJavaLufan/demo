package json.demo;

import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;

import json.bean.Diaosi;

public class JsonObjectSample {
	public static void main(String[] args) throws JSONException {
		JSONObject();
		createJsonByBean();
	}
	
	private static void JSONObject() throws JSONException {
		JSONObject jo = new JSONObject();
		jo.put("name", "lufan");
		jo.put("age", 23);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("subject", "ecglish");
		map.put("hobby", "baskball");
		jo.put("map", map);
		jo.put("major", new String[] {"hairvut","drive","teach"});
		String jsonString = jo.toString();
		System.out.println("String:" + jsonString);
		Object obj = jo.get("map");
		System.out.println(obj.toString());
		JSONObject mm = (JSONObject)obj;
		System.out.println(mm.get("hobby"));
	}
	
	private static void createJsonByBean() {
		Diaosi wangxiaoer = new Diaosi();
		wangxiaoer.setName("王小二");
		wangxiaoer.setAge(25.2);
		wangxiaoer.setBirthday("1990-01-01");
		wangxiaoer.setSchool("蓝翔");
		wangxiaoer.setHas_girlfriend(false);
//		wangxiaoer.setMajor(new String[] {"ad发送d","asd"});
		wangxiaoer.setCar(null);
		wangxiaoer.setHouse(null);
		wangxiaoer.setComment("这是一个注释asdf");
		System.out.println(new JSONObject(wangxiaoer));
	}
}
