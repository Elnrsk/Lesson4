public class tasks5{
	public static void main(String[] args) {
		int r=9632;

		double w0=r/1000;//9
		double w1=r/100%10;//6
		double w2=r/10%10;//3
		double w3=r%10;//2
		if(w0==2||w1==2||w2==2||w3==2){
			System.out.println("Number 2 is included");
		}
		else{
			System.out.println("Number 2 is not included");
		}
		if(w0==3||w1==3||w2==3||w3==3){
			System.out.println("3 is included");
		}
		else{
			System.out.println("3 is not included");
		}
	}
}