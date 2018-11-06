import java.util.Scanner;
public class Problem6 {
	public static void main(String[] args) {
		
	
	Scanner var = new Scanner(System.in);
	String s="";
	int rem;
	System.out.println("Enter a decimal number");
	int x = var.nextInt();
	
	
	while(x>0) {
		rem=x%2;
		s=rem+""+s;
		x=x/2;
		
		
	}
	System.out.println("The Binary Converted Number is "+s);
	
	
	
	
	}
	

}
