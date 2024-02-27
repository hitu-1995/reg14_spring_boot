package com.cjc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.cjc.model.Employee;
import com.cjc.repository.EmployeeRepository;

@Component
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public void check() {

	}

	private void sortAndPage3() {
		PageRequest request = PageRequest.of(0, 11, Sort.by("department"));

		Page<Employee> page = employeeRepository.findAll(request);
		List<Employee> list = page.stream().filter(n -> n.getDepartment().equals("HR")).collect(Collectors.toList());

		for (Employee employee : list) {
			System.out.println("------------------------------------");
			System.out.println(employee);
		}
	}

	private void sortAndPage2() {
		PageRequest request = PageRequest.of(0, 3, Sort.by("department").and(Sort.by("name")));
		Page<Employee> page = employeeRepository.findAll(request);

		for (Employee employee : page) {
			System.out.println("------------------------------------");
			System.out.println(employee);
		}
	}

	private void sortAndPage1() {
		PageRequest request = PageRequest.of(0, 3, Sort.by("department").ascending());
		Page<Employee> page = employeeRepository.findAll(request);

		for (Employee employee : page) {
			System.out.println("------------------------------------");
			System.out.println(employee);
		}
	}

	private void pageRequest() {
		PageRequest request = PageRequest.of(2, 2);
		Page<Employee> page = employeeRepository.findAll(request);

		for (Employee employee : page) {
			System.out.println("------------------------------------");
			System.out.println(employee);
		}
	}

	private void simplePage() {
		Pageable pageable = Pageable.ofSize(3);
		Page<Employee> page = employeeRepository.findAll(pageable);

		for (Employee employee : page) {
			System.out.println(employee);
		}
	}

	private void checkExistance() {
		boolean flag = employeeRepository.existsById(103);

		System.out.println("Record 103 is Present in table : " + flag);
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

		for (Employee employee : list) {
			System.out.println("----------------------------------");
			System.out.println(employee);
		}
	}

	private void selectSingle() {
		Optional<Employee> optional = employeeRepository.findById(101);
		if (optional.isPresent())
			System.out.println(optional.get());
		else
			System.out.println("Record Not Found !!!");
	}

	private void selectAll() {
		Iterable<Employee> list = employeeRepository.findAll();

		for (Employee employee : list) {
			System.out.println("----------------------------------");
			System.out.println(employee);
		}
	}

	private void inserMultiple() {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(107, "Sachin", "Dev", "Developer", 50000));
		empList.add(new Employee(108, "Sehwag", "Testing", "Teter", 60000));
		empList.add(new Employee(109, "Yuvraj", "HR", "Jr HR", 90000));
		empList.add(new Employee(110, "Dhoni", "Admin", "Counselor", 80000));
		empList.add(new Employee(111, "Pathan", "Dev", "Developer", 70000));

		employeeRepository.saveAll(empList);
	}

	private void saveSingle() {
		Employee employee = new Employee(101, "Hitesh", "Dev", "Developer", 90000);

		employeeRepository.save(employee);
	}

}
