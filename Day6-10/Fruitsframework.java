package pack1;
import java.util.*;

public class Fruitsframework {

	public static void main(String[] args) {
		List<String> fruits=new ArrayList<>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Jackfruit");
		fruits.add("Grapes");
		fruits.add("Cherry");
		fruits.add("Rasbery");
		fruits.add("Dragon fruit");
		fruits.add("Orange");
		fruits.add("Blue berry");
		fruits.add("Zolestrian fruit");
		System.out.println("The original fruits list :"+fruits);
		System.out.println("The fruit at index 5 is: "+fruits.get(5));//to get a element at an index use x.get(i);
		
		
		
		fruits.set(3,"Watermelon");//to set an new element at an index by replacing then use x.set(i,"new ");
		System.out.println("The new original fruits list :"+fruits);
		fruits.remove("Orange");// to remove elemnt use remove. x.remove("");
		System.out.println("After removing 'Orange': " + fruits);
		System.out.println("The index of Blueberry is:"+fruits.indexOf("Blue berry"));// to get the index use in sop(x.indexof("");
		
		System.out.println("Sublist (0 to 2): " + fruits.subList(0, 2));// excluding 2 u will get a sub list from 0 to 2)
		  fruits.clear();// to clear everything in the list
	      System.out.println("Is empty? " + fruits.isEmpty());

	}

}
