package com.spring1.test;

import com.spring1.dto.Store;

public class InjectionAnnotation1 {
	
	private Store storeBean1;
	private Store storeBean2;
	
	public InjectionAnnotation1() {}
	public InjectionAnnotation1(Store storeBean1, Store storeBean2) {
		super();
		this.storeBean1 = storeBean1;
		this.storeBean2 = storeBean2;
	}
	public Store getStoreBean1() {
		return storeBean1;
	}
	public void setStoreBean1(Store storeBean1) {
		this.storeBean1 = storeBean1;
	}
	public Store getStoreBean2() {
		return storeBean2;
	}
	public void setStoreBean2(Store storeBean2) {
		this.storeBean2 = storeBean2;
	}
	@Override
	public String toString() {
		return "InjectionAnnotation1 [storeBean1=" + storeBean1 + ", storeBean2=" + storeBean2 + "]";
	}
	
}
