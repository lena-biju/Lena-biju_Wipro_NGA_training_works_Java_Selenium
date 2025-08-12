package pack1;
import java.util.Scanner;

public class NestedTryCatch {
int num1,num2,result;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter number 1:");
	        int num1= sc.nextInt();
	        System.out.println("Enter number 2:");
	        int num2= sc.nextInt();
			int result=num1/num2;
			 System.out.println("this is inner try block result: "+result);
			 try {
				 int[] arr= {10,20,30};
				 int y= arr[5];
				 System.out.println(y);
			 }
			 catch(ArrayIndexOutOfBoundsException ex) {
		        	System.out.println("array index of out bond ");
		        }
			
		}
		catch(ArithmeticException ex2) {
			 System.out.println("divide by zero is not possible ");
		}
	}
 
}
 