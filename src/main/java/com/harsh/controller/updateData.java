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
@WebServlet(value = "/stdUpdate")
public class updateData extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		StudentService studentService=new StudentService();
		Student student = new Student();
		
		int id=Integer.parseInt(req.getParameter("id"));
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String course=req.getParameter("course");
		
		student.setStdId(id);
		student.setStdName(name);
		student.setStdEmail(email);
		student.setStdCourse(course);
		
		
		PrintWriter printWriter=resp.getWriter();
		printWriter.write("<html><body>");
		
		
		int iddatabase=studentService.getById(id);
		if(iddatabase!=0) {
			
			studentService.updateStudent(id, student);
			printWriter.write("<h4 style='color:green'>data updated successfully..</h4>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("StudentEdit.jsp");
			dispatcher.include(req, resp);
		}
		else {
			printWriter.write("<h4 style='color:red'>"+id+"id is not found ?</h4>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("StudentEdit.jsp");
			dispatcher.include(req, resp);
		}
	}

}
