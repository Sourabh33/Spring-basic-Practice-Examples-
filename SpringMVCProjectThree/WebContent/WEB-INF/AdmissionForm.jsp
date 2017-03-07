<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1>Student Admission Form </h1>
	
	<h1>${headerMsg}</h1>
	<form:errors path="s.*"/>
	
	<form action="/SpringMVCProjectThree/submitAdmissionForm.html" method="post">
		
		<table>
		
		<tr>
			<td>Student's Name :</td>
			
			<td><input type="text" name="studentName"></td>
		
		</tr>
			 
		<tr>
			<td>Student's Hobby :</td>
			
			<td><input type="text" name="studentHobby"></td>
		
		</tr>
		
		<tr>
			
			<td>Student's Mobile : </td><td><input type="text" name="studentMobile"></td>
		
		</tr>
		
		<tr>
			
			<td>Student's DOB :</td><td> <input type="text" name="studentDOB"></td>
		
		</tr>
		
		<tr>
			<td> Student's Skills Set :</td> <td> <select name="studentsSkills" multiple="multiple">
													<option value="Java Core">Java Core</option>
													<option value="Spring Core">Spring Core</option>
													<option value="Spring MVC">Spring MVC</option>															
													</select></td>
		</tr>
		
		<tr>
			<td> Student's Address :</td>
		</tr>
		<tr>
			<td>Country : </td><td> <input type="text" name="studentAddress.country"></td>
			<td>City : </td><td> <input type="text" name="studentAddress.city"></td>
			<td>Street : </td><td> <input type="text" name="studentAddress.street"></td>
			<td>PinCode : </td><td> <input type="text" name="studentAddress.pincode"></td>
		</tr>
		
		<tr>
			<td> <input type="submit" value="Submit Here"></td>
		</tr>
		
		
		</table>
	
	</form>
</body>
</html>