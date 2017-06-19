package com.snail.web.controller;



import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.snail.service.SayService;

@Controller
public class indexController {
	
	/*@Autowired
	private SayService sayService;*/
	@RequestMapping("test")
	public ModelAndView say() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "customer.xml" });
		context.start();
		
		
		ModelAndView mv  = new ModelAndView("index1");
		SayService sayService =(SayService) context.getBean("demoService");
		String str  = sayService.say("world");
		mv.addObject("msg", str);
		context.close();
		return mv;
	}
	
	/*private ClassPathXmlApplicationContext context;

	@RequestMapping("t")
	public ModelAndView sayH() {
		context = new ClassPathXmlApplicationContext("E:\\WrokSstation\\EclipseWeb\\snailClient1\\src\\main\\resources\\config\\spring\\custom.xml"); 
		context.start();  
		SayService sayService = (SayService)context.getBean("SayService"); // 获取远程服务代理 
		ModelAndView mv  = new ModelAndView("index1");
		String str  = sayService.say("world");
		mv.addObject("msg", str);
		return mv;
	}*/
	
     
    
   
}
