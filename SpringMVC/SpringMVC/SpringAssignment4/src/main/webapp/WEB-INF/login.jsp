<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <head><title>You are Registered..!!</title></head>
	 
	<h1>Please enter your DETAILS for Login: </h1>
	
	<form action="/FirstSpringMVCProject/Check.html" method="post">
		<p>
			Username : <input type="text" name="username"/>
		</p>
		<p>
			Password : <input type="text" name="password"/>
		</p>
				
			 <input type="submit" value="Login"/>
	</form>



</body>
</html>