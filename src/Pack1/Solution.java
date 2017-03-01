package Pack1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String str = null; char[] temp=null; char[] op1,op2;
        while(count-->0){
            str=sc.next();
            temp=str.toCharArray();
            for(int i=0;i<temp.length;i++){
                if(i%2==0){
                    sb1.append(temp[i]);
                }
                else
                	sb2.append(temp[i]);
            }
            System.out.println(sb1.toString()+" "+sb2.toString());
            temp=null; sb1.delete(0, sb1.length()); sb2.delete(0, sb2.length());
        }
        
    }
}