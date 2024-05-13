package com.spring1.vo;

import com.spring1.dto.Store;

//생성자로 주입
public class InjectionJava1{

	private Store store;

	public InjectionJava1(Store store) {
		super();
		this.store = store;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}
	
}
