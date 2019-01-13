package chapter4_18;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		
		int crdtsLimit=1000;
		
		Scanner a=new Scanner(System.in);
		System.out.println("Account Number-");
		int accountNumber=a.nextInt();
		
		System.out.println("Balance");
		int balance1=a.nextInt();
		
		System.out.println("Charge-");
		int charge=a.nextInt();
		
		
		System.out.println("Credits-");
		int Credits=a.nextInt();
		 
		int balance=balance1+charge-Credits;
		System.out.println("new balance - " +balance);
		
		if(balance>crdtsLimit){
			System.out.println("Credit limit exceed");
		}
		else{
			System.out.println("Credit limit not exceed");
		}
		
	}

}
