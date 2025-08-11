package pack1;

public class Wclass_2 {
	public static void main(String[] args){
		String str1 = "true";
        boolean b1 = Boolean.parseBoolean(str1);
        System.out.println("parseBoolean(\"true\"): " + b1);  

        String str2 = "yes";
        boolean b2 = Boolean.parseBoolean(str2);
        System.out.println("parseBoolean(\"yes\"): " + b2);  

        // valueOf(String s) – Returns Boolean object
        Boolean boolObj1 = Boolean.valueOf("true");
        Boolean boolObj2 = Boolean.valueOf("false");
        System.out.println("valueOf(\"true\"): " + boolObj1);  
        System.out.println("valueOf(\"false\"): " + boolObj2);  

        // booleanValue() – Returns primitive boolean from object
        boolean unboxed = boolObj1.booleanValue();
        System.out.println("booleanValue(): " + unboxed);       

        // toString() – Converts Boolean object to string
        String boolStr = boolObj2.toString();
        System.out.println("toString(): " + boolStr);           

        // equals(Object obj) – compares two Boolean objects
        Boolean b3 = true;
        Boolean b4 = false;
        System.out.println("b3.equals(b4): " + b3.equals(b4));      
        System.out.println("b3.equals(true): " + b3.equals(true));  
	}

}


/*package Boxing_Unboxing;

public class BooleanWC {

	public static void main(String[] args) {
		String str1="true",str2="FALSE",str3="TRUE",str4="false";
		
		boolean bo1= Boolean.parseBoolean(str1);   
		boolean bo2= Boolean.parseBoolean(str2);
		boolean bo3= Boolean.parseBoolean(str3);
		boolean bo4= Boolean.parseBoolean(str4);
		
		System.out.println(bo1);
		System.out.println(bo2);
		System.out.println(bo3);
		System.out.println(bo4);
		
		Boolean obj1 = Boolean.valueOf(str1);  
		Boolean obj2 = Boolean.valueOf(str2);
		Boolean obj3 = Boolean.valueOf(str3);
		Boolean obj4 = Boolean.valueOf(str4);
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		
		
		 boolean val1 = obj1.booleanValue();         
	     boolean val2 = obj2.booleanValue();  
	     boolean val3 = obj3.booleanValue();       
	     boolean val4 = obj4.booleanValue();       


	        System.out.println(val1);
	        System.out.println(val2);
	        System.out.println(val3);
	        System.out.println(val4);




		
	}

}*/