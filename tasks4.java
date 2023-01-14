public class tasks4{
	public static void main(String[] args) {
		int q=7419;

		double w0=q/1000;//7
		double w1=q/100;//4
		double w2=q/10;//1
		double w3=q/10;//9
		if(w0==4||w1==4||w2==4||w3==4){
			System.out.println("Number 4 is included");
		}
		else{
			System.out.println("Number 4 is not included");
		}
		int b=8;
		if(w0==b||w1==b||w2==b||w3==b){
			System.out.println("b is included");
		}
		else{
			System.out.println("b is not included");
		}
	}
}