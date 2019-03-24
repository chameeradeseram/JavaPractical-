import java.util.Scanner;

public class StudentGrade {
	
	public static void main(String[] args) {
		
		int countA=0;
		int countB=0;
		int countC=0;
		int countD=0;
		
		Scanner s=new Scanner(System.in);
		
		
		for(int i=1; i<=2; i++){
		System.out.println("Student Name");
		String name=s.nextLine();
		
		System.out.println("Student grade");
		String grade=s.nextLine();
	
		
		if(grade=="A"){
			countA=countA+1;
		}
		
		else if(grade=="B"){
			countB=countB+1;
		}
		
		else if(grade=="C"){
			countC=countC+1;
		}
		
		else if(grade=="D"){
			countD=countD+1;
		}
		
		
	}
		System.out.println("A - " +countA);
	}

}
