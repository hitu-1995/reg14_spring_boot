package com.cjc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.cjc.model.Student;
import com.cjc.repository.StudentRepository;

@Service
public class StudentIMPL implements StudentService{

	@Autowired
	private StudentRepository studentRepo;
	
	@Autowired
	private JavaMailSender sender;
	
	
	
	@Override
	public void saveStudent(Student student) {
	
		studentRepo.save(student);
	    SimpleMailMessage mailMessage = new SimpleMailMessage();
	    mailMessage.setFrom("hiteshwankhede11@gmail.com");
	    mailMessage.setSubject("Registration Success In CJC");
	    mailMessage.setTo(student.getEmail());
	    mailMessage.setText("Thank You For Choosing us Your Registration is completed!!");
	    
	    sender.send(mailMessage);
	}



	@Override
	public List<Student> loginCheck(String uname, String pass) {
		if(uname.equals("admin")&&pass.equals("admin@123")) {
			
			return studentRepo.findAll();
		}
		else
		return new ArrayList<Student>();
	
	}

}
