package com.richard.learn.hello;

import java.util.concurrent.TimeUnit;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
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
@SpringBootApplication // same as  @Configuration @EnableAutoConfiguration @ComponentScan
public class SampleController {

	public static void main(String[] args) {
		//SpringApplication.run(SampleController.class, args);
		SpringApplication app = new SpringApplication(SampleController.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
	
	@RequestMapping("/index")
	@ResponseBody
	private String home() {
		return "Hello world";
	}
	
	@Bean
	public EmbeddedServletContainerFactory servletContainer() {
		TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();
		tomcat.setPort(8098);
		tomcat.setSessionTimeout(30, TimeUnit.MINUTES);
		return tomcat;
	}
}
