
public class Interest {

	public static void main(String[] args) {
		double amount;
		double principal=1000.0;
		double rate=0.0;
		
		System.out.printf("%s%30s\n", "YEAR", "Amount on deposit");
		
		for(int r=5; r<=10; r++){
			rate=r;
			for(int year=1; year<=10; ++year){
				amount=principal*Math.pow(1.0 + rate,year);
				System.out.printf("%4d%,30.2f%n",year,amount);
			}
			
			System.out.println("    ");
		}
		
		
	}
}
