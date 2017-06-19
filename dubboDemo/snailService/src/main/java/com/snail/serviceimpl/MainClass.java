package com.snail.serviceimpl;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "provider.xml" });
		context.start();
		System.out.println("按任意键退出");
		System.in.read();
	}
}
