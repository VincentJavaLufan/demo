package com.aaa.mybatis.inter;

import com.aaa.mybatis.Emp;

public interface IUserOperation {
	 
	public Emp selectEmpnoByEname(String ename);
	
	public void insert(Emp user);
	
	public boolean deleteByEname(String ename);

}
