package Day1_to_2;

public class Array {

	public static void main(String[] args) {
		String[] cars= {"BMW","Honda","Maruthi","KIA","volvo"};//initialize
		cars[1]="Opel";//changing element based on index
		System.out.println(cars[0]);//to read string array
		String car=cars[1];//by assigning to other variable
		System.out.println(car);
		System.out.println(cars[2]);
		int[] num= {2,3,5,4};//initialize
		System.out.println(num[2]);//to read int array
		System.out.println(cars.length);//to get length of cars array..length is  a ppty not a metheod her.
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);}
			
			 
		//multi dimensional array
		int [][] arri= {{2,3,9,4},{5,3,1,0}};
		System.out.println("it is:"+arri[0][2]);
	}
}
