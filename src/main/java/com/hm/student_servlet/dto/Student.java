package com.hm.student_servlet.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int stdId;
	private String stdName;
	private String stdDob;
	private String stdGender;
	private String stdEmail;
	private Long mobile;
	private String stdCourse;
	private String stdPassword;
	
	public Student() {
		super();
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdDob() {
		return stdDob;
	}

	public void setStdDob(String stdDob) {
		this.stdDob = stdDob;
	}

	public String getStdGender() {
		return stdGender;
	}

	public void setStdGender(String stdGender) {
		this.stdGender = stdGender;
	}

	public String getStdEmail() {
		return stdEmail;
	}

	public void setStdEmail(String stdEmail) {
		this.stdEmail = stdEmail;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getStdCourse() {
		return stdCourse;
	}

	public void setStdCourse(String stdCourse) {
		this.stdCourse = stdCourse;
	}

	public String getStdPassword() {
		return stdPassword;
	}

	public void setStdPassword(String stdPassword) {
		this.stdPassword = stdPassword;
	}
	
	
	

}
