package pkg_oopsDay3_5;
 
public interface ICar {
	public abstract void gears();
	void engine();
	void color();
	void frontMirror();
	void rearMirror();
	void brakeSystem();
	void acceleration();
	void tyreDia();
	void fuelTank();
	void airBags();
	void soundSystem();
	void steeringType();
	void maxSpeed();
	void mileage();
	void bootSpace();
	void seatingCapacity();
}
interface ICar2 extends ICar{
	void autoParking();
}