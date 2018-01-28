package com.performanceanalyst.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.performanceanalyst.model.LoginDetails;
import com.performanceanalyst.model.UserDetails;
import com.performanceanalyst.services.LoginService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "Login";
	}
	
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String registration(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "Registration";
	}
	
	@RequestMapping(value = "/checkLogin", method = RequestMethod.POST)
	public String checkLogin(LoginDetails loginDetails,Locale locale, Model model) {
		/*logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );*/
		LoginService loginService=new LoginService();
		boolean b=loginService.isUser(loginDetails);
		if(b)
		{
			model.addAttribute("userName", loginDetails.getUserName());
			return "Success";
		}
		
		return "Registration";
	}
	

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String checkLogins(UserDetails loginDetails,Locale locale, Model model) {
		/*logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );*/
		/*LoginService loginService=new LoginService();
		boolean b=loginService.isUser(loginDetails);
		if(b)
		{
			model.addAttribute("userName", loginDetails.getUserName());
			return "Success";
		}
		*/
		LoginService loginService=new LoginService();
		
		if(loginDetails.getUserPass().equals(loginDetails.getReUserPass())){
			boolean b=loginService.insertUser(loginDetails);
			if(b)
			{
				model.addAttribute("userName", loginDetails.getUserName());
					
			}
			return "RegistrationSuccess";
		}
		return "Registration";
		
	}
}
