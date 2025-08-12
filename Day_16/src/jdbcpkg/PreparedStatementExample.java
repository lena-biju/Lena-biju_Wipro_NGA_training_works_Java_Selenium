package jdbcpkg;


import java.sql.*;

public class PreparedStatementExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Java_Sele";
        String user = "root";
        String password = "Lena#315051";

        String insertSQL = "INSERT INTO users (name, email) VALUES (?, ?)";
        String delSQL ="delete from users where name=?";
        String updSQL="update users set name=? where name='Harry Potter'";
        try(
        		Connection conn = DriverManager.getConnection(url, user, password);
        		PreparedStatement pstmtIns = conn.prepareStatement(insertSQL);
        		PreparedStatement pstmtDel = conn.prepareStatement(delSQL);
        		PreparedStatement pstmtUpd= conn.prepareStatement(updSQL);
        	) 	
        	{
            // Set values for the placeholders
        	pstmtIns.setString(1, "Adam");
        	pstmtIns.setString(2, "adam@example.com");
            //For deleting
            pstmtDel.setString(1,"Adam");
            //For updating
            pstmtUpd.setString(1,"Harry");
            int rowsInserted = pstmtIns.executeUpdate();
            int rowsDeleted= pstmtDel.executeUpdate();
            int rowsUpdated= pstmtUpd.executeUpdate();
            System.out.println(rowsInserted + " row(s) inserted.");
            System.out.println(rowsDeleted+ " row(s) deleted.");
            System.out.println(rowsUpdated+ " row(s) updated.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        }
        }
