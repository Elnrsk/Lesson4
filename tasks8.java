public class tasks8{
	public static void main(String[] args) {
		int a=7126;

		double q=a/1000;//7
		double w=a/100%10;//5
		double e=a/10%10;//3
		double r=a%10;//6
		if(q!=w&&w!=e&&e!=r&&r!=q){
			System.out.println("it is not same");
		}
		else{
			System.out.println("It is same");
		}
	}
}