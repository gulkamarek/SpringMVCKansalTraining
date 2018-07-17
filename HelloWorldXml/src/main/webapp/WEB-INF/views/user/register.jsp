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
	<h3>User registration form</h3>
		<!-- after clicking on the submit button the data from the form is 
		handed over to the controller that matches the request mapping from
	 	the action, this method will add data to the model and pass it to 
	 	another jsp that displays it -->
	<!-- normal html form
	<form method="post" action="/HelloWorldXml/user/details">
		<table>
			<tr>
				<td>First Name :</td>
				<td><input type="text" name="fName" /></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="lName" /></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Mobile :</td>
				<td><input type="text" name="mobile" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add User"></td>
			</tr>
		</table>
	</form>
	-->
	<!-- Spring form -->
	<!-- URL variable with the name of the handler, because we want to pass it to the handler -->
	<c:url var="action" value="create"/>
	<!-- userr is the form backing object -->
	<form:form method="post" action="${action}" modelAttribute="userr">
		<table>
			<tr>
				<!-- path = name of the userr's property -->
				<td><form:label path="fName">First Name</form:label></td>
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