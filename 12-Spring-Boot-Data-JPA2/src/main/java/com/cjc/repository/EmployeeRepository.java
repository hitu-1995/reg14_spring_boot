package com.cjc.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Employee;

@Repository
public interface EmployeeRepository  extends PagingAndSortingRepository<Employee, Integer>{

}
