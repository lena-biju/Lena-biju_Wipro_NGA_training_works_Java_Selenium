package jdbcpkg;

import java.sql.*;

public class StoredProcedureExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java_sele";
        String user = "root";
        String password = "Lena#315051";

        // Stored procedure calls
        String callDisplay = "{CALL display_book()}";
        String callUpdate = "{CALL update_price(?, ?)}";
        String callMax = "{CALL disp_max(?)}";
        String callGender = "{CALL disp_gender(?, ?)}";

        try (
            Connection conn = DriverManager.getConnection(url, user, password);
            CallableStatement cstmtDisplay = conn.prepareCall(callDisplay);
            CallableStatement cstmtUpdate = conn.prepareCall(callUpdate);
            CallableStatement cstmtMax = conn.prepareCall(callMax);
            CallableStatement cstmtGender = conn.prepareCall(callGender);
        ) {
            // 1. Call display_book() - No parameters
            System.out.println("=== Calling display_book() ===");
            ResultSet rs = cstmtDisplay.executeQuery();
            while (rs.next()) {
                System.out.println("Book: " + rs.getString("book_name") + 
                                 ", Price: " + rs.getInt("price"));
            }
            rs.close();

            // 2. Call update_price() - IN parameters
            System.out.println("\n=== Calling update_price() ===");
            cstmtUpdate.setString(1, "002");  // ISBN
            cstmtUpdate.setInt(2, 750);       // New price
            int rowsUpdated = cstmtUpdate.executeUpdate();
            System.out.println(rowsUpdated + " row(s) updated.");

            // 3. Call disp_max() - OUT parameter
            System.out.println("\n=== Calling disp_max() ===");
            cstmtMax.registerOutParameter(1, Types.INTEGER);
            cstmtMax.execute();
            int maxPrice = cstmtMax.getInt(1);
            System.out.println("Highest price: " + maxPrice);

            // 4. Call disp_gender() - IN-OUT parameter
            System.out.println("\n=== Calling disp_gender() ===");
            // For Male authors
            cstmtGender.registerOutParameter(1, Types.INTEGER);
            cstmtGender.setInt(1, 0);
            cstmtGender.setString(2, "Male");
            cstmtGender.execute();
            int maleCount = cstmtGender.getInt(1);
            System.out.println("Male authors: " + maleCount);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}