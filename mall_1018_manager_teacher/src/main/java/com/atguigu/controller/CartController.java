//package com.atguigu.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import org.apache.commons.lang3.StringUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.CookieValue;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.atguigu.bean.DETAIL_T_MALL_SKU;
//import com.atguigu.bean.T_MALL_SHOPPINGCAR;
//import com.atguigu.bean.T_MALL_SKU;
//import com.atguigu.service.CartServiceInf;
//import com.atguigu.service.ItemServiceInf;
//import com.atguigu.util.MyJsonUtil;
//
//@Controller
//public class CartController {
//
//	@Autowired
//	CartServiceInf cartServiceInf;
//
//	@RequestMapping("add_cart")
//	public String add_cart(HttpSession session, HttpServletResponse response,
//			@CookieValue(value = "list_cart_cookie", required = false) String list_cart_cookie, T_MALL_SHOPPINGCAR cart,
//			ModelMap map) {
//		List<T_MALL_SHOPPINGCAR> list_cart = new ArrayList<T_MALL_SHOPPINGCAR>();
//		int yh_id = cart.getYh_id();
//
//		// 添加购物车操作
//		if (yh_id == 0) {
//			// 用户未登陆，操作cookie
//			if (StringUtils.isBlank(list_cart_cookie)) {
//				list_cart.add(cart);
//			} else {
//				list_cart = MyJsonUtil.json_to_list(list_cart_cookie, T_MALL_SHOPPINGCAR.class);
//				// 判断是否重复
//				boolean b = if_new_cart(list_cart, cart);
//				if (b) {
//					// 新车，添加
//					list_cart.add(cart);
//				} else {
//					// 老车，更新
//					for (int i = 0; i < list_cart.size(); i++) {
//						if (list_cart.get(i).getSku_id() == cart.getSku_id()) {
//							list_cart.get(i).setTjshl(list_cart.get(i).getTjshl() + cart.getTjshl());
//							list_cart.get(i).setHj(list_cart.get(i).getTjshl() * list_cart.get(i).getSku_jg());
//						}
//					}
//				}
//			}
//			// 覆盖cookie
//			Cookie cookie = new Cookie("list_cart_cookie", MyJsonUtil.list_to_json(list_cart));
//			cookie.setMaxAge(60 * 60 * 24);
//			response.addCookie(cookie);
//		} else {
//			list_cart = (List<T_MALL_SHOPPINGCAR>) session.getAttribute("list_cart_session");// 数据库
//			// 用户已登陆，操作db
//
//			boolean b = cartServiceInf.if_cart_exists(cart);
//
//			if (!b) {
//				cartServiceInf.add_cart(cart);
//				if (list_cart == null || list_cart.isEmpty()) {
//					list_cart = new ArrayList<T_MALL_SHOPPINGCAR>();
//					list_cart.add(cart);
//					session.setAttribute("list_cart_session", list_cart);
//				} else {
//					list_cart.add(cart);
//				}
//			} else {
//				for (int i = 0; i < list_cart.size(); i++) {
//					if (list_cart.get(i).getSku_id() == cart.getSku_id()) {
//						list_cart.get(i).setTjshl(list_cart.get(i).getTjshl() + cart.getTjshl());
//						list_cart.get(i).setHj(list_cart.get(i).getTjshl() * list_cart.get(i).getSku_jg());
//						// 老车，更新
//						cartServiceInf.update_cart(list_cart.get(i));
//					}
//				}
//			}
//		}
//
//		return "redirect:/cart_success.do";
//
//	}
//
//	private boolean if_new_cart(List<T_MALL_SHOPPINGCAR> list_cart, T_MALL_SHOPPINGCAR cart) {
//		boolean b = true;
//		for (int i = 0; i < list_cart.size(); i++) {
//			if (list_cart.get(i).getSku_id() == cart.getSku_id()) {
//				b = false;
//			}
//		}
//		return b;
//	}
//
//	@RequestMapping("cart_success")
//	public String cart_success(ModelMap map) {
//
//		return "cartSuccess";
//	}
//
//}
