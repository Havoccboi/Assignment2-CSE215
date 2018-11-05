import java.util.Scanner;
public class Problem1 {
	
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		
		int [] array = new int [100];
		System.out.println("Enter an integer the input ends if it is Zero: ");
		
		int index=-1;
		for(int i=0;i<100;i++) {
			array[i]=var.nextInt();
			if(array[i]==0) {
				index =i;
				break;
				}
		}
		
		double sum=0;
		int positives=0;
		int negatives =0;
		double average;
		int n = index;
		for(int i=0;i<index;i++) {
			sum+=(array[i]);
			if(array[i]<0)
				negatives++;
			else positives++;
		
		}
		average = sum/(n*1.0);
		if(index==0) {
			System.out.println("No numbers are entered except zero");
		}
		else {
		System.out.println("The number of positives is "+positives);
		System.out.println("The number of negatives is "+negatives);
		System.out.println("The total is "+sum);
		System.out.println("The average is "+average);
	}
}

}
