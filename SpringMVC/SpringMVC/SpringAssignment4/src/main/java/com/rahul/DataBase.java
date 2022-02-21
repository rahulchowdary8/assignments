package com.rahul;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.tomcat.jni.User;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;

@Service()
public class DataBase {
	
	// setting the connection variable
	private Connection connection;
	
	public DataBase() {
		try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				this.connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/crudapi", "root", "admin@123");
		}catch (Exception e) {
			
			System.out.println(e);
		}
	}
	
	public void insertData(User user) throws Exception {
		
		 String password = ((User1) user).getPassword();
		 String email = ((User1) user).getEmail();
		 String username = ((User1) user).getUsername();
    
	
		 PreparedStatement preparedStatement = connection.prepareStatement("insert into user values(?,?,?)");
    	 
    	 preparedStatement.setString(1, username);
    	 preparedStatement.setString(2, email);
    	 preparedStatement.setNString(3, password);
    	 
    	 preparedStatement.executeUpdate();
    	 
	}
	
	
	public boolean  getData(User1 user) throws Exception {
		 
		PreparedStatement p = connection.prepareStatement("select * from user where username = ? ");
    	p.setString(1, ((User1) user).getUsername());
    	 
		ResultSet r = p.executeQuery();
		if(r.next()==false) {
				return false;
		}
		 
		String username = "";
		String password = "";
		while(r.next()){
			username=r.getString(1);
			password=r.getString(3);
		}
		
		
		if(username.equals(((User1) user).getUsername()) && password.equals(((User1) user).getPassword()))
			{return true;}
		else 
		  {return false;}	
	}
}
