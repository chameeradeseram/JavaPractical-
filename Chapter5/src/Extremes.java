import java.util.Scanner;

public class Extremes {
 
	public static void main(String[] args) {
		
	Scanner n=new Scanner(System.in);
	System.out.println("Enter the count of elements");
	int count=n.nextInt();
	int num = 0;
	for(int i=0; i<=count; i++){
		System.out.println("Enter the element");
	num	=n.nextInt();
		
	}
	
	int min=Math.min(num,num);
	System.out.println(min);

	}

}