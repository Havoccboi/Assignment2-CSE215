import java.util.Scanner;
import java.util.Arrays; 
public class SortString {
public static void main (String [] args) {
	System.out.println("Enter String");
	Scanner var = new Scanner(System.in);
	String s = var.next();
	
	System.out.println("Sorted String is :\n"+sort(s) );
	
}

public static String sort(String s) {
	
	
	char tempArray[] = s.toCharArray(); 
    
    
    Arrays.sort(tempArray); 
      
     
    return new String(tempArray); 
    
}
}
