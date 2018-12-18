package Chapter3_14;

public class DateTest {
	
	public static void main(String[] args) {
		
		DateTest dt=new DateTest();
		dt.displayDate();
		
	}

	 public void displayDate(){
		 
		 Date d =new Date(16, 12, 2018);
			 d.getDay();
			 d.getMonth();
			 d.getYear();
			 
	System.out.println(d.getDay() +"/" +d.getMonth() +"/"+ d.getYear());		 
		 
	 }
}
