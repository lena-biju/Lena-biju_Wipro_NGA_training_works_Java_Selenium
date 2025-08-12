package Day1_to_2;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
public class Dateandtime {

	public static void main(String[] args) {
		LocalDate obj1= LocalDate.now();
		System.out.println(obj1);
		
		LocalTime obj2=LocalTime.now();
		System.out.println(obj2);
		
		
		LocalDateTime obj3=LocalDateTime.now();
		System.out.println(obj3);
		DateTimeFormatter obj4=DateTimeFormatter.ofPattern("dd-mm-yy");
		String formateddate=obj3.format(obj4));
		System.out.println(formateddate);

	}

}
