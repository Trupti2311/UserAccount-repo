package com.smsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavigationController {
@RequestMapping(path="/register")
	public String navToRegister() {
		return "register";
	}
@RequestMapping(path="/navLogin")
public String navToLoginpage() {
	return "login";
}
}
