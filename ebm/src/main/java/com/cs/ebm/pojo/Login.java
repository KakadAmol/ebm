package com.cs.ebm.pojo;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Login {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userid;
	private String email;
	private String password;
	private String usertype;
	private String status;

	public Login() {
		// TODO Auto-generated constructor stub
	}

	public Login(Long userid, String email, String password, String usertype, String status) {
		super();
		this.userid = userid;
		this.email = email;
		this.password = password;
		this.usertype = usertype;
		this.status = status;
	}

	public Long getuserid() {
		return userid;
	}

	public void setuserid(Long userid) {
		this.userid = userid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, password, status, userid, usertype);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Login other = (Login) obj;
		return Objects.equals(email, other.email) && Objects.equals(password, other.password)
				&& Objects.equals(status, other.status) && Objects.equals(userid, other.userid)
				&& Objects.equals(usertype, other.usertype);
	}

	@Override
	public String toString() {
		return "Login [userid=" + userid + ", email=" + email + ", password=" + password + ", usertype=" + usertype
				+ ", status=" + status + "]";
	}

}
