package com.snail.serviceimpl;

import org.springframework.stereotype.Service;

import com.snail.service.SayService;

@Service
public class SayServiceImpl implements SayService {

	public String say(String str) {
		System.out.println("----Service Content:--------"+str+"---------------------");
		str = "Hello"+str;
		return str;
	}
}
