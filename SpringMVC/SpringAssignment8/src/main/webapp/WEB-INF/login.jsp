<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:errors path="user1*"/>
	<a href="/FirstSpringMVCProject/login.html?siteLanguage=en">Login(English)</a>
	<a href="/FirstSpringMVCProject/login.html?siteLanguage=fr">Login(French)</a>  
	<a href="/FirstSpringMVCProject/login.html?siteLanguage=vi">Login(Vietnamese)</a>
	
	<h1>Please enter your DETAILS : </h1>
	
	<form>
		<p>
			<spring:message code="username"/> <input type="text" name="username"/>
		</p>
		<p>
			<spring:message code="password"/> <input type="text" name="password"/>
		</p>
				
			<spring:message code="submit.login"/> <input type="submit" value="Login"/>
	</form>


</body>
</html>