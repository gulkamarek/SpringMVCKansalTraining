<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>First Name</td>
			<td>${fName}</td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td>${lName}</td>
		</tr>
		<tr>
			<td>Email</td>
			<td>${email}</td>
		</tr>
		<tr>
			<td>Mobile</td>
			<td>${mobile}</td>
		</tr>
	</table>

	<!-- / at the beginning of the url value indicates to the 
	browser to interpret the empty string as a base url 
	instead of current url-->
	<spring:url value="/user/list" var="list" />
	<a href="${list}">Get back to the list of all users</a>

</body>
</html>