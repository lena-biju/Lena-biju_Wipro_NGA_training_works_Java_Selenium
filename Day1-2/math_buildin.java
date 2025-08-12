package Day1_to_2;

public class math_buildin {
	public static void main(String[] args) {
		int x=10;
		int y=15;
		System.out.println(Math.max(x, y));//max value
		System.out.println(Math.min(x, y));//min value
		
		//square root 
		
		int z=4;
		System.out.println(Math.sqrt(z));
		
		
		//absoulte value means if given -ve then it gives positive as output
		
		System.out.println(Math.abs(-20));
		System.out.println(Math.random());
		
		
		//in cntrl random
		
		int num=(int)(Math.random()*120);
		System.out.println(num);
		
	}

}
