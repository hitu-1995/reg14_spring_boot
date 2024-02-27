package com.cjc.jdbcmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cjc.model.Employee;

public class EmployeeMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEid(rs.getInt("eid"));
		employee.setName(rs.getString("ename"));
		employee.setSalary(rs.getFloat("esalary"));
		employee.setDesignation(rs.getString("edesig"));

		return employee;
	}

}
