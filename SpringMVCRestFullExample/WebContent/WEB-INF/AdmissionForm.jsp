<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="/SpringMVCInternationalisationExample/admissionForm.html?siteLanguage=en">English</a>
	|<a href="/SpringMVCInternationalisationExample/admissionForm.html?siteLanguage=fr">French</a>
	<h1>Student Admission Form </h1>
	<h3> <spring:message code="label.admissionForm"/> </h3>
	<h1>${headerMsg}</h1>
	<h3> <spring:message code="label.headerMsg"/> </h3>
	<form:errors path="s.*"/>
	
	<form action="/SpringMVCInternationalisationExample/submitAdmissionForm.html" method="post">
		
		<table>
		
		<tr><td>        <spring:message code="label.studentName"/>    	</td><td>          <input type="text" name="studentName">   		</td></tr>
			 
		<tr><td>        <spring:message code="label.studentHobby"/>   	</td><td>          <input type="text" name="studentHobby">  		</td></tr>
		
		<tr><td>        <spring:message code="label.studentMobile"/>  	</td><td>		   <input type="text" name="studentMobile"> 		</td></tr>
		
		<tr><td>        <spring:message code="label.studentDOB"/>     	</td><td> 		   <input type="text" name="studentDOB">    		</td></tr>
		
		<tr><td> 		<spring:message code="label.studentSkills"/>	</td><td>   	   <select name="studentSkills" multiple="multiple">
																   <option value="Java Core">Java Core</option>
																   <option value="Spring Core">Spring Core</option>
																   <option value="Spring MVC">Spring MVC</option>															
																									</select>       </td></tr>
		</table>
		
		<table>
			<tr><td>   <spring:message code="label.studentAddress"/>    </td></tr>
			
			<tr>
						<td><spring:message code="label.country"/> </td><td> <input type="text" name="studentAddress.country"></td>
						<td><spring:message code="label.city"/> </td><td> <input type="text" name="studentAddress.city"></td>
						<td><spring:message code="label.street"/> </td><td> <input type="text" name="studentAddress.street"></td>
						<td><spring:message code="label.pincode"/> </td><td> <input type="text" name="studentAddress.pincode"></td>
			</tr>
		
		<tr>
			<td> <input type="submit" value="<spring:message code="label.submit.admissionForm"/>"></td>
		</tr>
		
		
		</table>
	
	</form>
</body>
</html>