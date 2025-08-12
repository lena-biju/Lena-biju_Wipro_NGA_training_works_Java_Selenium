package pkg_oopsDay3_5;

public class EmployeeImp {

	public static void main(String[] args) {

		// First 5 employees using constructor-fr condition 1
		Employee e1 = new Employee(1, "Lena", "IT", 50000);
		Employee e2 = new Employee(2, "Alice", "HR", 45000);
		Employee e3 = new Employee(3, "Mithila", "Finance", 55000);
		Employee e4 = new Employee(4, "Diya", "Sales", 48000);
		Employee e5 = new Employee(5, "Arun", "Admin", 47000);

		// Next 5 employees using setters-fr cndtn 2
		Employee e6 = new Employee();
		e6.setId(06);
		e6.setName("Sana");
		e6.setDepartment("IT");
		e6.setSalary(52000);

		Employee e7 = new Employee();
		e7.setId(07);
		e7.setName("Aishu");
		e7.setDepartment("HR");
		e7.setSalary(46000);

		Employee e8 = new Employee();
		e8.setId(8);
		e8.setName("Abhi");
		e8.setDepartment("Finance");
		e8.setSalary(57000);

		Employee e9 = new Employee();
		e9.setId(9);
		e9.setName("Nina");
		e9.setDepartment("Marketing");
		e9.setSalary(53000);

		Employee e10 = new Employee();
		e10.setId(10);
		e10.setName("Lakshmi");
		e10.setDepartment("Support");
		e10.setSalary(49000);

		// Printing all employee details
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
		System.out.println(e6);
		System.out.println(e7);
		System.out.println(e8);
		System.out.println(e9);
		System.out.println(e10);
	}
}
