package com.cjc.configue;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitilizer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {

		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();

		context.register(AppConfigue.class);
		context.setServletContext(servletContext);

		ServletRegistration.Dynamic res = servletContext.addServlet("dispatcher", new DispatcherServlet(context));

		res.addMapping("/");
	}

}
