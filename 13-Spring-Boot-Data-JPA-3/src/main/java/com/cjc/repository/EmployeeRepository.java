package com.cjc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cjc.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
 
	 List<Employee> findAllByDepartment(String department);
	 
	 Employee findByMobile(long mobile);
	 
	 List<Employee> findDistinctByDepartmentAndDesignation(String department, String designation);
	 
	 List<Employee> findAllBySalaryBetween(double range1 , double range2);
	 
	 List<Employee> findAllBySalaryLessThanEqual(double salary);
	 
	 List<Employee> findAllByEnameStartingWith(String firstCharecter);
	 
	 
}
