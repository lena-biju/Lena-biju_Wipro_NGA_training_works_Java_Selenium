package comparator;
//example of multilevel sorting =it is important so study it !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


import java.util.*;//don't use * since it is not a gd practice it takes a large amount of space ! we need our code to be optimized!


class Person{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
 
	public int getAge() {//using getters to get the values
		return age;
	}

	public Person(String name,int age){//constructor is used here
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return this.name + " " + this.age;//to string method for string representation.  
	}
}
 


class PersonMain{//main class named as PersonMain
	public static void main(String[] args){
		List<Person> person = Arrays.asList(//sorting based on the alphabetical order. not int order 
			new Person("Ancy",10),
			new Person("charley",23),
			new Person("zeraa",55)//setetrs is no need here since we are give value here directly.
		);
		System.out.println("Original List");
		System.out.println(person);
		person.sort(Comparator.comparing((Person p)->p.getName()).thenComparing(p->p.getAge()));
		System.out.println("Sorted list by name then by age: ");
		for(Person p:person) {
			
			System.out.println(p);
		}	
	}
}	