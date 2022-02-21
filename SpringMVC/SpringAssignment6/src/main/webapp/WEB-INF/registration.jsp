<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:errors path="customer1*"/>
	
	<h1>Please register your DETAILS : </h1>
	
	<form action = "/FirstSpringMVCProject/submitdetails.html" method = "post">
	
		<p>
			User Name : <input type="text" name="username" required/>
		</p>
		<p>
			Password : <input type="text" name="password" required/>
		</p>		
		<p>
			Email : <input type="text" name="email" required/>
		</p>
		<p>
			Contact : <input type="text" name="contact"/>
		</p>
		<p>
			City : <select name="city">
  	    		  	<option value="Pune">Pune</option>
				  	<option value="Delhi">Delhi</option>
				  	<option value="Mohali">Mohali</option>
				  	<option value="Mumbai">Mumbai</option>
				   </select>
		</p>
		<p>
			Zipcode : <input type="text" name="zipcode" required/>
		</p>
				
		<input type="submit" value="Register"/>
	
	</form>


</body>
</html>