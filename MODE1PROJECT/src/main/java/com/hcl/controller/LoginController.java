
package com.hcl.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.service.LoginService;


@Controller
public class LoginController {

	
	  
	  public LoginService loginService;
	 
	  @Autowired
		public LoginController(LoginService loginService)
		{
			this.loginService=loginService;
		}


	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLogin() {
	System.out.println("login");
		return "Login";
	}

	
	@RequestMapping(value="/validate")
	public ModelAndView validate(@RequestParam("username") String adminUserId,@RequestParam("password") String password,javax.servlet.http.HttpSession session,HttpServletRequest request) {
		
		ModelAndView mv1=new ModelAndView();
		String userPassword=loginService.getPassword(adminUserId);
		if(password.equals(userPassword)) {
			mv1.setViewName("Home");
		}else {
			request.setAttribute("error", "Invalid Username or Password!!");
			mv1.setViewName("Login");
		}
		
		return mv1;
	}
	
}
