<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Student Data</title>



</head>
<body>
	<div class="stdRegform">
	
	<form action="stdDetails" class="stdform">
		<h2>Student Registration</h2>
		<label>Enter Student Id : </label> <br>
		<input name="id" class="inputForm" type="text" placeholder="plese enter your id" required="required"><br>
		
		<label>Enter Student Name : </label> <br>
		<input name="name" class="inputForm" type="text" placeholder="plese enter your name" required="required"><br>
		
		<label>Student D.O.B : </label><br>
		<input name="dob" class="inputForm" type="date" required="required"><br>
		
		<label>Enter Student Email : </label><br>
		<input name="email" class="inputForm" type="text" placeholder="example@gamil.com" required="required"><br>
		
		<label>Enter Student Mobile No. : </label><br> 
		<input name="mobile" class="inputForm" type="text" placeholder="790304****" required="required"><br>
		
		<label>Gender : </label><br>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
		<input name="gender" type="radio" value="Male" checked="checked"> Male 
		<input name="gender" type="radio" value="Femaile"> Female<br>
		
	    <label>Select Course : </label> <br>
		<select name="course" class="inputForm1">
		    <option class="inputForm" value="Java">--- select item ---</option>
			<option value="Java">Core Java</option>
			<option value="Jdbc">JDBC</option>
			<option value="Jervlet">SERVLET</option>
			<option value="Hibernate">HIBERNATE</option>
			<option value="Spring_Boot">SPRING BOOT</option>
			<option value="Html">HTML</option>
			<option value="css">CSS</option>
			<option value="javascript">JAVASCRIPT</option>
		</select><br>
		 <label>Password : </label><br>
		  <input name="password" class="inputForm" type="password" placeholder="plese enter your password" required="required"><br>
		<br>
		 <input class="rgbtn" type="submit" value="Register">&nbsp&nbsp&nbsp&nbsp&nbsp<button class="btn" ><a href="index.jsp">Back</a> </button>
	</form>
	</div><br>



</body>
</html>