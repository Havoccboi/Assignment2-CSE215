import java.util.*;
public class Problem15 {
public static void main(String[] args) {

	
	
	
	long startTime =System.currentTimeMillis();
	int [] array = new int [100000];
	
	
	
	
	selectionSort(array);
	int found=binarySearch(array);
	if(found==-1) {
		System.out.println("Not Found");
	}
	else System.out.println("Found at "+found);
	
	long endTime = System.currentTimeMillis();
	long executionTime = endTime=startTime;
	System.out.println(executionTime);
	
}
public static void takeInput(int array[]) {
	Scanner var = new Scanner(System.in);
	for(int i = 0 ;i<array.length;i++) {
		array[i]=Math.random(100000);
	}
	
}


public static void selectionSort(int [] array) {
	
	for(int i=0;i<array.length-1;i++) {
		int currentMin = array[i];
		int currentMinIndex = i;
		for(int j =i+1;j<array.length;j++) {
			if(array[j]>currentMin) {
				currentMin = array[j];
				currentMinIndex = j;
			}
			if(currentMinIndex != i) {
				array[currentMinIndex]=array[i];
				array[i]=currentMin;
			}
			
		}
	}
	
}
public static int binarySearch(int [] array) {
	int low =0;
	int high = array.length;
	int Index=-1;
	Scanner var = new Scanner(System.in);
	System.out.println("Enter the Key you want to search for");
	int key =var.nextInt();
	
	for(int i=0;i<array.length;i++) {
		int mid = (low + high)/2;
		if(array[mid]>key)
			low =mid+1;
		if(array[mid]<key)
			high=mid-1;
		if(array[mid]==key) {
			Index=i;
			System.out.println(key+" is found!");
			break;
		}
	}
	return Index;
	
}
}