package pack1;

class Throw_Throws {
	 
    public static void checkAge(int age) throws IllegalArgumentException{
        if (age < 18) {
            throw new IllegalArgumentException("Access denied – You must be at least 18 years old.");
        } else {
            System.out.println("Access granted – You are eligible to cast a vote!");
        }
    }
 
    public static void main(String[] args) {
        try {
            checkAge(10);  
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
 
        System.out.println("Program continues...");
    }
}