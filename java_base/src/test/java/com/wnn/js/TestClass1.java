package com.wnn.js;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import org.junit.Test;

import com.google.gson.Gson;

import json.wnn.bean.T_MALL_CLASS_1;
import json.wnn.mapper.T_MALL_CLASS_1_mapper;

public class TestClass1 {
	@Test
	public void test() throws IOException {
		//获取sqlSessionFactory
		String resource = "mybatis-config.xml";
		InputStream is = Resources.getResourceAsStream(resource);
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
		
		//获取session
		SqlSession session = ssf.openSession();
		
		//获取mapper
		T_MALL_CLASS_1_mapper c1p = session.getMapper(T_MALL_CLASS_1_mapper.class);
		
		//操作获取数据
		List<T_MALL_CLASS_1> c1pL = c1p.getList();
		
		//创建gson对象
		Gson gg = new Gson();
		//转json
		String ggString = gg.toJson(c1pL);
		System.out.println(ggString);
		//生成静态文件
		
		FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/Administrator/Desktop/class_1.js");
		fileOutputStream.write(ggString.getBytes());
		fileOutputStream.flush();
		fileOutputStream.close();
	}
	
	@Test
	public void testPrimaryKey() throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
		
		SqlSession session = ssf.openSession();
		
		T_MALL_CLASS_1_mapper c1p = session.getMapper(T_MALL_CLASS_1_mapper.class);
		T_MALL_CLASS_1 class1 = new T_MALL_CLASS_1();
		class1.setFlmch1("汽车用品");
		c1p.insert(class1);
		session.commit();
		session.close();
	}
}
