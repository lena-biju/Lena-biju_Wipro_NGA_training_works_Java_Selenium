package pkg_oopsDay3_5;
 
//class Mercedez implements ICar,ICar2{
class Mercedez implements ICar2{
 
	public void gears() {
		System.out.println("7 gears");
	}
	public void steeringType() {
		System.out.println("With Sound Controls and Cruise Control");
	}
	public void tyreDia() {
		System.out.println("90 cms");
	}
	public void engine() {
		System.out.println("1600 cc");
	}
	public void mileage() {
		System.out.println("12 kms");
	}
	public void acceleration() {
		System.out.println("0 to 100 in 10 secs");
	}
	public void seatingCapacity() {
		System.out.println("7 seater");
	}
	public void color() {
		System.out.println("Black");
	}
	public void bootSpace() {
		System.out.println("450 Ltr.");
	}
	public void frontMirror() {
		System.out.println("2 front mirrors");
	}
	public void rearMirror() {
		System.out.println("4 rear mirrors");
	}
	public void fuelTank() {
		System.out.println("60 litres");
	}
	public void soundSystem() {
		System.out.println("JBL Sound System");
	}
	public void airBags() {
		System.out.println("8 airbags");
	}
	public void maxSpeed() {
		System.out.println("Maxspeed: 350");
	}
	public void brakeSystem() {
		System.out.println("Dual ATS brake System");
	}
	@Override
	public void autoParking() {
		System.out.println("AutoParking Fetaure is present in Mercedez G9");
	}
}