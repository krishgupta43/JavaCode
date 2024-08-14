package Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Check {
   public static void main(String[] args) {
	List<String>li=Arrays.asList("The","quick","brown","fox","jumps", "over", "the", "lazy", "dog");
	String res=li.stream().collect(Collectors.joining(" "));
	System.out.println(res);
	String ans=checkPanagram(res);
	System.out.println(ans);

	   
	   
}

private static String checkPanagram(String res) {
	boolean [] mark= new boolean[26];
	int index=0;
	
	for(int i=0;i<res.length();i++) {
		if('A'<=res.charAt(i) && res.charAt(i)<='Z') {
			index=res.charAt(i)-'A';
		}
		else if ('a'<=res.charAt(i) && res.charAt(i)<='z') {
			index=res.charAt(i)-'a';
		}
		else {
			continue;
		}
		mark[index]=true;
	}
	for(int i=0;i<=25;i++) {
		if(mark[i]==false) {
			return "0";
		}
	}
	return "1";
	
	
}
}
