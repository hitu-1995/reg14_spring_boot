package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cjc.model.Student;
import com.cjc.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping("/greet") // this annotation is use to make java method as a HTTP method
	@ResponseBody
	public String greet() {
		return "Welcome To CJC Akurdi";
	}

	@RequestMapping("/")
	public String landingPage() {
		return "index";
	}

	@RequestMapping("/loginPage")
	public String loginPage() {
		System.out.println("*********** loginPage :: called *****************");
		return "login";
	}
	@RequestMapping("/regPage")
	public String registerPage() {
		System.out.println("*********** registerPage :: called *****************");
		return "register";
	}


	@RequestMapping("/log")
	public String loginCheck(@RequestParam String uname, 
			                     @RequestParam String pass,
			                     Model model) {
		System.out.println(uname+"         "+pass);
		System.out.println("********* loginCheck :: Called");
		
		List<Student> list = studentService.loginCheck(uname, pass);
		 if(!list.isEmpty()) {
		    model.addAttribute("data", list);
			 return "success";
		 }
		 else
		return "login";
	}

	@RequestMapping("/reg")
	public String registerStudent(@ModelAttribute Student student) {
		System.out.println(student);
      
		studentService.saveStudent(student);
      
		return "index";
	}
	
	
	
}
