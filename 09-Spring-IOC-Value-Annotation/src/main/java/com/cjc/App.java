package com.cjc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cjc.config.BeanConfiguration;
import com.cjc.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        
        System.out.println(context.getBeanDefinitionCount());
         
        Student student = context.getBean("studentBean",Student.class);
        System.out.println(student);
    }
}
