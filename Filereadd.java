package exceptionw3;
import java.util.Scanner;
import java.io.*;
public class Filereadd {
	public static void main(String args[]) {
      try {
    	 File f1 = new File("C:\\Users\\josem\\Downloads\\java\\mainmethod.java");
    	 Scanner scanner = new Scanner(f1);
    	 while(scanner.hasNextLine()) {
    		 String datas = scanner.nextLine();
    		 System.out.println(datas);
    		 
    	 }
    	 System.out.println("Process completed");
      }
      catch(IOException e) {
    	  System.out.println("Error");
      }
}
}