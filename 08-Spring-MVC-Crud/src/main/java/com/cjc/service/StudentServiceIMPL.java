package com.cjc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.dao.StudentDao;
import com.cjc.model.Student;

@Service
public class StudentServiceIMPL implements StudentService {

	@Autowired
	private StudentDao dao;

	public void saveStudent(Student stu) {

		dao.saveStudent(stu);

	}

	public List<Student> loginCheck(String uname, String pass) {

		if (uname.equals("Admin") && pass.equals("Admin@123"))
			return dao.getAllStudentRecords();

		return null;
	}

	public List<Student> deleteStudent(int rollno) {

		return dao.deleteStudent(rollno);
	}

	public Student editStudent(int rollno) {

		return dao.editStudent(rollno);
	}

	public List<Student> changeStatus(int rollno) {
		return dao.changeStatus(rollno);
		
	}

}
