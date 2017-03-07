package com.sourabh.controller;

import java.text.SimpleDateFormat;
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
		//m.addObject("headerMsg", "***Engineering College***");
		
		return m;
	}
	
	/*@RequestMapping(value="/submitAdmissionForm.html",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam(value="studentName",defaultValue="Mr ABC")String name,@RequestParam("studentHobby")String hobby) {
		
		ModelAndView m = new ModelAndView("AdmissionSuccess");
		
		m.addObject("msg", "Submitted details are : Name = "+name+" Hobby = "+hobby);
		
		return m;
	}*/
	
	/*@RequestMapping(value="/submitAdmissionForm.html",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam("studentName")String name,
												@RequestParam("studentHobby")String hobby) {
		
		Student s = new Student();
		
		s.setStudentName(name);
		s.setStudentHobby(hobby);
		
		ModelAndView m = new ModelAndView("AdmissionSuccess");
		
		m.addObject("headerMsg", "***Engineering College***");
		m.addObject("s", s);
		
		return m;
	}*/
	
	@RequestMapping(value="/submitAdmissionForm.html",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("s") Student s,BindingResult r) {
		
		if(r.hasErrors()){
			ModelAndView m = new ModelAndView("AdmissionForm");
			return m;
		}
		
		ModelAndView m = new ModelAndView("AdmissionSuccess");
		
		//m.addObject("headerMsg", "***Engineering College***");
		
		
		return m;
	}
	
	@ModelAttribute
	public void addingCommonObject(Model model) {
		model.addAttribute("headerMsg", "***Engineering College***");
	}
}
