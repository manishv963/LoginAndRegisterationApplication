package com.mrv.technology.ambrack.medical.stock.MediacalStockApplication.UserRegisteration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="userRegisteration")
public class Registeration {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SRNO")
	private long SRNO;
	
	private String loginId;
	private String loginPassword;
	private String fullName;
	private String email;

	private String mobile;
	
	@Transient
	private Date registerationDate;
	public Date getRegisterationDate() {
		return registerationDate;
	}
	public void setRegisterationDate(Date reisterationDate) {
		this.registerationDate = reisterationDate;
	}
	@Override
	public String toString() {
		return "UserRegisteration [SRNO=" + SRNO + ", loginId=" + loginId + ", loginPassword=" + loginPassword
				+ ", fullName=" + fullName + ", email=" + email + ", mobile=" + mobile + ", registerationDate="
				+ registerationDate + "]";
	}
	public long getSRNO() {
		return SRNO;
	}
	public void setSRNO(long sRNO) {
		SRNO = sRNO;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	

	
}