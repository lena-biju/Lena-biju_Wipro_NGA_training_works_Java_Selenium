
package pkg_oopsDay3_5;
 
public class CarImp {
 
	public static void main(String[] args) {
		Car car = new Car("Benz",2025);
		System.out.println(car);
		Car newcar = new Car("BMW",2020);
		System.out.println(newcar);
		Car democar = new Car(); // it is a default one
	}
 
}