package com.pwc.dao.mapper;

import java.util.List;

import com.pwc.pojo.User;

public interface UserMapper {

	public User findById(int id);

	public void deleteById(int id);

	public void insert(User user);

	public List<User> findByAge(int age);

}