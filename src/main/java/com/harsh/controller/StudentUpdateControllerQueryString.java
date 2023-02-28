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
@WebServlet("/UpdateStd")
public class StudentUpdateControllerQueryString extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		
		StudentDao dao=new StudentDao();
		
		Student student=dao.getEmloyeById(id);
		
		if(student!=null) {
			req.setAttribute("std", student);
			RequestDispatcher dispatcher=req.getRequestDispatcher("UpdateByQuery.jsp");
			dispatcher.forward(req, resp);
		}
	}
}
