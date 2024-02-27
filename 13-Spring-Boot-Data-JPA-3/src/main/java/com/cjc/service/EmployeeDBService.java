package com.cjc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Employee;
import com.cjc.repository.EmployeeRepository;

@Service
public class EmployeeDBService {

	  @Autowired
	  private EmployeeRepository employeeRepository;
	  
	
	public void check() {

		List<Employee> list = employeeRepository.findAllByEnameStartingWith("S");
		
		   for(Employee employee :list) {
				System.out.println("\n");
				System.out.println(employee);
				System.out.println("\n");
			   }
		
	}


	private void getAllLessThan() {
		List<Employee> list = employeeRepository.findAllBySalaryLessThanEqual(70000);
		
		   for(Employee employee :list) {
				System.out.println("\n");
				System.out.println(employee);
				System.out.println("\n");
			   }
	}


	private void getAllBySalaryBetween() {
		List<Employee> list = employeeRepository.findAllBySalaryBetween(35000, 95000);
		
		   for(Employee employee :list) {
				System.out.println("\n");
				System.out.println(employee);
				System.out.println("\n");
			   }
	}


	private void getDistinctbyDepartment() {
		List<Employee> list = employeeRepository.findDistinctByDepartmentAndDesignation("Dev", "Java Developer");
		
		   for(Employee employee :list) {
				System.out.println("\n");
				System.out.println(employee);
				System.out.println("\n");
			   }
	}


	private void getbyMobile() {
		Employee employee = employeeRepository.findByMobile(2334234);
		System.out.println("\n"+employee+"\n");
	}


	private void getAllByDepartnebt() {
		List<Employee> list = employeeRepository.findAllByDepartment("Dev");
		   
		   for(Employee employee :list) {
			System.out.println("\n");
			System.out.println(employee);
		   }
	}


	private void getAll() {
		List<Employee> list = employeeRepository.findAll();
		   
		   for(Employee employee :list) {
			System.out.println("\n");
			System.out.println(employee);
		   }
	}


	private void insertAll() {
		List<Employee> list = new ArrayList<Employee>();
		list.add( new Employee("Hitesh", "Pune", 989898989, "Java Developer", "Dev", 90000));
		list.add( new Employee("Saurabh", "Akurdi", 887878789, "Java Developer", "Dev", 100000));
		list.add( new Employee("Vishal", "Pune", 776767676 ,"QA Tester", "QA", 70000));
		list.add( new Employee("Bhagvat", "Mumbai",766598989, "Python Developer", "Dev",40000));
		list.add( new Employee("Shubhda", "Pune", 888788989, "Admin", "Admin", 30000));
		
		employeeRepository.saveAll(list);
	}
	
}
