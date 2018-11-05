import java.util.*;
public class Problem3 {
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of Students");
		int x = var.nextInt();
		int [] score = new int [x];
		String [] username = new String [x];
		
		for(int i=0;i<x;i++) {
			System.out.println("Enter Student no "+(i+1)+" name");
			
			username[i]=input.nextLine();
			System.out.println("Enter his Score");
			score[i]=var.nextInt();
			
		}
		
	int 	maxScore=score[0];
	int maxScoreIndex=0;
	int secondMaxScore=0;
	int secondMaxIndex=-1;
	
	for(int i=0;i<x;i++) {
		if(maxScore<score[i]) {
			maxScore=score[i];
			maxScoreIndex=i;
		}
		if(score[i]<maxScore && score[i]>secondMaxScore) {
			secondMaxScore=score[i];
			secondMaxIndex=i;
			
			
		}
		
		
		
	}
	
	String s = username[maxScoreIndex];
	String t = username[secondMaxIndex];
		System.out.println(s);
		System.out.println(t);
		
		
	}

}
