package Day1_to_2;
import java.util.Scanner;
public class UserInput {
	public static void main(String[]args) {
		//number input
		System.out.println("Enter a number:");
		Scanner obj=new Scanner(System.in);//taking input frm keyboard that is why system.in//created an obj 
		int num= obj.nextInt();//by obj value stored in num variable
		
		System.out.println("the entered number is:" +num);
		
		
		//string input
		System.out.println("Enter a word:");
		Scanner obj2=new Scanner(System.in);
		
		String str=obj2.next();
		System.out.println("the entered word  is:" +str);
		
		
		
	}
	

}
