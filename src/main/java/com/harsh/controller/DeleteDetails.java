package com.harsh.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hm.student_servlet.service.StudentService;
@WebServlet(value = "/Delete")
public class DeleteDetails extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		
		StudentService studentService=new StudentService();
		
		PrintWriter printWriter=resp.getWriter();
		studentService.deleteStudentData(id);
		
		printWriter.write("<html><body>");
		printWriter.write("<h4 style='color:green'>deleted data successfully..</h4>");
		RequestDispatcher dispatcher=req.getRequestDispatcher("StudentDisplay.jsp");
		dispatcher.include(req, resp);
	}

}
