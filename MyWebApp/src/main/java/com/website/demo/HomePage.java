package com.website.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomePage 
{
	@RequestMapping("home")
//	@ResponseBody
	public String home(HttpServletRequest req)
	{
		HttpSession session = req.getSession();
		String name = req.getParameter("name");
		System.out.println("Home Function"+" "+name);
		System.out.println(session);
		return "Home.jsp";
	}
	
	@RequestMapping("/")
//	@ResponseBody
	public String main()
	{
		System.out.println("Main Function");
		return "Main.jsp";
	}
	
	@RequestMapping("/login")
//	@ResponseBody
	public String login(HttpServletRequest req)
	{
		System.out.println("Login Function");
		HttpSession session = req.getSession();
		String name="null";
		String pwd = "null";
		name = req.getParameter("uname");
		pwd = req.getParameter("psw");
		System.out.println(name+ " "+pwd);
		if(name=="ram" && pwd=="123")
			System.out.println("Jai Shree Ram");
//		if(name!="null" && pwd!="null")
//		{
//			System.out.println(name+ " "+pwd);
//			return "Main.jsp";
//		}
//			
		return "Login.jsp";
	}

}
