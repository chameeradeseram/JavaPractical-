package chapter4_17;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		int a=0;
		Scanner m=new Scanner(System.in);
		System.out.println("Enter the miles");
		int miles=m.nextInt();
		
		System.out.println("Enter the gallons");
		int gallons=m.nextInt();
		
	if(gallons !=-1)  {
			
	      a=gallons/miles;
	     
		}
		
		 System.out.println(a);
		
	}
}
