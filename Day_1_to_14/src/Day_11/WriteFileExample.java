package FileHandling;

import java.io.FileWriter;
import java.io.IOException;
public class WriteFileExample {
   public static void main(String[] args) {
       try (FileWriter writer = new FileWriter("D:\\samples\\mysamplefile.txt")) {
          writer.write("Hello, Java File Handling! this is my sample file ");
       } catch (IOException e) {
          e.printStackTrace();
       }
   }
}