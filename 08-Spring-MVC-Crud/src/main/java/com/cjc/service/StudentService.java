package com.cjc.service;

import java.util.List;

import com.cjc.model.Student;

public interface StudentService {

	// this method will saveStudent into db
	void saveStudent(Student stu);

	List<Student> loginCheck(String uname, String pass);

	List<Student> deleteStudent(int rollno);

	Student editStudent(int rollno);

	List<Student> changeStatus(int rollno);

}
