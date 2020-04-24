package application;

import java.sql.*;

public class Register {
	Connection connection;
	public Register() {
		connection = SqliteConnection.Connector();
		   if (connection == null) {

		   System.out.println("connection not successful");
		    System.exit(1);}
	}

	public boolean isregister(String user , String email , String password) throws SQLException {
		String query2 = "INSERT INTO subscribers('name','email','password')VALUES('"+user+"','"+email+"','"+password+"');";
		try {
			Statement st = connection.createStatement();
			st.execute(query2);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
}
