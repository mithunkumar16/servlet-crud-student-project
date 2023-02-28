package com.harsh.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hm.student_servlet.dao.StudentDao;
import com.hm.student_servlet.dto.Student;
@WebServlet("/stdUpdates")
public class UpdateControllerEmployeQuery extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String course=req.getParameter("course");
		
		Student student = new Student();
		
		student.setStdId(id);
		student.setStdName(name);
		student.setStdEmail(email);
		student.setStdCourse(course);
		
		StudentDao studentDao=new StudentDao();
		studentDao.updateStdByQueryString(id, student);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("StudentDisplay.jsp");
		dispatcher.forward(req, resp);
		
		
	}
}
