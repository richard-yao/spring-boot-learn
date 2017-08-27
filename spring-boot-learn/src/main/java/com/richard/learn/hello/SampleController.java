package com.richard.learn.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author YaoXiansheng
 * @date 2017年8月27日
 * @title SampleController
 * @todo TODO
 */
@Controller
@EnableAutoConfiguration
public class SampleController {

	@RequestMapping("/")
	@ResponseBody
	private String home() {
		return "Hello world";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SampleController.class, args);
	}
}
