package com.hm.student_servlet.service;

import java.util.List;

import com.hm.student_servlet.dao.StudentDao;
import com.hm.student_servlet.dto.Student;

public class StudentService {

	StudentDao studentDao = new StudentDao();

	public void insertStudentData(Student student) {
		studentDao.insertStudentData(student);
	}

	public List<Student> displayStudent() {
		return studentDao.displayStudent();

	}

	public void deleteStudentData(int id) {
		studentDao.deleteStudentData(id);
	}

	public void updateStudent(int id, Student student) {
		studentDao.updateStudent(id, student);
	}

	public int getById(int id) {
		return studentDao.getById(id);
	}
}
