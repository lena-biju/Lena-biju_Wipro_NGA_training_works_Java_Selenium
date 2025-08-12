package myTest;

import main.DatabaseOperations;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Database Operations Test Suite")
class DatabaseOperationsTest {

    DatabaseOperations db = new DatabaseOperations();

    @BeforeEach
    void setup() {
        System.out.println("Starting new test...");
    }

    @AfterEach
    void cleanup() {
        System.out.println("Test finished.");
    }

    @Test
    @DisplayName("Insert Operation Test")
    void testInsertOperation() {
        boolean insertResult = db.insertData(1001, "Alice", "alice@email.com");
        String name = db.getStudentName(1001);

        assertAll("Insert Assertions",
            () -> assertTrue(insertResult, "Insert should return true"),
            () -> assertEquals("Alice", name, "Name should match inserted value")
        );
    }

    @Test
    @DisplayName("Update Operation Test")
    void testUpdateOperation() {
        db.insertData(1002, "Boby", "boby@email.com");
        boolean updateResult = db.updateData(1002, "Bobby", "bobby@email.com");
        String updatedName = db.getStudentName(1002);

        assertAll("Update Assertions",
            () -> assertTrue(updateResult, "Update should return true"),
            () -> assertEquals("Bobby", updatedName, "Updated name should be 'Bobby'")
        );
    }

    @Test
    @DisplayName("Delete Operation Test")
    void testDeleteOperation() {
        db.insertData(1003, "Charlie", "charlie@email.com");
        boolean deleteResult = db.deleteData(1003);
        String nameAfterDelete = db.getStudentName(1003);

        assertAll("Delete Assertions",
            () -> assertTrue(deleteResult, "Delete should return true"),
            () -> assertNull(nameAfterDelete, "Name should be null after deletion")
        );
    }

    @Test
    @Disabled("Disabled test for demonstration purposes")
    @DisplayName("Disabled Test Example")
    void disabledTest() {
        fail("This test is disabled and should not run");
    }
}
