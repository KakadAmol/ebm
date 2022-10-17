package com.cs.ebm.controller;

import java.util.List;

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

import com.cs.ebm.pojo.Login;
import com.cs.ebm.service.LoginService;

@Controller
public class LoginController {

	private static final Logger logger = LogManager.getLogger(LoginController.class);

	@Autowired
	LoginService loginService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView checkLogin(HttpServletRequest request, HttpServletResponse response) {
		logger.info("login controller called.");
		// get user email and password forom UI
		String loginuser = request.getParameter("email");
		String password = request.getParameter("password");

		// Invalidate old session and generate new session
		HttpSession session = request.getSession();
		if (!session.isNew()) {
			session.invalidate();
			session = request.getSession();
			session.setMaxInactiveInterval(0);
			logger.info("new session:" + session.getId());
		}

		List<Login> ll = loginService.validateUser(loginuser, password);
		Long userId = 0l;
		String email = null;
		String username = null;
		String usertype = null;
		if (ll.isEmpty()) {
			logger.info("user not found");
			return new ModelAndView("login", "Message", "Incorrect userid password");
		} else {
			for (Login login : ll) {
				userId = login.getuserid();
				email = login.getEmail();
				username = login.getUsername();
				usertype = login.getUsertype();
				// set value in session for access in UI
				session.setAttribute("userId", userId);
				session.setAttribute("userName", username);
				session.setAttribute("userEmail", email);
				session.setAttribute("userType", usertype);
			}
			logger.info("user found");
			if (usertype.equals("admin")) {
				return new ModelAndView("dashboardAdmin", "Message", "Admin Login successful");
			} else if (usertype.equals("operation")) {
				return new ModelAndView("dashboardOperation", "Message", "Operation Login successful");
			} else if (usertype.equals("user")) {
				return new ModelAndView("dashboardUser", "Message", "User Login successful");
			}else if (usertype.equals("vendor")) {
				return new ModelAndView("dashboardVendor", "Message", "Vendor Login successful");
			}
		}
		return null;
	}

}
