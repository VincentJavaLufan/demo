package com.atguigu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.bean.OBJECT_T_MALL_ATTR;
import com.atguigu.mapper.AttrMapper;

@Service
public class AttrServiceImp implements AttrServiceInf {

	@Autowired
	AttrMapper attrMapper;

	public void save_attr(int flbh2, List<OBJECT_T_MALL_ATTR> list_attr) {
		for (int i = 0; i < list_attr.size(); i++) {
			OBJECT_T_MALL_ATTR attr = list_attr.get(i);// 插入属性，返回主键
			attrMapper.insert_attr(flbh2, attr);
			attrMapper.insert_values(attr.getId(), attr.getList_value());// 获得返回主键批量插入属性值
		}
	}

	public List<OBJECT_T_MALL_ATTR> get_attr_list(int flbh2) {
		List<OBJECT_T_MALL_ATTR> list_attr = attrMapper.select_attr_list(flbh2);
		return list_attr;
	}
}
