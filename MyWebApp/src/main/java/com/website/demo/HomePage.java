package com.website.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
	public String login(HttpServletRequest req, ModelMap model)
	{
		String username="Ram";
		String password="123456";
		System.out.println("Login Function");
		HttpSession session = req.getSession();
		String name = req.getParameter("uname");
		String pwd = req.getParameter("psw");
		System.out.println(name+ " "+pwd);
		if((name!=null && pwd!=null) && (name.equals(username)&& pwd.equals(password)))
		{
			System.out.println(name+ " "+pwd);
			System.out.println("Got it");
			return "redirect:/";
		}
		else if(name!=null && pwd!=null)
		{
			model.put("errorMsg", "Please Provide the correct Credentials");
			return "Login.jsp";
		}
//			
		return "Login.jsp";
	}

}
