package com.cjc.configue;

import java.util.Properties;

import org.hibernate.cfg.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.cjc.model.Student;

@Configuration
@ComponentScan(basePackages = "com.cjc")
public class AppConfigue {

	
	@Bean
	public InternalResourceViewResolver	 resolver() {
		InternalResourceViewResolver resolver = 
				new InternalResourceViewResolver();
		resolver.setPrefix("/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	// jdbc connection
	@Bean
	public DriverManagerDataSource ds() {

		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/reg14");
		ds.setUsername("root");
		ds.setPassword("root");

		return ds;
	}

	// hibernate retated properties
	@Bean
	public LocalSessionFactoryBean factoryBean() {

		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		factoryBean.setDataSource(ds());

		Properties prop = new Properties();
		prop.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
		prop.put(Environment.HBM2DDL_AUTO, "update");
		prop.put(Environment.SHOW_SQL, true);

		factoryBean.setHibernateProperties(prop);
		factoryBean.setAnnotatedClasses(Student.class);

		return factoryBean;
	}

}
