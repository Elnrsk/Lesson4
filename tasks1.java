public class tasks1{
	public static void main(String[] args) {
		int x=55;
		double x1=x/10;//4
		double x2=x%10;//5
		if(x1==3||x2==3){
			System.out.println("Number 3 is included");
		}
		else{
			System.out.println("Number 3 is not included");
		}
		int a=5;

		if(x1==a||x2==a){
			System.out.println("a is included");//переводы-косылган-включены
		}
		else{
			System.out.println("a is not included");//переводы-косылмаган-не включены
		}
	}
}