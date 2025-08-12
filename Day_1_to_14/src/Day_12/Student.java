package serialization;

import java.io.Serializable;

public class Student implements Serializable {
    
    

    
    private String name;
    private int age;
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
  
    public void display() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
   
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
   
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}