package com.aaa.test;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.aaa.mybatis.Emp;
import com.aaa.mybatis.inter.IUserOperation;
 
public class test {
	
	@Test
	public void testSELECT() throws FileNotFoundException {
		String resource = "C:\\Users\\Administrator\\git\\demo\\mybatis_demo\\src\\Config.xml";
		InputStream inputStream = new FileInputStream(new File(resource));
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sessionFactory.openSession(); 
		
		try {
			IUserOperation userOperation= sqlSession.getMapper(IUserOperation.class);
			Emp emp = userOperation.selectEmpnoByEname("JAMES");
			System.out.println(emp.getEname());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
 
}
