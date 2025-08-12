package pkg_oopsDay3_5;
 
public class PersonImp {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		//Setting the variable values
		person.setName("Lena");
		person.setAge(22);
		//Getting the Person details
		System.out.println("Person Name: "+person.getName());
		System.out.println("Person Age: "+person.getAge());
	}
 
}