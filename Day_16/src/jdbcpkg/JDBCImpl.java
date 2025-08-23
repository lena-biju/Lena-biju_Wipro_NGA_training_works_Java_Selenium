package jdbcpkg;

import java.sql.*;
public class JDBCImpl{
    public static void main(String[] args){
       
        String url  = "jdbc:mysql://localhost:3306/Java_Seleniumone";
        String username = "root";
        String password = "Lena#315051";
        String query
            = "INSERT INTO employee(empId, empName,empSalary) VALUES (1778, 'Uma',650000)";
 
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection(url, username, password);
            Statement st = c.createStatement();
            int count = st.executeUpdate(query);
            System.out.println(
                "Number of rows affected by this query: "
                + count);
 
   
            st.close();
            c.close();
            System.out.println("Connection closed.");
        }
        catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: "
                               + e.getMessage());
        }
        catch (SQLException e) {
            System.err.println("SQL Error: "
                               + e.getMessage());
        }
    }
}