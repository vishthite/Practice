package Pack1;

public class Factorial {
	
	long fact(long n){
		if(n==1||n==0)
			return 1;
		else
			return (n*fact(n-1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factorial f1 = new Factorial();
		System.out.println(f1.fact(10));
	}

}
