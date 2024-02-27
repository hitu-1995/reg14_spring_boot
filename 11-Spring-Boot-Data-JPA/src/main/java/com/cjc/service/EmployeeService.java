package com.cjc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cjc.model.Employee;
import com.cjc.repository.EmployeeRepository;

@Component
public class EmployeeService {

	@Autowired
	private  EmployeeRepository employeeRepository;
	
	 public void check() {

	  inserMultiple();
	  
	}

	private void checkExistance() {
		boolean flag = employeeRepository.existsById(103);
		  
		  System.out.println("Record 103 is Present in table : "+flag);
	}

	private void countRecords() {
		System.out.println("---------------------------");
		long count = employeeRepository.count();
          System.out.println(count);
	}

	private void deleteMultiple() {
		List<Integer> ids = new ArrayList<Integer>();
		 ids.add(102);
		 ids.add(103);
 employeeRepository.deleteAllById(ids);
	}

	private void deleteSingle() {
		employeeRepository.deleteById(105);
	}

	private void selectMultiplebyPrimaryKey() {
		List<Integer> ids = new ArrayList<Integer>();
		 ids.add(103);
		 ids.add(101);
		 
		   Iterable<Employee> list = employeeRepository.findAllById(ids);

		   for(Employee employee:list) {
			   System.out.println("----------------------------------");
			   System.out.println(employee);
		   }
	}

	private void selectSingle() {
		Optional<Employee> optional = employeeRepository.findById(101);
	        if(optional.isPresent())
	        	System.out.println(optional.get());
	        else
	        	System.out.println("Record Not Found !!!");
	}

	private void selectAll() {
		Iterable<Employee> list = employeeRepository.findAll();
		   
		   for(Employee employee:list) {
			   System.out.println("----------------------------------");
			   System.out.println(employee);
		   }
	}

	private void inserMultiple() {
		List<Employee> empList = new ArrayList<Employee>();
		  empList.add(new Employee(101, "Hitesh", "Dev", "Developer", 90000));
		  empList.add(new Employee(102, "Saurabh", "Testing", "Teter", 190000));
		  empList.add(new Employee(103, "Vishal", "HR", "Jr HR", 40000));
		  empList.add(new Employee(104, "Bhagvat", "Admin", "Counselor", 60000));
		  empList.add(new Employee(105, "Swapnil", "Dev", "Developer", 60000));
		
		  employeeRepository.saveAll(empList);
	}

	private void saveSingle() {
		Employee employee = new Employee(101, "Hitesh", "Dev", "Developer", 90000);
		
		employeeRepository.save(employee);
	}
	
}
