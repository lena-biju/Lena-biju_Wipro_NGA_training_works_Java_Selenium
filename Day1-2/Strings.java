package Day1_to_2;

public class Strings {

	public static void main(String[] args) {
		String str="hello java";
		String mobile="235648795";
		System.out.println(str);
		System.out.println(mobile.length());//finding number of character using metheod length()
		
		
		//built in metheods
		//length()
		//toUpperCase
		//toLowerCase
		String a="apple";
		System.out.println(a.toUpperCase());
		
		//hashcode
		String b="hai hello";
		System.out.println(b.hashCode());
		//indexing metheod indexof
		
		String txt="ABC is DOg";//white space also gets index starts from 0
		System.out.println(txt.indexOf("is"));
		
		//concatination
		
		String one="Mary";
		String two=" Alice";
		System.out.println("name is:"+" " +one+" " +two);//or by using concat()
		System.out.println(one.concat(two));
		
		
		//string and numbers//cocatination will happen here 1010
		
		String w="10";
		String x="10";
		String y=w+x;
		System.out.println(y);
		
		
		
		
		
		
		
		

	}

}
