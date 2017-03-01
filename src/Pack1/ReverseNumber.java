package Pack1;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num = 1234567;
		ReverseNumber rv = new ReverseNumber();
		System.out.println(rv.reverseNumber(num));
	}

	long reverseNumber(long arg) {
		// TODO Auto-generated method stub
		long result = 0;
		while(arg>0){
			result = result*10 + (arg%10);
			//System.out.println(result);
			arg = arg/10;
		}
		return result;
	}

}
