import java.util.Scanner;
public class Problem7 {
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.println("Enter an Integer");
		
		
	int x = var.nextInt();
	
      	System.out.println(isPalindrome(x));
	
	
	}
	
	public static int reverse(int x) {
		
		int rem , rev=0;
		
	 
	 
	 while(x>0) {
		 rem=x%10;
		 rev = rev*10+rem;
		 x=x/10;
		 
		 
	 }
	 
		
		return rev;
		
	}
	public static boolean isPalindrome(int x) {
	int 	reversedX=reverse(x);
	
	if(x==reversedX)
		return true;
	else return false;
	}
	

}
