package pkg_prjct3;

import java.util.ArrayList;
import pkg_prjct3.Models.Student;
import pkg_prjct3.Models.Course;
import pkg_prjct3.Interface;  
import pkg_prjct3.Exceptions.CourseAlreadyRegisteredException;
import pkg_prjct3.Exceptions.CourseNotFoundException;


public class RegistrationManager implements Interface {
    private ArrayList<Course> availableCourses;
    private ArrayList<Student> students;

    public RegistrationManager() {
        this.availableCourses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    // Add course to available courses
    public void addCourse(Course course) {
        availableCourses.add(course);
    }

    // Add student to system
    public void addStudent(Student student) {
        students.add(student);
    }

    // Find course by course code
    private Course findCourse(String courseCode) throws CourseNotFoundException {
        for (Course course : availableCourses) {
            if (course.getCourseCode().equals(courseCode)) {
                return course;
            }
        }
        throw new CourseNotFoundException("Course with code " + courseCode + " not found!");
    }

    // Register student for a course
    @Override
    public void registerCourse(Student student, String courseCode)
            throws CourseAlreadyRegisteredException, CourseNotFoundException {

        Course course = findCourse(courseCode);

        // Check if student is already registered for this course
        if (student.isRegistered(course)) {
            throw new CourseAlreadyRegisteredException(
                "Student " + student.getName() + " is already registered for " + courseCode);
        }

        // Register the student for the course
        student.addCourse(course);
        System.out.println("✅ " + student.getName() + " successfully registered for " + course);
    }

    // Drop student from a course
    @Override
    public void dropCourse(Student student, String courseCode)
            throws CourseNotFoundException {

        Course course = findCourse(courseCode);

        if (!student.isRegistered(course)) {
            throw new CourseNotFoundException(
                "Student " + student.getName() + " is not registered for " + courseCode);
        }

        student.removeCourse(course);
        System.out.println("✅ " + student.getName() + " successfully dropped " + course);
    }

    // Display all courses for a student
    @Override
    public void displayStudentCourses(Student student) {
        System.out.println("\n📚 Courses for " + student.getName() + ":");
        if (student.getRegisteredCourses().isEmpty()) {
            System.out.println("No courses registered.");
        } else {
            for (Course course : student.getRegisteredCourses()) {
                System.out.println("  - " + course);
            }
        }
    }

    // Display all available courses
    public void displayAvailableCourses() {
        System.out.println("\n📖 Available Courses:");
        for (Course course : availableCourses) {
            System.out.println("  - " + course);
        }
    }
}