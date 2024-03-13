package com.smsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.smsp.pojo.User;
import com.smsp.service.UserService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
@Controller
public class WelcomeController {
	
@Autowired
UserService userService;

@RequestMapping(path="/")
public String welMsg() {

	return "login";
	}



}

