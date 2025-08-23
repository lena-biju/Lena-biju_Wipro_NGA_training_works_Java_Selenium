package pkg_prjct3;

import java.util.ArrayList;
public class Models {
	public abstract class Person {
	    protected String name;
	    protected int id;
	    
	    public Person(String name, int id) {
	        this.name = name;
	        this.id = id;
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    public int getId() {
	        return id;
	    }
	    
	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    public void setId(int id) {
	        this.id = id;
	    }
	    
	    @Override
	    public String toString() {
	        return "Name: " + name + ", ID: " + id;
	    }
	}
	
	public class Course {
	    private String courseCode;
	    private String courseName;
	    private int credits;
	    
	    public Course(String courseCode, String courseName, int credits) {
	        this.courseCode = courseCode;
	        this.courseName = courseName;
	        this.credits = credits;
	    }
	    
	    public String getCourseCode() {
	        return courseCode;
	    }
	    
	    public String getCourseName() {
	        return courseName;
	    }
	    
	    public int getCredits() {
	        return credits;
	    }
	    
	    public void setCourseCode(String courseCode) {
	        this.courseCode = courseCode;
	    }
	    
	    public void setCourseName(String courseName) {
	        this.courseName = courseName;
	    }
	    
	    public void setCredits(int credits) {
	        this.credits = credits;
	    }
	    
	    @Override
	    public String toString() {
	        return courseCode + " - " + courseName + " (" + credits + " credits)";
	    }
	    
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Course course = (Course) obj;
	        return courseCode.equals(course.courseCode);
	    }
	}
	public class Student extends Person {
	    private String major;
	    private ArrayList<Course> registeredCourses;
	    
	    public Student(String name, int id, String major) {
	        super(name, id);
	        this.major = major;
	        this.registeredCourses = new ArrayList<>();
	    }
	    
	    public String getMajor() {
	        return major;
	    }
	    
	    public void setMajor(String major) {
	        this.major = major;
	    }
	    
	    public ArrayList<Course> getRegisteredCourses() {
	        return registeredCourses;
	    }
	    
	    public void addCourse(Course course) {
	        registeredCourses.add(course);
	    }
	    
	    public void removeCourse(Course course) {
	        registeredCourses.remove(course);
	    }
	    
	    public boolean isRegistered(Course course) {
	        return registeredCourses.contains(course);
	    }
	    
	    @Override
	    public String toString() {
	        return super.toString() + ", Major: " + major + 
	               ", Registered Courses: " + registeredCourses.size();
	    }
	}


}
