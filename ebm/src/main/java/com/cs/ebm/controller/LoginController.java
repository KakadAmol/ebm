package com.cs.ebm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cs.ebm.service.LoginService;

@Controller
public class LoginController {

	private static final Logger logger = LogManager.getLogger(LoginController.class);

	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView checkLogin(HttpServletRequest request, HttpServletResponse response) {
		logger.info("login controller called.");
		String loginuser = request.getParameter("email");
		String password = request.getParameter("password");
		
		HttpSession session = request.getSession();
		logger.info("old session : " + session.getId());
		logger.info("session last access time : " + session.getLastAccessedTime());
		logger.info("max inactive time interval : " + session.getMaxInactiveInterval());
		if (!session.isNew()) {
			session.invalidate();
			session = request.getSession();
			session.setMaxInactiveInterval(0);
			logger.info("new session:" + session.getId());
		}
		
		int dbUsrId = 0;
		String dbEmail = null;
		String dbMobile = null;
		String dbPass = null;

		if (loginuser.equals(dbEmail) && password.equals(dbPass)) {
			if (loginuser.equals("null")) {
				System.out.println("null check");
			} else {
				System.out.println("success login");
				return new ModelAndView("dashboardAdmin", "Message", "Login successful");
			}
			return new ModelAndView("login", "Message", "Login successful");
		} else

		if (loginuser.equals("amruta") && password.equals("amruta")) {
			String dbUserFirstName = null;
			System.out.println(dbUsrId);
			request.getSession().setAttribute("userId", dbUsrId);
			request.getSession().setAttribute("userName", loginuser);

			System.out.println(dbUsrId + "fname " + loginuser + " " + dbEmail);
			if (loginuser.equals("null")) {
				System.out.println("null check");
				return new ModelAndView("login", "Message", "Login Falied.!");
			} else {
				System.out.println("success login");
				return new ModelAndView("dashboardAdmin", "Message", "Login successful");
			}
		}
		return new ModelAndView("dashboardAdmin", "Message", "Login successful");

	}

}
