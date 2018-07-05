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
	<form method="post" action="/HelloWorldXml/user/details">
		<!-- after clicking on the submit button the data from the form is 
		handed over to the controller that matches the request mapping from
	 	the action, this method will add data to the model and pass it to 
	 	another jsp that displays it -->
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

</body>
</html>