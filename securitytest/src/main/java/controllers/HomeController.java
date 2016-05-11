package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showIndex()
	{
		return "welcomePage";
	}
	
	@RequestMapping("/login")
	public String showLogin()
	{
		return "loginPage";
	}
	
	@RequestMapping("/userInfo")
	public String showUserInfo()
	{
		return "userInfoPage";
	}
	
}
