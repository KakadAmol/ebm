package com.cs.ebm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cs.ebm.pojo.Enquiry;
import com.cs.ebm.pojo.User;
import com.cs.ebm.service.EnquiryService;
import com.cs.ebm.service.UserService;
import com.cs.ebm.utils.PasswordUtil;

@Controller
public class EnquiryController {

	private static final Logger logger = LogManager.getLogger(EnquiryController.class);

	@Autowired
	EnquiryService enquiryService;

	@RequestMapping(value = "/addEnquiry", method = RequestMethod.POST)
	public ModelAndView addEnquiry(@ModelAttribute Enquiry enquiry) {
		logger.info(getClass() + "| addEnquiry | method called !");
		enquiryService.addEnquiry(enquiry);
		return new ModelAndView("usrAddEnquiry", "Message", "Enquiry Successful ! Our Customer Care Executive Connect you on your preffered time Thank You !");
	}

}
