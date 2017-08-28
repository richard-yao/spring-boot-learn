package com.richard.learn;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;

import com.richard.learn.component.AppConfig;

/**
* @author RichardYao richardyao@tvunetworks.com
* @date 2017年8月28日 下午4:40:18
* ComponentScan的自动扫描只能扫描当前根目录及其子文件
*/
@SpringBootApplication // same as  @Configuration @EnableAutoConfiguration @ComponentScan
public class RootApplication {
	
	@Autowired
	private AppConfig appConfig;
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(RootApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
	
	@Bean
	public EmbeddedServletContainerFactory servletContainer() {
		TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();
		tomcat.setPort(appConfig.getTomcatPort());
		tomcat.setSessionTimeout(30, TimeUnit.MINUTES);
		return tomcat;
	}
}
