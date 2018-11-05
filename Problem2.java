import java.util.*;
public class Problem2 {
	public static void main(String[] args) {
		Scanner var = new Scanner (System.in);
		System.out.println("Enter tuition fee ");
		double x = var.nextDouble();
	    int increasePercentage =5;
	    for(int i=1;i<=10;i++) {
	    	x=x+((5*x)/100);
	    }
	    double totalCost=0;
	 for(int i=1;i<=4;i++) {
		 totalCost+=(x=x+((5*x)/100));
	 }
	    
	 totalCost = Math.round(totalCost*10d)/10d;
		
		System.out.println(totalCost);
	}

}
