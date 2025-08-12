package Day1_to_2;
import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		System.out.println("Enter a number here:");
		Scanner obj1= new Scanner(System.in);
		int num=obj1.nextInt();
		if(num%2==0) {//logic of odd or even 
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}

	}

}
