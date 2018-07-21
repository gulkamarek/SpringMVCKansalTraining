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

	<spring:url value="/user/register/" var="register" />
	<a href="${register}">Register</a>
	<c:if test="${!empty userrList}">
		<table>
			<tr>
				<th>ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Mobile</th>
				<th>Settings</th>
			</tr>
			<c:forEach items="${userrList}" var="userr">
				<tr>
					<td><c:out value="${userr.userrId}" /></td>
					<td><c:out value="${userr.fName}" /></td>
					<td><c:out value="${userr.lName}" /></td>
					<td><c:out value="${userr.email}" /></td>
					<td><c:out value="${userr.mobile}" /></td>
					<td>
						<a href="<c:url value='/user/edit/${userr.userrId}' />">Edit</a>
						<a href="<c:url value='/user/details/${userr.userrId}' />">Details</a>
					</td>
					
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>