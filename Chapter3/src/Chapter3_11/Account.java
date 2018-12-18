package Chapter3_11;

public class Account {
	
	private String name;
	private double balance;
	private double withdraw;
	
	
	public double getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	
	//
	public Account(String name, double balance,double withdraw){
		this.name=name;
		
		if(balance>0.0)
			this.balance=balance;
		
		this.withdraw=withdraw;
	}
	
	public void deposit(double depositAmount){
		if(depositAmount>0.0)
			balance=balance+depositAmount;
	}
	
	public void withdraw(double withdrawAmount){
		if(withdrawAmount<balance){
		withdraw=balance-withdrawAmount;
		System.out.print(withdraw);
		}
		
		else{
			System.out.println("Withdrowal amount excedded account balance");
		}
		
	}
	
	

}
