package com.sourabh.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController  {

	@RequestMapping("/hello")
	public ModelAndView helloPage() {
		ModelAndView model = new ModelAndView("hellocontroller");
		model.addObject("msg", "Hello...!!! This is a MVC project");
		
		return model;
	}
	


	@RequestMapping("/hi")
	public ModelAndView helloPageSecond() {
		ModelAndView model = new ModelAndView("hellocontroller");
		model.addObject("msg", "Hii...!!! This is a MVC project ");
		
		return model;
	}
	//*************************************************************************
	/*
	 * Way 1 :
	 */
	@RequestMapping("/hello/{name}")
	public ModelAndView helloPageThree(@PathVariable("name") String name) {
		ModelAndView model = new ModelAndView("hellocontroller");
		model.addObject("msg", "Hello " +name);
		
		return model;
	}
	
	@RequestMapping("/hello/{countryName}/{name}")
	public ModelAndView helloPageFour(@PathVariable("name") String name,@PathVariable("countryName") String country) {
		ModelAndView model = new ModelAndView("hellocontroller");
		model.addObject("msg", "Hello " +name +" Your are from "+country);
		
		return model;
	}
	//**************************************************************************
	/*
	 * Way 2 :
	 */


	@RequestMapping("/hi/{countryName}/{name}")
	public ModelAndView helloPageFive(@PathVariable Map<String,String>pathVar) {
		System.out.println(pathVar.isEmpty());
		String name = pathVar.get("name");
		String country = pathVar.get("countryName");
		
		ModelAndView model = new ModelAndView("hellocontroller");
		model.addObject("msg", "Hiii...!!! " +name +" Your are from "+country);
		
		return model;
	}
}
