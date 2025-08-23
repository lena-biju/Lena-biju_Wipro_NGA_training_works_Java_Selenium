package pack1;

public class Generic<T> {
	private T item;
	public void set(T item) {
		this.item=item;
		
	}
	public T get() {
		return item;
		
	}

	public static void main(String[] args) {
		Generic<Integer>intGeneric=new Generic<>();
		intGeneric.set(200);
		System.out.println("Int value is :"+intGeneric.get());
		
		Generic<String>strGeneric=new Generic<>();
		strGeneric.set("hello 123");
		System.out.println("String  value is :"+strGeneric.get());

		
		
		

	}

}
