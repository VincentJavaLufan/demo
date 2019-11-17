package json.gson;

import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import json.bean.Diaosi;

public class GsonCreateSample {
	public static void main(String[] args) {
		Diaosi wangxiaoer = new Diaosi();
		wangxiaoer.setName("王小二");
		wangxiaoer.setAge(25.2);
		wangxiaoer.setBirthday("1990-01-01");
		wangxiaoer.setSchool("蓝翔");
		wangxiaoer.setHas_girlfriend(false);
		wangxiaoer.setCar(null);
		wangxiaoer.setHouse(null);
		wangxiaoer.setComment("这是一个注释asdf11111");
		wangxiaoer.setIgnore("ignore ignore ignore");//忽略掉这个属性  打印出来是看不到这个的
		System.out.println(new JSONObject(wangxiaoer));
		
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.setPrettyPrinting();//高亮等方法  个性化定制
//		gsonBuilder.setFieldNamingStrtrgy()
		//GsonBuilder  还有很多方法
		Gson gson = new Gson();
		System.out.println(gson.toJson(wangxiaoer));
	}
}
