package Pack1;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] input={'a','b','c','a','b','a','d'};
		java.util.Arrays.sort(input);
		//java.util.Arrays.
		int i=0,count=0;
		
		for (i=0;i<input.length-1;i++){
			System.out.println(input[i]);
			i++;
		}
		//kmadadammdlkasd
		for (char c = 'a';c<='z';c++){
			count=0;
			for (char x:input){
				if(x==c)
					count++;
			}
			//This is comment
			
			if(count!=0)
				System.out.println("Count of "+c+" is "+count);
		}
		
			
			//i++;
	}
}
		