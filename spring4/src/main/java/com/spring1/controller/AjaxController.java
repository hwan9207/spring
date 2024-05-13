package com.spring1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring1.service.SampleService;

public class AjaxController {
	
	private static final Logger log = LoggerFactory.getLogger(RestfulController.class);
	
	@Autowired
	private SampleService sampleService;
	
	@GetMapping("/")
	public String ajaxHome() {
		return "ajax/home";
	}
	
	@GetMapping("/ajax1.do")
	public String ajaxTest1() {return "/ajax/ajax1";}
	
	@ResponseBody
	@GetMapping(value="/ajax1pro.do",produces="application/json;charset=UTF-8")
	public String ajaxTest1Pro() {
		String str = "GET 전송 테스트";
		log.info("GET 전송 테스트");
		return "ajax/ajax1";
	}
	@GetMapping("/ajax2.do")
	public String ajaxTest2() {return "/ajax/ajax2";}
	
	@PostMapping("/ajax2pro.do")
	public String ajaxTest2Pro() {
		String str = "Post 전송 테스트";
		log.info(str);
		return "ajax/ajax2";
	}
}
