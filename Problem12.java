import java.util.Scanner;
public class Problem12 {
	public static void main(String[] args) {
		
		
		Scanner var = new Scanner(System.in);
		
		System.out.println("Enter 10 numbers");
		int [] array = new int [10];
		for(int i=0;i<10;i++) {
			array[i]=var.nextInt();
		}
		
		
		
		int distinct = 0;
		 for (int i = 0; i < 10; i++) 
	        { 
	           
	            int j; 
	            for (j = 0; j < i; j++) 
	            if (array[i] == array[j]) 
	                break; 
	      
	            
	            if (i == j) {
	            System.out.print( array[i] + " ");
	            distinct++;
	            }
	        } 
		 
		 System.out.println();
		 System.out.println("Number of Distinc Numbers is "+distinct);
	    } 
		
		
		
		
	}
	


