package com.richard.learn.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.richard.learn.component.AppConfig;

/**
 * @author YaoXiansheng
 * @date 2017年8月27日
 * @title SampleController
 */
@RestController
public class SampleController {
	
	@Autowired
	private AppConfig appConfig;

	@RequestMapping("/index")
	public String home() {
		return appConfig.getHelloMessage();
	}
	
	@RequestMapping("/server-info")
	public Map<String, String> serverInfo() {
		Map<String, String> result = new HashMap<String, String>();
		result.put("name", appConfig.getName());
		result.put("version", appConfig.getVersion());
		result.put("author", appConfig.getAuthor());
		return result;
	}
}
