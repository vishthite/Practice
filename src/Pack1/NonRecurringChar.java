package Pack1;

public class NonRecurringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "sakkash"; boolean flag = false;
		char[] arr = str.toCharArray();
		
		for(int i=0;i<str.length();i++){
			flag=false;
			for(int j=0;j<str.length();j++){
				if(arr[i]==arr[j] && i!=j){
					//System.out.println("No output");
					flag=true;
					break;
				}
				
			}
			if(!flag){
				
				System.out.println(arr[i]+" is not Repeated");
				return;
			}
		}
		
	}

}
