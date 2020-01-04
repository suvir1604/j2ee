<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee Details</h1>
	<form>
		<table>
			<tr>
				<td>Id</td>
				<td>:</td>
				<td><c:out value="${employee.id}"></c:out></td>
			</tr>

			<tr>
				<td>Name</td>
				<td>:</td>
				<td><input type="text" name="txtname" value="${employee.name}" /></td>
			</tr>

			<tr>
				<td>Gender</td>
				<td>:</td>
				<td><input type="radio" name="" value="${employee.gender}"
					checked />Male</td>
				<td><input type="radio" name="" value="female" /></td>
			</tr>

			<tr>
				<td>Date of Birth</td>
				<td>:</td>
				<td><input type="text" id="<fmt.formatDate  value="${Date}" />"
					value="${employee.dateofBirth}"></td>
			</tr>
		</table>
	</form>


</body>
</html>