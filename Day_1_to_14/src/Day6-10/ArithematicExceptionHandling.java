package pack1;
import java.util.Scanner;
public class ArithematicExceptionHandling {
	int num,deno,result;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numarator:");
		int num=sc.nextInt();
		System.out.println("Enter a denominator:");
		int deno=sc.nextInt();		
		
		try {int result=num/deno;
		int[] arr = new int[4];
		arr[5]=343;
		System.out.println("Result is:" +result);
		
		}
		catch(ArithmeticException ae){
			System.out.println("cant divide by zero");	
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("invalid index of array");
		
			
		}
		finally {
			System.out.println("result is printed");
			
		}
		/*	class NestedTry {
		    public static void main(String[] args) {
				int[] numbers = {100,0};
		        try {
		            System.out.println("Outer try block");
		 
		            try {
		                System.out.println("Inner try block");
		                int result = numbers[0] / numbers[1];  
		                System.out.println("Result: " + result);
		            } catch (ArithmeticException e) {
		                System.out.println("Inner try's catch: Divide by zero!");
		            }
		 
		            int value = numbers[2];  
		            System.out.println("Value: " + value);
		 
		        } catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println("Outer catch: Array index out of bounds!");
		        }
				finally{
					System.out.println("Example of outer/Inner try block");
				}

		 
		    }
		}*/

	}

}
