package com.hm.student_servlet.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hm.student_servlet.dto.Student;

public class StudentDao {

	EntityManagerFactory eMF = Persistence.createEntityManagerFactory("mithun");
	EntityManager eM = eMF.createEntityManager();
	EntityTransaction eT = eM.getTransaction();

	public void insertStudentData(Student student) {
		eT.begin();
		eM.persist(student);
		eT.commit();
	}

	public List<Student> displayStudent() {
		String select = "select s from Student s";
		Query query = eM.createQuery(select);
		return query.getResultList();

	}
	
//	public List<Student> displayStudent(int id) {
//		String select = "select s from Student s where id="+id+"";
//		Query query = eM.createQuery(select);
//		return query.getResultList();
//
//	}

	public void deleteStudentData(int id) {
		Student student1 = eM.find(Student.class, id);
		if (student1 != null) {
			eT.begin();
			eM.remove(student1);
			eT.commit();
		}
	}

	public void updateStudent(int id, Student student) {

		Student student1 = eM.find(Student.class, id);
		if (student1 != null) {
			if (student1.getStdId() != 0) {

				student1.setStdName(student.getStdName());
				student1.setStdEmail(student.getStdEmail());
				student1.setStdCourse(student.getStdCourse());

				eT.begin();
				eM.merge(student1);
				eT.commit();

			}
		}
	}
	
	public void updateStdByQueryString(int id, Student student) {
		Student student3=eM.find(Student.class, id);
		if(student3!=null) {
			student3.setStdName(student.getStdName());
			student3.setStdEmail(student.getStdEmail());
			student3.setStdCourse(student.getStdCourse());

			eT.begin();
			eM.merge(student3);
			eT.commit();
			
		}
		
	}

	public Student getEmloyeById(int id) {
		Student student2 = eM.find(Student.class, id);
		if (student2 != null) {
			return student2;
		}
		return null;	
	}
	
	//  get By Id
	
	public int getById(int id) {
		Student student1 = eM.find(Student.class, id);
		if (student1 != null) {
			return student1.getStdId();
		}
		return 0;	
	}
}
