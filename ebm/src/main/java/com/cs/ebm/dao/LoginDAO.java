package com.cs.ebm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cs.ebm.pojo.Login;

@Repository
public interface LoginDAO extends JpaRepository<Login, Long> {


}
