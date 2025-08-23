package main;

import java.sql.*;//import neccssary files

public class DatabaseOperations {
    private final String url = "jdbc:mysql://localhost:3306/Java_Test";
    private final String username = "root";
    private final String password = "Lena#315051";

    // Insert student record
    public boolean insertData(int id, String name, String email) {
        String query = "INSERT INTO students(id, name, email) VALUES (?, ?, ?)";

        try (Connection c = DriverManager.getConnection(url, username, password);
             PreparedStatement pst = c.prepareStatement(query)) {

            Class.forName("com.mysql.cj.jdbc.Driver");

            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setString(3, email);

            int count = pst.executeUpdate();
            System.out.println("Number of rows affected by INSERT query: " + count);

            return count > 0;

        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
            return false;
        } catch (SQLException e) {
            System.err.println("SQL Error in INSERT: " + e.getMessage());
            return false;
        }
    }


    // Delete student record
    public boolean deleteData(int id) {
    	 String query = "DELETE FROM students WHERE id = ?";

        try (Connection c = DriverManager.getConnection(url, username, password);
             PreparedStatement pst = c.prepareStatement(query)) {

            Class.forName("com.mysql.cj.jdbc.Driver");

            pst.setInt(1, id);

            int count = pst.executeUpdate();
            System.out.println("Number of rows affected by DELETE query: " + count);

            return count > 0;

        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
            return false;
        } catch (SQLException e) {
            System.err.println("SQL Error in DELETE: " + e.getMessage());
            return false;
        }
    }

    // Update student record
    public boolean updateData(int id, String name, String email) {
        String query = "UPDATE students SET name = ?, email = ? WHERE id = ?";

        try (Connection c = DriverManager.getConnection(url, username, password);
             PreparedStatement pst = c.prepareStatement(query)) {

            Class.forName("com.mysql.cj.jdbc.Driver");

            pst.setString(1, name);
            pst.setString(2, email);
            pst.setInt(3, id);

            int count = pst.executeUpdate();
            System.out.println("Number of rows affected by UPDATE query: " + count);

            return count > 0;

        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
            return false;
        } catch (SQLException e) {
            System.err.println("SQL Error in UPDATE: " + e.getMessage());
            return false;
        }
    }

    // Retrieve student name by ID
    public String getStudentName(int id) {
        String query = "SELECT name FROM students WHERE id = ?";

        try (Connection c = DriverManager.getConnection(url, username, password);
             PreparedStatement pst = c.prepareStatement(query)) {

            Class.forName("com.mysql.cj.jdbc.Driver");

            pst.setInt(1, id);

            ResultSet rs = pst.executeQuery();
            String name = null;
            if (rs.next()) {
                name = rs.getString("name");
            }

            return name;

        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
            return null;
        } catch (SQLException e) {
            System.err.println("SQL Error in SELECT: " + e.getMessage());
            return null;
        }
    }

    // For manual testing 
    public static void main(String[] args) {
        DatabaseOperations db = new DatabaseOperations();

        System.out.println("=== Testing MySQL Database Operations ===");

        boolean insert = db.insertData(1001, "John Doe", "john@email.com");
        System.out.println("Insert: " + insert);

        boolean update = db.updateData(1001, "John Smith", "johnsmith@email.com");
        System.out.println("Update: " + update);

        String name = db.getStudentName(1001);
        System.out.println("Retrieved Name: " + name);

        boolean delete = db.deleteData(1001);
        System.out.println("Delete: " + delete);

        System.out.println("=== All Operations Completed ===");
    }
}
