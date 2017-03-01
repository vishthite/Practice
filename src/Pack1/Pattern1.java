package Pack1;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the count:");
		int count = in.nextInt();
		//System.out.println(count);
		for (int i=1;i<=count;i++){
			for (int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
