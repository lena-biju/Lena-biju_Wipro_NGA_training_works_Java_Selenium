package pack1;

import java.util.*;

class Customer {
    private String id;
    private String name;
    private String location;
    private String cardnumber;
    private String mobilenumber;

   
    Customer(String id, String name, String location, String cardnumber, String mobilenumber) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.cardnumber = cardnumber;
        this.mobilenumber = mobilenumber;
    }

 
    public String getId() {
    	return id; 
    	}
    public String getName() {
    	return name; 
    	}
    public String getLocation() {
    	return location;
    	}
    public String getCardnumber() {
    	return cardnumber; 
    	}
    public String getMobilenumber() { 
    	return mobilenumber; 
    	}

    // toString method
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Location: " + location + ", Cardnumber: " + cardnumber + ", Mobilenumber: " + mobilenumber;
    }
}

public class CustomerExp {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer("C001", "Lena", "Thrissur", "AC102HB", "123456789"));
        customers.add(new Customer("C002", "Tara", "Delhi", "AC182HL", "198744903"));
        customers.add(new Customer("C003", "Nitha", "Kottayam", "AY102XB", "123480273"));
        customers.add(new Customer("C004", "Sam", "Indore", "XC102BB", "123703789"));
        customers.add(new Customer("C005", "Mike", "Kannur", "AC452HB", "129870012"));
//sorting  need to done fr customer.sort()-will do!
       
        System.out.println("Customer List:");
        for (Customer c : customers) {
            System.out.println(c);
}

        
    Iterator<Customer> itr = customers.iterator();
      while (itr.hasNext()) {
          Customer c = itr.next();
            if (c.getId().equals("C003")) {
               itr.remove();
               System.out.println("Customer C003 removed from the list.");
                break;
       }
        }

      
        System.out.println("Customer List After Removal:");
        for (Customer c : customers) {
            System.out.println(c);
        }

      
 boolean found = false;//searching fr C003 id!
    for (Customer c : customers) {
      if (c.getId().equalsIgnoreCase("C003")) {//ignorecase is used bcz need to b false when c003 ,and need to b correct when it is C003
           System.out.println("Customer C003 Found:");
             System.out.println("Name: " + c.getName());
             System.out.println("Location: " + c.getLocation());
              found = true;
              break;
            }
        }

        if (!found) {
            System.out.println("Customer C003 not found in the list.");
        }
    }
}


 


