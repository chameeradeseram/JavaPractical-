package chapter4_19;

import java.util.Scanner;

public class Application {
	
public static void main(String[] args) {
	
	Scanner i=new Scanner(System.in);
	System.out.println("enter the sale items");
	int saleItemNo=i.nextInt();
	int tot=0;
	
	while (saleItemNo<=4){
		
		if(saleItemNo==1){
			tot+=239;
			
		}
		else if(saleItemNo==2){
			tot+=129;
			
		}
		else if(saleItemNo==3){
			tot+=99;
			
		}
		else if(saleItemNo==4){
			tot+=350;
			
		}
		
	}
	
	System.out.println(tot);
	
	
}
}