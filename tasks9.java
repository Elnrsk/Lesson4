public class tasks9{
	public static void main(String[] args) {
		int n=247381;

		double s=n/100000;//2
		double a=n/10000%10;//4
		double q=n/1000%10;//7
		double w=n%100%10;//3
		double e=n/10%10;//8
		double r=n%10;//1
		if(s+a+q==w+e+r){
			System.out.println("It is true solution");
		}
		else{
			System.out.println("It is false solution")
		}
	}
}