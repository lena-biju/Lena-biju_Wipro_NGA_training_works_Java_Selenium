package serialization;



import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.File;

public class ReadStudentFile {
    public static void main(String[] args) {
        // Check if file exists first
        File file = new File("student.ser");
        if (!file.exists()) {
            System.out.println(" student.ser file not found!");
            System.out.println(" Run CreateStudentFile first!");
            return;
        }
        
        try {
            // Read from file
            FileInputStream fileIn = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Student student = (Student) in.readObject();
            in.close();
            fileIn.close();
            
            System.out.println("Student loaded successfully!");
            student.display();
            
        } catch (Exception e) {
            System.out.println(" Error reading student:");
            e.printStackTrace();
        }
    }
}