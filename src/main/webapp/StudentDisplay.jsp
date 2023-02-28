<%@page import="com.hm.student_servlet.dto.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.hm.student_servlet.dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DisplayStudent</title>

<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 70%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
</head>
<body>


	<h2>Student Details</h2>

	<%
	StudentDao dao = new StudentDao();
	List<Student> std = dao.displayStudent();
	%>

	<table>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>DOB</th>
			<th>EMAIL</th>
			<th>GENDER</th>
			<th>COURSE</th>
			<th>PASSWORD</th>
			<th></th>
			<th></th>
		</tr>
		<%
		for (Student student : std) {
		%>
		<tr>
			<td><%=student.getStdId()%></td>
			<td><%=student.getStdName()%></td>
			<td><%=student.getStdDob()%></td>
			<td><%=student.getStdEmail()%></td>
			<td><%=student.getStdGender()%></td>
			<td><%=student.getStdCourse()%></td>
			<td><%=student.getStdPassword()%></td>

			<td><a href="Delete?id=<%=student.getStdId()%>">Delete</a></td>
			<td><a href="UpdateStd?id=<%=student.getStdId()%>">Edit</a></td>

		</tr>
		<%
		}
		%>
	</table>
	<br>
	<a href="index.jsp" type="submit">Back</a>
</body>
</html>