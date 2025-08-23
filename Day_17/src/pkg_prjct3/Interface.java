package pkg_prjct3;

import pkg_prjct3.Models.Student;                           
import pkg_prjct3.Exceptions.CourseAlreadyRegisteredException;   
import pkg_prjct3.Exceptions.CourseNotFoundException;;          

public interface Interface {
    void registerCourse(Student student, String courseCode) 
            throws CourseAlreadyRegisteredException, CourseNotFoundException;
        
        void dropCourse(Student student, String courseCode) 
            throws CourseNotFoundException;
        
        void displayStudentCourses(Student student);
    }