
public class EvenIntegers {

	public static void main(String[] args) {
		
		int tot=0;
		for(int i=0; i<=10; i++){
			
			if(i%2==0){
				System.out.println(i);
				tot=i+tot;
			}
			
		}
		
		System.out.println("Total- " +tot);
	}
}
