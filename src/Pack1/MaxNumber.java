package Pack1;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		int[] arr1 = {10,200,3,4,5};
		int max=arr1[0];
		for(int x:arr1){
			//System.out.println(x);
			if(x>max)
				max=x;
		}
		System.out.println(max);
	}

}
