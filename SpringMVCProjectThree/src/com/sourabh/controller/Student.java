package com.sourabh.controller;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Size;

public class Student {

	private String studentName;

	@Size(min=3, max=30)
	private String studentHobby;
	
	private Long studentMobile;
	private Date studentDOB;
	private ArrayList<String> studentsSkills;
	
	private Address studentAddress;
	
	public Student() {}
	
	public Student(String studentName, String studentHobby, Long studentMobile, Date studentDOB,
			ArrayList<String> studentsSkills, Address studentAddress) {
		super();
		this.studentName = studentName;
		this.studentHobby = studentHobby;
		this.studentMobile = studentMobile;
		this.studentDOB = studentDOB;
		this.studentsSkills = studentsSkills;
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
	public ArrayList<String> getStudentsSkills() {
		return studentsSkills;
	}
	public void setStudentsSkills(ArrayList<String> studentsSkills) {
		this.studentsSkills = studentsSkills;
	}
	
	
	
}
