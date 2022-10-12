package com.cs.ebm.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs.ebm.controller.LoginController;
import com.cs.ebm.dao.LoginDAO;
import com.cs.ebm.pojo.Login;
import com.cs.ebm.utils.PasswordUtil;

@Service
public class LoginService {

	private static final Logger logger = LogManager.getLogger(LoginService.class);

	@Autowired
	private LoginDAO loginDao;

	@Autowired
	EntityManager entityManager;

	public List validateUser(String email, String password) {
		String passwordInMD5 = PasswordUtil.getPasswordInMD5(password);
		Query query = entityManager.createNativeQuery("select * from login where email = :email AND password = :pass",
				Login.class);
		query.setParameter("email", email);
		query.setParameter("pass", passwordInMD5);
		List list = query.getResultList();
		logger.info(list);
		return query.getResultList();
	}

}
