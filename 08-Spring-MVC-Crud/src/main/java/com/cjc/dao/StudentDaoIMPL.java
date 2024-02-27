package com.cjc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.model.Student;
import com.sun.org.apache.regexp.internal.recompile;

@Repository
public class StudentDaoIMPL implements StudentDao {

	@Autowired
	private SessionFactory factory;

	public void saveStudent(Student stu) {

		Session session = factory.openSession();
		session.saveOrUpdate(stu);
		session.beginTransaction().commit();

	}

	public List<Student> getAllStudentRecords() {

		Session session = factory.openSession();
		Query query = session.createQuery("from Student");
		List<Student> list = query.getResultList();

		return list;
	}

	public List<Student> deleteStudent(int rollno) {
		// logic to delete student
		Session session = factory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("delete from Student where rollno = :rn");
		query.setParameter("rn", rollno);
		query.executeUpdate();
		session.getTransaction().commit();
		
		return getAllStudentRecords();
	}

	public Student editStudent(int rollno) {

		 return factory.openSession().get(Student.class, rollno);

	}

	public List<Student> changeStatus(int rollno) {
		Session session = factory.openSession();
		Student student = session.get(Student.class, rollno);
		if(student.getAddress().equals("Pune"))
			student.setAddress("Mumbai");
		else
			student.setAddress("Pune");
		Transaction transaction = session.beginTransaction();
		session.update(student);
		transaction.commit();
		return getAllStudentRecords();
	}

}
