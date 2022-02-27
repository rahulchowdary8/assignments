<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Please enter your DETAILS for Login: </h1>
	
	<form action="/FirstSpringMVCProject/vcheck.html" method="post">
		<p>
			Username : <input type="text" name="username" required/>
		</p>
		<p>
			Password : <input type="text" name="password" required/>
		</p>
				
			 <input type="submit" value="Login"/>
	</form>

</body>
</html>