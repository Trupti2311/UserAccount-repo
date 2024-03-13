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
public class UserController {

	@Autowired
	UserService userService;

// @RequestMapping(path="/login", method = RequestMethod.POST)
////	public String welMsg(@ModelAttribute User user) {
//		public String welMsg(HttpServletRequest req) {
//		System.out.println(req.getParameter("email"));
//		System.out.println(req.getParameter("password"));
////		System.out.println(user.getEmail());
////		System.out.println(" /  ");
////		System.out.println(user.getPassword());
//		return "index";
//	}

	@RequestMapping(path = "/dashboard", method = RequestMethod.POST)
	public ModelAndView userValidation(User user) {
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());

		if (userService.validateUser(user)) {
			System.out.println("user found in db");
			return new ModelAndView("dashboardUser");
		} else {
			System.out.println("user not found in db");
			return new ModelAndView("login", "errormsg", "Login fail....");
		}

	}

	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public ModelAndView userRegistration(User user) {

		userService.save(user);
		System.out.println("Resister controller called");

		return new ModelAndView("login", "successMsg", "	Registration Successful");
	}

}
