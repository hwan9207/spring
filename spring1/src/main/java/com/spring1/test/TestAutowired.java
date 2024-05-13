package com.spring1.test;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring1.dao.SampleDAO;

public class TestAutowired {
	
	@Autowired
	private SampleDAO sampleDAO;
	
	public TestAutowired() {}
	public TestAutowired(SampleDAO sampleDAO) {
		this.sampleDAO = sampleDAO;
	}
	
}
