package com.sourabh.controller;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.sourabh.custom.annotation.IsValidHobby;
import com.sourabh.custom.annotation.IsValidHobbyWithParam;

public class Student {

	@Pattern(regexp="[^0-9]*")
	private String studentName;

	/*
	 * Two ways of displaying error message
	 */
	//@Size(min=3, max=30,message="Please enter value for studnetHobby between a size of 3 and 30")
	//@Size(min=3, max=30,message="Please enter value for studnetHobby between a size of {min} and {max}")
	@Size(min=3,max=30)@IsValidHobbyWithParam(listOfValidHobbies="Music|Football|Cricket|Hockey")
	private String studentHobby;
	
	@Max(222)
	private Long studentMobile;
	
	@Past
	private Date studentDOB;
	private ArrayList<String> studentSkills;
	
	private Address studentAddress;
	
	public Student() {}
	
	public Student(String studentName, String studentHobby, Long studentMobile, Date studentDOB,
			ArrayList<String> studentSkills, Address studentAddress) {
		super();
		this.studentName = studentName;
		this.studentHobby = studentHobby;
		this.studentMobile = studentMobile;
		this.studentDOB = studentDOB;
		this.studentSkills = studentSkills;
		this.studentAddress = studentAddress;
	}

	public Address getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
	this.studentHobby = studentHobby;
	}
		public Long getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}
	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}
	
	
	
}
