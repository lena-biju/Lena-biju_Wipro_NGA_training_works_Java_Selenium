package pack1;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class Frameworkexp1 {

	public static void main(String[] args) {
		List<String> name = new ArrayList<>();
		name.add("Lena");
		name.add("Aena");
		name.add("Kavyan");
		name.add("Madhu");
		name.add("Sevin");
System.out.println("Before sorting"+name);//name is a dynamic array

Collections.sort(name);//methd sort used here
System.out.println("After sorting"+name);



		
	}

}
