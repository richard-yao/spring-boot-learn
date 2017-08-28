package com.richard.learn.component;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
* @author RichardYao richardyao@tvunetworks.com
* @date 2017年8月28日 下午4:07:59
*/
@Component
@PropertySource("classpath:config/app.properties")
@ConfigurationProperties(prefix = "app")
public class AppConfig {

	private String name;
	private String version;
	private String author;
	private String helloMessage;
	private Integer tomcatPort;
	
	public AppConfig() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getHelloMessage() {
		return helloMessage;
	}
	public void setHelloMessage(String helloMessage) {
		this.helloMessage = helloMessage;
	}

	/**
	 * @return the tomcatPort
	 */
	public Integer getTomcatPort() {
		return tomcatPort;
	}

	/**
	 * @param tomcatPort the tomcatPort to set
	 */
	public void setTomcatPort(Integer tomcatPort) {
		this.tomcatPort = tomcatPort;
	}
}
