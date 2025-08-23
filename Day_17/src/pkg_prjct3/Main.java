package pkg_prjct3;


public class Main {
    public static void main(String[] args) {
        System.out.println("******* Course Registration System*******");
        System.out.println("================================");
        
        // Create Registration Manager
        RegistrationManager manager = new RegistrationManager();
        
        // Add some courses
        manager.addCourse(new Course("CS101", "Introduction to Programming", 3));
        manager.addCourse(new Course("CS102", "Data Structures", 4));
        manager.addCourse(new Course("MATH201", "Calculus I", 3));
        manager.addCourse(new Course("ENG101", "English Composition", 2));
        
        // Create students
        Student student1 = new Student("Alice Johnson", 1001, "Computer Science");
        Student student2 = new Student("Bob Smith", 1002, "Mathematics");
        
        manager.addStudent(student1);
        manager.addStudent(student2);
        
        // Display available courses
        manager.displayAvailableCourses();
        
        try {
            // Test successful registrations
            System.out.println(" Testing Course Registrations:");
            manager.registerCourse(student1, "CS101");
            manager.registerCourse(student1, "CS102");
            manager.registerCourse(student2, "MATH201");
            manager.registerCourse(student2, "ENG101");
            
            // Display student courses
            manager.displayStudentCourses(student1);
            manager.displayStudentCourses(student2);
            
            // Test duplicate registration (should throw exception)
            System.out.println(" Testing Duplicate Registration:");
            manager.registerCourse(student1, "CS101");
            
        } catch (CourseAlreadyRegisteredException e) {
            System.out.println(" Error: " + e.getMessage());
        } catch (CourseNotFoundException e) {
            System.out.println(" Error: " + e.getMessage());
        }
        
        try {
            // Test course not found (should throw exception)
            System.out.println(" Testing Invalid Course:");
            manager.registerCourse(student1, "INVALID101");
            
        } catch (CourseAlreadyRegisteredException e) {
            System.out.println(" Error: " + e.getMessage());
        } catch (CourseNotFoundException e) {
            System.out.println(" Error: " + e.getMessage());
        }
        
        try {
            // Test dropping a course
            System.out.println("\n🔄 Testing Course Drop:");
            manager.dropCourse(student1, "CS102");
            manager.displayStudentCourses(student1);
            
        } catch (CourseNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println(" System demonstration completed!");
    }
}