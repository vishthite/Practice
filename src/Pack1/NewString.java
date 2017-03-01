package Pack1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.Rea

class NewString {

	public static void main(String[] args) {
		String str = "abc";
		str = str.concat(str);
		System.out.println(str);
		
		StringBuffer strbuf = new StringBuffer("A Buffer ");
		strbuf.append("is good");
		System.out.println(strbuf);
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		try {
			str=bfr.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
