public class tasks6{
	public static void main(String[] args) {
		int a=4554;

		double q=a/1000; //4
		double w=a/100%10; //5
		double e=a/10%10; //5
		double r=a%10; //4

		if(q==r&&w==e){
			System.out.println("It is true");
		}
		else{
			System.out.println("it is false");
		}
	}
}