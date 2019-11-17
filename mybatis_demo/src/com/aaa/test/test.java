package com.aaa.test;
 
import java.io.InputStream;
 
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.aaa.mybatis.Emp;
import com.aaa.mybatis.inter.IUserOperation;
 
class test {
	
	@Test
	void testSELECT() {
		String resource = "/Config.xml";
		InputStream inputStream = this.getClass().getResourceAsStream(resource);
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
