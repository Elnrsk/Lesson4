public class tasks10{
	public static void main(String[] args) {
		int n=2004;
		 
		if((n%4==0)||(n%100==0)||(n%400==0)){
			System.out.println("It is true");
		}
		else{
			System.out.println("It is false");
		}
	}
}