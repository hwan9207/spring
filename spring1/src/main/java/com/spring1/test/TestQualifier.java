package com.spring1.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.spring1.dao.SampleDAO;

public class TestQualifier {

	@Autowired
	@Qualifier("testDAO")// 못찾을 경우에? 이거로 경로 찾으라는 의미
	private SampleDAO sampleDAO;
}
