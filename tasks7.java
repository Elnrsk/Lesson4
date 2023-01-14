public class tasks7{
	public static void main(String[] args) {
		int n=1241;

		double q=n/1000;
		double w=n/100%10;
		double e=n/10%10;
		double r=n%10;

		if(q==w&&w==e){
			System.out.println("True");
		}else if(q==w&&w==r){
			System.out.println("True");
		}else if(q==e&&e==r){
			System.out.println("True");
		}else if(q==r&&r==w){
			System.out.println("True");
		}else if(w==e&&e==r){
			System.out.println("True");
		}else if(w==r&&r==e){
			System.out.println("True");
		}else {
			System.out.println("false");
		
		}
	}
}