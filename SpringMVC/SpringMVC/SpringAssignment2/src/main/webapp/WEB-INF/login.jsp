<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:errors path="User*"/>
	
	<h1>Please enter your DETAILS : </h1>
	
	<form action = "/FirstSpringMVCProject/submit.html" method = "post">
	
		<p>
			User Name : <input type="text" name="username"/>
		</p>
		
		<p>
			Password : <input type="text" name="password"/>
		</p>		
	
		<input type="submit" value="Authenticate"/>
	
	</form>

</body>
</html>