package com.hp;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author linhongpeng
 * @date 2022-06-03 23:04:26
 */
public class HelloWorld {

	private final static Log logger = LogFactory.getLog(HelloWorld.class);

	private String user;

	public HelloWorld() {
		logger.info("HelloWorld的【无参构造器】...");
	}

	public void setUser(String user) {
		logger.info("HelloWorld的【setUser】方法，要赋值的name为: " + user);
		this.user = user;
	}

	public HelloWorld(String user) {
		this.user = user;
	}

	public void hello(){
		logger.info("HelloWorld的【hello】方法，name为: " + this.user);
	}

}
