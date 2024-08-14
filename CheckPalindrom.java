package Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckPalindrom {
	public static void main(String[] args) {
		List<Integer>li=Arrays.asList(120,121,353,44,57);
		
		List<Integer>res=li.stream().filter(CheckPalindrom::IsPalindrom).collect(Collectors.toList());
		System.out.println(res);
	}
	public static boolean IsPalindrom(int num) {
		int originalNum=num;
		int rev=0;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return originalNum==rev;
	}

}
