package jdbcpkg;



import java.sql.CallableStatement;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

public class CallableStatementExample {

   static Connection con=null;

	public static void main(String args[]) throws Exception {

	try {

		
       String url="jdbc:mysql://localhost:3306/java_sele";
       String username = "root";
       String password = "Lena#315051";
        Class.forName("com.mysql.cj.jdbc.Driver");
 

         con = DriverManager.getConnection(url, username, password);

	  //Preparing a CallableStateement

         CallableStatement cstmt = con.prepareCall("{call myProcedures(?, ?, ?)}");

         cstmt.setString(1, "Biriyani");
         cstmt.setInt(2, 200);
         cstmt.setInt(3, 7);
         cstmt.execute();  

         cstmt.setString(1, "Meals");
         cstmt.setInt(2, 600);
         cstmt.setInt(3, 5);
         cstmt.execute();  

         cstmt.setString(1, "Juice ");
         cstmt.setInt(2, 10);
         cstmt.setInt(3, 1);
         cstmt.execute();  

         System.out.println("Rows inserted ....");


	}catch(SQLException se) {se.printStackTrace();}

	}

}
 
 