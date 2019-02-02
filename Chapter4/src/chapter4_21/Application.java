package chapter4_21;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner n=new Scanner(System.in);
		int arr[]=new int[10];
		
		for(int count=0; count<arr.length; count++){
			
			System.out.println(" Enter the number of units");
			arr[count]=n.nextInt();
			
		}
		
		System.out.println("***************************");
		
		int max=arr[0];
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("Max sales count : " +max);
	}
}
