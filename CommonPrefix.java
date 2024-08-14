package Examples;

import java.util.Arrays;

public class CommonPrefix {
	
	public static void main(String[] args) {
		String []str= {"apple", "ape", "april"};
			//{"flower","flow","flight"};
		Arrays.sort(str);
	    for(String s:str)
		System.out.print(s+" ");
	    System.out.println();
		String res=check(str);
		System.out.println(res);
		
		   }
//	floght flow flower 
	private static String check(String[] str) {
		int n=str.length;
		if(n==0)return "";
		if(n==1)return str[0];
		int min=Math.min(str[0].length(),str[str.length-1].length());

		String s1=str[0];  //ape
		String s2=str[n-1];  //april
		int i=0;
		while(i<min && s1.charAt(i)==s2.charAt(i))
			i++;
		String s=s1.substring(0,i);
		 return s;
	}
}
