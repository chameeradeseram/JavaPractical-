package Chapter3_13;

public class CarApplication {

	public static void main(String[] args) {
		
		Car c1=new Car(100.00);
		Car c2=new Car(200.00);
		
		System.out.println(c1.getPrice());
		System.out.println(c2.getPrice());
		
		c1.getDiscount(0.5);
		c2.getDiscount(0.7);
		
		System.out.println("Discount Added price c1: " +c1.getPrice() );
		System.out.println("Discount Added price c2: " +c2.getPrice() );
	
	}
	
	
}
