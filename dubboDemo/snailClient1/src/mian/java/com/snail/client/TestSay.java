package com.snail.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("test")
public class TestSay {
	@RequestMapping("say")
	public ModelAndView testSay() {
		ModelAndView mv  = new ModelAndView("login");
		String str = null;
		mv.addObject("msg", str);
		return mv;
	}
}
