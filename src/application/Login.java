package application;

import java.sql.*;

public class Login {
	Connection conection;
	public Login() {
	   conection = SqliteConnection.Connector();
	   if (conection == null) {

	   System.out.println("connection not successful");
	    System.exit(1);}
	  }
	  
	  public boolean isDbConnected() {
	   try {
		   return !conection.isClosed();
	   } catch (SQLException e) {
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		   return false;
	   }
	}
}
