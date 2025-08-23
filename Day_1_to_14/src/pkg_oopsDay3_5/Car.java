package pkg_oopsDay3_5;
 
class Car{
	
	private String model;
	private int make_year;

	public Car() {
		System.out.println("Demo Car Is ready");
	}
 

	public Car(String model, int make_year) {
		this.model = model;
		this.make_year = make_year;
	}
 
	
	public String getModel() {
		return model;
	}
 
	public void setModel(String model) {
		this.model = model;
	}
 
	public int getMake_year() {
		return make_year;
	}
 
	public void setMake_year(int make_year) {
		this.make_year = make_year;
	}
 
	@Override
	public String toString() {
		return "Car [model=" + model + ", make_year=" + make_year + "]";
	}
}