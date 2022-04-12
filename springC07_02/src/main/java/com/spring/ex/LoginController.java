package com.spring.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@RequestMapping("login")
	public String login() {
		
		return "login/login";
	}
	@RequestMapping(method=RequestMethod.POST, value="loginOk")
	public String loginOk(Model m, @RequestParam("id") String id, @RequestParam("pw") String pw) {
		m.addAttribute("id", id);
		m.addAttribute("pw", pw);
		return "login/result";
	}
}
