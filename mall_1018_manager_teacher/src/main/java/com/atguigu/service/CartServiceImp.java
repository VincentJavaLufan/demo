//package com.atguigu.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.atguigu.bean.T_MALL_SHOPPINGCAR;
//import com.atguigu.mapper.CartMapper;
//
//@Service
//public class CartServiceImp implements CartServiceInf {
//
//	@Autowired
//	CartMapper cartMapper;
//
//	@Override
//	public void add_cart(T_MALL_SHOPPINGCAR cart) {
//		cartMapper.insert_cart(cart);
//
//	}
//
//	@Override
//	public void update_cart(T_MALL_SHOPPINGCAR cart) {
//		cartMapper.update_cart(cart);
//	}
//
//	@Override
//	public boolean if_cart_exists(T_MALL_SHOPPINGCAR cart) {
//		boolean b = false;
//		int i = cartMapper.select_cart_exists(cart);
//		if (i > 0) {
//			b = true;
//		}
//		return b;
//	}
//
//}
