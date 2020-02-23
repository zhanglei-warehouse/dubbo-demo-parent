package com.zhanglei;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
* @ClassName: BootStart 
* @Description: TODO
* @author: lei zhang
* @date: 2020年2月23日 下午5:25:31 
*/
public class BootStart {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		c.start();
		System.in.read();
	}
}
