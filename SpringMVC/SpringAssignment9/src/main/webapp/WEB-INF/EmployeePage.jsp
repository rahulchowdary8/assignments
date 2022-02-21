<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Employees List</h1>
	<table border="2" width="70%">
	<tr><th>Id</th><th>Name</th><th>Salary</th></tr>
   
   		<c:forEach var="emp" items="${msg}">
   
   		<tr>
   		<td>${emp.id}</td>
   		<td>${emp.name}</td>
   		<td>${emp.salary}</td>
   		</tr>
   		</c:forEach>
</table>
   		<a href="/SpringMVCMaven/viewemp/1">1</a>
   		<a href="/SpringMVCMaven/viewemp/2">2</a>
   		<a href="/SpringMVCMaven/viewemp/3">3</a>

</body>
</html>