import java.util.*;
public class Problem8 {
public static void main(String[] args) {
	Scanner var = new Scanner(System.in);
	
	System.out.println("The amount invested: ");
	double investmentAmount = var.nextDouble();
	System.out.println("Annual interest rate: ");
	double monthlyInterestRate = var.nextDouble();
	System.out.println("Number of years: ");
	int years = var.nextInt();
	System.out.println("Years     Future Value");
	for(int i=1;i<=years;i++) {
		double value=futureInvestmentValue(investmentAmount,monthlyInterestRate,i);
		value = Math.round(value*100d)/100d;
		if(i<=9) 
		System.out.print(i+"         ");
		else System.out.print(i+"        ");
		System.out.println(value);
	}
	
	
	
}



public static double futureInvestmentValue (double investmentAmount,double monthlyInterestRate,int years)
{       monthlyInterestRate*=0.01;
        monthlyInterestRate/=12;
   double y= 1+monthlyInterestRate;
   double z= (double)years*12;
	double x = Math.pow(y,z);
	double futureInvestmentValue = investmentAmount * x;
	return futureInvestmentValue;
}
}
