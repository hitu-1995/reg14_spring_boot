package com.cjc.service;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cjc.jdbcmapper.EmployeeMapper;
import com.cjc.model.Employee;

@Component
public class DataBaseService {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	private Scanner sc;

	@Autowired
	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public void check() {

		 System.out.println("Enter employee Id ");
		 int eid = sc.nextInt();
		 String delete = "delete from employee where eid = "+eid+"";
		 jdbcTemplate.update(delete);

		   System.out.println(delete);

	}

	private void updateSalary() {
		System.out.println("Enter employee Id");
		int eid = sc.nextInt();

		System.out.println("Enter Employee salary");
		float esalary = sc.nextFloat();

		String update = "update  employee set esalary = " + esalary + " where eid = " + eid + "";

		jdbcTemplate.update(update);
		System.out.println(update);
	}

	private void selectEmployee() {
		System.out.println("Enter your Eid");
		int eid = sc.nextInt();
		System.out.println("Enter Your Salary ");
		float salary = sc.nextFloat();

		String select = "select * from employee where eid = ? and esalary = ?";

		Employee employee = jdbcTemplate.queryForObject(select, new Object[] { eid, salary }, new EmployeeMapper());
		System.out.println(employee);
	}

	private void insertEmployee() {
		System.out.println("Enter Your Eid");
		int eid = sc.nextInt();
		System.out.println("Enter Your name");
		String name = sc.next();
		System.out.println("Enter your salary");
		float salary = sc.nextFloat();
		System.out.println("Enter Your Designation");
		String desig = sc.next();

		String insert = "insert into employee values (" + eid + ",'" + name + "'," + salary + ",'" + desig + "')";

		jdbcTemplate.execute(insert);
		System.out.println(insert);
	}

	private void createTable() {
		String create = "create table employee (eid int , ename varchar(45)," + "esalary float, edesig varchar(45))";

		jdbcTemplate.execute(create); // null.execute(create);

		System.out.println("table is created");
	}
}
