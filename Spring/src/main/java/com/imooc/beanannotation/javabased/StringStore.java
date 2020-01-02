package com.imooc.beanannotation.javabased;

public class StringStore implements Store<String> {
	
	public void StringStoreInit() {
		System.out.println("StringStoreInit This is init.");
	}
	
	public void StringStoreDestroy() {
		System.out.println("StringStoreDestroy This is destroy.");
	}
	
}
