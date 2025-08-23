package pkg_oopsDay3_5;
public class AbstractionExamp{
   public static void main(String[] args) {
       // Using the abstract class Number via its subclass Integer
       Number num = new Integer(42);
 
      System.out.println("Integer value: " + num.intValue());
      System.out.println("Double value: " + num.doubleValue());
   }
}