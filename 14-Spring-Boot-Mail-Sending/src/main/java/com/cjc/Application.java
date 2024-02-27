package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cjc.model.MailInfo;
import com.cjc.service.MailService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		MailService service = context.getBean(MailService.class);
		
		MailInfo info = new MailInfo();
		info.setFrom("hiteshwankhede11@gmail.com");
		info.setTo("nikamharshada2000@gmail.com");
		info.setSub("Regarding Irregular ");
		info.setMsg("Hello Harshda please come regular to class.");
		
		service.sendMail(info);
	}

}
