package com.cjc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.cjc.model.MailInfo;

@Service
public class MailService {

	  @Autowired
	  private JavaMailSender mailSender;
	  
	
	public void sendMail(MailInfo info) {
		
		SimpleMailMessage message = new SimpleMailMessage();
	    message.setFrom(info.getFrom());
		message.setTo(info.getTo());
		message.setSubject(info.getSub());
		message.setText(info.getMsg());
		
		mailSender.send(message);
		
		System.out.println("Mail Send Success");
	}
}
