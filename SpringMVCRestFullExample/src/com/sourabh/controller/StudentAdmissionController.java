package com.sourabh.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setDisallowedFields(new String[]{"studentMobile"});
		SimpleDateFormat dF = new SimpleDateFormat("YYYY***MM***DD");
		binder.registerCustomEditor(Date.class, "studentDOB",new CustomDateEditor(dF, false));
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
	}
	
	@RequestMapping(value="/admissionForm.html", method= RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView m = new ModelAndView("AdmissionForm");
		
		return m;
	}
	
	@RequestMapping(value="/submitAdmissionForm.html",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("s") Student s,BindingResult r) {
		
		if(r.hasErrors()){
			ModelAndView m = new ModelAndView("AdmissionForm");
			return m;
		}
		
		ModelAndView m = new ModelAndView("AdmissionSuccess");
		
		
		return m;
	}
	
	@ModelAttribute
	public void addingCommonObject(Model model) {
		model.addAttribute("headerMsg", "***Engineering College***");
	}
	
	@ResponseBody
	@RequestMapping(value = "/students" , method = RequestMethod.GET)
	public ArrayList<Student> getStudentList() {
		
		Student s1 = new Student();
		s1.setStudentName("Shakkal");
		Student s2 = new Student();
		s2.setStudentName("Bhokal");
		Student s3 = new Student();
		s3.setStudentName("Nishal");
		
		ArrayList<Student> al = new ArrayList<>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		return al;
	}
}
