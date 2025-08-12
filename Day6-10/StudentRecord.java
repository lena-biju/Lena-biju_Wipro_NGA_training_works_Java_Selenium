package pack1;
import java.util.Scanner;

public class StudentRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter the no. of students  : ");
            int numOfStudents = sc.nextInt();
            
            for (int i = 0; i <= numOfStudents; i++) {
                System.out.print("Enter the name : ");
                String name = sc.next();

                System.out.print("Enter  grade (0 - 100) : ");
                int grade = sc.nextInt();

                try {
                    if (grade < 0 || grade > 100) {
                        throw new InvalidGradeException("Grade not in the range !!");
                    } else {
                        System.out.println("Name of the student : " + name + " , Grade : " + grade);
                    }
                } catch (InvalidGradeException e) {
                    System.out.println("Exception caught for " + name + " : " + e.getMessage());
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("All resources closed !");
        }
    }
}