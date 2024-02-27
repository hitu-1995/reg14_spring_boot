package com.cjc.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.model.Student;
import com.cjc.service.StudentService;

@Controller
public class HomeController {

	@Autowired
	private StudentService service;

	@RequestMapping("/")
	public String landingPage() {

		System.out.println("landingPage :: Called");
		return "index";
	}

	@RequestMapping("/logPage")
	public String loginPage() {
		System.out.println(" loginPage  :: Called");
		return "login";
	}

	@RequestMapping("/regPage")
	public String regPage() {

		return "register";
	}

	@RequestMapping("/loginCheck")
	public String loginCheck(@RequestParam String uname, @RequestParam String pass, Model model) {

		List<Student> stuList = service.loginCheck(uname, pass);

		System.out.println(uname + "   " + pass);

		if (stuList != null) {
			model.addAttribute("data", stuList);
			return "success";
		} else
			return "login";
	}

	@RequestMapping("/reg")
	public String saveStudent(@ModelAttribute Student stu) {

		System.out.println(stu);

		service.saveStudent(stu);

		return "login";
	}
	@RequestMapping("/delete")
	public String deleteStudent(@RequestParam int rollno , Model model) {
		
		List<Student> list = service.deleteStudent(rollno);
		
		model.addAttribute("data", list);
		return "success";
	}
	@RequestMapping("/edit")
	public String editStudent(@RequestParam int rollno , Model model) {
	
		Student student = service.editStudent(rollno);
		model.addAttribute("stu", student);
		return "update";
	}
	
	@RequestMapping("/changeStatus")
	public String changeStatus(@RequestParam int rollno, Model model) {
		System.out.println(rollno);
	      List<Student> list = service.changeStatus(rollno);
	      model.addAttribute("data", list);
		return "success";
	}
}
