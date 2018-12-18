package Chapter3_11;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		Account account1=new Account("Jane Green", 50.00 ,0.00);
		Account account2=new Account("Jhone Blue", -7.53, 0.00);
		
		System.out.printf("%s balance: $%.2f%n%n" , account1.getName(),account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n" , account2.getName(),account2.getBalance());
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter deposit amout for account1 : ");
		double depositAmount =input.nextDouble();
		
		account1.deposit(depositAmount);
		
		System.out.printf("%s balance: $%.2f%n%n" , account1.getName(),account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n" , account2.getName(),account2.getBalance());
		
		System.out.print("Enter deposit amout for account2 :");
		depositAmount =input.nextDouble();
		
		account2.deposit(depositAmount);
		
		System.out.printf("%s balance: $%.2f%n", account1.getName(),account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account2.getName(),account2.getBalance());
		
		
		System.out.println("Enter withdraw amout for account1 : ");
        double withdrawAmount =input.nextDouble();
        
		account1.withdraw(withdrawAmount);
		
		System.out.printf("%s withdrawAmount: $%.2f%n%n%n" , account1.getName(),account1.getBalance(),account1.getWithdraw());
		System.out.printf("%s withdrawAmount: $%.2f%n%n%n" , account2.getName(),account2.getBalance(),account2.getWithdraw());
		
		System.out.println("Enter withdraw amout for account2 : ");
		withdrawAmount =input.nextDouble();
		
		account2.withdraw(withdrawAmount);
		
		System.out.printf("%s withdrawAmount: $%.2f%n%n%n" , account1.getName(),account1.getBalance(),account1.getWithdraw());
		System.out.printf("%s withdrawAmount: $%.2f%n%n%n" , account2.getName(),account2.getBalance(),account2.getWithdraw());
	}

}
