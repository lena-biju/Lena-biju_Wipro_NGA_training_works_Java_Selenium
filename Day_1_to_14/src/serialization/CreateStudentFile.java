package serialization;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class CreateStudentFile {
    public static void main(String[] args) {
        try {
            // Create a student
            Studnt studnt = new Studnt("Alice Johnson", 21,156.01);
            
            // Save to file
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(studnt);
            out.close();
            fileOut.close();
            
            System.out.println(" Student saved successfully to student.ser!");
            
        } catch (Exception e) {
            System.out.println(" Error saving student:");
            e.printStackTrace();
        }
    }
}


