package com.website.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomePage 
{
	@RequestMapping("home")
//	@ResponseBody
	public String home()
	{
		System.out.println("Home Function");
		return "Home.jsp";
	}
	
	@RequestMapping("/")
//	@ResponseBody
	public String main()
	{
		System.out.println("Main Function");
		return "Main.jsp";
	}

}
