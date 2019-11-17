package com.jarvis.base.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class listTest {

	public static void main(String[] args) {
		List <VOTest> uList = new ArrayList<VOTest>();
		List <VOTest22> uListNEW = new ArrayList<VOTest22>();
		VOTest vo1 = new VOTest("1","aa","bb","11");
		uList.add(vo1);
		VOTest vo2 = new VOTest("2","cc","dd","22");
		uList.add(vo2);
		VOTest vo3 = new VOTest("3","ee","ff","33");
		uList.add(vo3);
		VOTest vo4 = new VOTest("4","gg","uu","44");
		uList.add(vo4);
		VOTest vo5 = new VOTest("5","ii","bb","11");
		uList.add(vo5);
		VOTest vo6 = new VOTest("6","kk","dd","22");
		uList.add(vo6);
		VOTest vo7 = new VOTest("7","rr","ff","33");
		uList.add(vo7);
		VOTest vo8 = new VOTest("8","tt","uu","44");
		uList.add(vo8);
		int len = uList.size();
		for(int i=0;i<len/2;i++) {
			VOTest22 voNEW1 = new VOTest22(
					uList.get(i).getId(),
					uList.get(i).getName(),
					uList.get(len/2+i).getId(),
					uList.get(len/2+i).getName(),
					uList.get(i).getRemark(),
					uList.get(i).getAmount());
			uListNEW.add(voNEW1);
		}
		for(VOTest22 lll : uListNEW) {
			System.out.println(lll.toString());
		}
	}
}
