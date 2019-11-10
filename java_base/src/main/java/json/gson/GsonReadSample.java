package json.gson;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import json.bean.Diaosi;
import json.demo.ReadJSONSample;
/**
 * 解析json
 * @author Administrator
 *
 */
public class GsonReadSample {
	public static void main(String[] args) throws IOException {
		File file = new File(ReadJSONSample.class.getResource("JSONDemo.json").getFile());
		String content = FileUtils.readFileToString(file);
//		System.out.println(content);
//		Gson gson = new Gson();
//		Diaosi wangxiaoer = gson.fromJson(content, Diaosi.class);
//		System.out.println(wangxiaoer);
		//GsonBuilder对于Date格式的支持
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
		DiaosiWithBirthday wangxiaoer = gson.fromJson(content, DiaosiWithBirthday.class);
		System.out.println(wangxiaoer.getBirthday());
		
		System.out.println(wangxiaoer.getMajor());
		System.out.println(wangxiaoer.getMajor().getClass());
	}
}
