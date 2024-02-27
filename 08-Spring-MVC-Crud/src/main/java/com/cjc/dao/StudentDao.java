package com.cjc.dao;

import java.util.List;

import com.cjc.model.Student;

public interface StudentDao {

	void saveStudent(Student stu);

	List<Student> getAllStudentRecords();

	List<Student> deleteStudent(int rollno);

	Student editStudent(int rollno);

	List<Student> changeStatus(int rollno);

}
