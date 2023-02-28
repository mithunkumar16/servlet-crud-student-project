package com.harsh.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hm.student_servlet.dto.Student;
import com.hm.student_servlet.service.StudentService;

@WebServlet(value = "/stdDetails")
public class InsertStudentData extends  HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 int id=Integer.parseInt(req.getParameter("id"));
			String name=req.getParameter("name");
			String dob=req.getParameter("dob");
			String email=req.getParameter("email");
			long mobile=Long.parseLong(req.getParameter("mobile"));
			String gender=req.getParameter("gender");
			String course=req.getParameter("course");
			String password=req.getParameter("password");
			
			Student student=new Student();
			
			student.setStdId(id);
			student.setStdName(name);
			student.setStdDob(dob);
			student.setStdEmail(email);
			student.setMobile(mobile);
			student.setStdGender(gender);
			student.setStdCourse(course);
			student.setStdPassword(password);
			
			StudentService service=new StudentService();
			
			
			PrintWriter printWriter=resp.getWriter();
			printWriter.write("<html><body>");
			
			service.insertStudentData(student);
			
			printWriter.write("<h4 style='color:green'>data inserted successfully..</h4>");
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("StudentInsert.jsp");
			dispatcher.include(req, resp);
	}

}
