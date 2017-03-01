package Pack1;

public class ReverseWordPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "My name is VIshal Thite";
		String split[] = input.split(" ");
		for(int i=split.length-1;i>=0;i--){
			System.out.print(split[i]+" ");
		}
		//System.out.println(input[1]);
	}

}
