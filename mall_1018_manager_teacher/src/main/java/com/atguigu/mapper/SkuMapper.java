package com.atguigu.mapper;

import java.util.Map;

import com.atguigu.bean.T_MALL_SKU;

public interface SkuMapper {

	void insert_sku(T_MALL_SKU sku);

	void insert_sku_av(Map<Object, Object> map);

}
