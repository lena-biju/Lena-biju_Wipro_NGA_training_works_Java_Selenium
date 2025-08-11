package pkg_oopsDay3_5;

public class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}
 
	// Public setter method for name
	public void setName(String newName) {
		name = newName;
	}
 
	// Public getter method for age
	public int getAge() {
		return age;
	}
 
	// Public setter method for age
	public void setAge(int newAge) {
		if (newAge > 0) {
			age = newAge;
		} else {
			System.out.println("Age must be positive.");
}
}
}