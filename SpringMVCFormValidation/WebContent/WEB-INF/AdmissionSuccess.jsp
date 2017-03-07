<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Congratulations..!!!</h1>
	<h1>${headerMsg}</h1>
	<%-- <h2>${msg}</h2> --%>
	<table>
		<tr>
			<td>Student Name :</td>
			<td>${s.studentName}</td>
		</tr>
		
		<tr>
			<td>Student Hobby :</td>
			<td>${s.studentHobby}</td>
		</tr>
		
		<tr>
			<td>Student Mobile :</td>
			<td>${s.studentMobile}</td>
		</tr>
		
		<tr>
			<td>Student Date of birth :</td>
			<td>${s.studentDOB}</td>
		</tr>
		
		<tr>
			<td>Student Skills Set :</td>
			<td>${s.studentsSkills}</td>
		</tr>
	
		<table>
		<tr>
			<td>Student Address :</td>
		</tr>
		<tr>
			<td>Country : ${s.studentAddress.country}</td>
			<td>City : ${s.studentAddress.city}</td>
			<td>Street :${s.studentAddress.street}</td>
			<td>Pincode : ${s.studentAddress.pincode}</td>
		</tr>
		</table>
		
	</table>
	
</body>
</html>