public class tasks3{
	public static void main(String[] args) {
		int q=456;

		double w0=q/100;//4
		double w1=q/10%10;//5
		double ww2=q%10;//6

		if(w0==6||w1==6||w2==6){
			System.out.println("Number 6 is included");
		}
		else{
			System.out.println("Number 6 is not included");
		}
		int n=5;
		if(w0==n|| w1==n||w2==n){
			System.out.println("5 is included");
		}
		else{
			System.out.println("5 is not included")
		}
	}
}