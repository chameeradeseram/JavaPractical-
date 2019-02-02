package chapter4_20;

import java.util.Scanner;

import com.sun.javafx.scene.EnteredExitedHandler;

public class Application {
	
	public static void main(String[] args) {
		
		int c=1;
		while(c<=3){
		
		Scanner n=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=n.nextLine();
		
		Scanner num=new Scanner(System.in);
		System.out.println("Enter earing");
	    int e=num.nextInt();
		
	    double tax=0;
		if(e>30000){
			
			tax=e-(e*15/100);
		}
			
	
		System.out.println("Citizen's name : " +name);
		System.out.println("Citizen's earnings: " +e);
		System.out.println("Citizen's earnings after add tax: " +tax);
		
		c++;
	}
	}

}
