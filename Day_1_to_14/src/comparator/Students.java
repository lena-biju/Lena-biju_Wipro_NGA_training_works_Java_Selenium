package comparator;

public class Students {
	private String name;
	private int age;
	public Students() {
		super();
		
	}
 
	public Students(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
 
	public int getAge() {
		return age;
	}
 
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}