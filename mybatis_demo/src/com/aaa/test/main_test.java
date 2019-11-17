package com.aaa.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.aaa.mybatis.Emp;
import com.aaa.mybatis.inter.IUserOperation;

public class main_test {

	static String resource = "E:/workspace/mybatis_demo/src/Config.xml";
	
	public static void main(String[] args) throws FileNotFoundException {
		selectByUsername();
	}
	
	public static void selectByUsername() {
		try {
			InputStream inputStream = new FileInputStream(new File(resource));
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession = sessionFactory.openSession();
			IUserOperation userOperation= sqlSession.getMapper(IUserOperation.class);
			
			Emp emp = userOperation.selectEmpnoByEname("JAMES");
			System.out.println("deptno:" + emp.getDeptno());
			System.out.println("empno:" + emp.getEmpno());
			System.out.println("sal:" + emp.getSal());
			
			Boolean flag = userOperation.deleteByEname("KING");
			System.out.println(flag);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
