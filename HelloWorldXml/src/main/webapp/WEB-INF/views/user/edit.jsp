<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>User edit form</h3>
	<spring:url value="/user/list" var="list"/>
	<a href="${list}" >User List</a>
	
	<!-- this is sending the data to the URL:"update" that correspond to the handler request mapping responsible for   -->
	<c:url var="action" value="/user/update"/>
	
	<!-- model attribute is accessing to the mode (the map to which in the controller a key and the value were inserted) -->
	<form:form method="post" action="${action}" modelAttribute="userr">
		<table>
			<tr>
				<!-- path = name of the userr's property -->
				<td>
					<form:hidden path="userrId"/>
					<form:label path="fName">First Name</form:label>
				</td>
				<td><form:input path="fName" /></td>
			</tr>
			<tr>
				<td><form:label path="lName">Last Name</form:label></td>
				<td><form:input path="lName" /></td>
			</tr>
			<tr>
				<td><form:label path="email">Email</form:label></td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td><form:label path="mobile">Mobile</form:label></td>
				<td><form:input path="mobile" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add User"></td>
			</tr>
		</table>
	</form:form>

</body>
</html>