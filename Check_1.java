package Examples;

import java.util.HashSet;

public class Check_1 {
	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		  for (int i = 0; i < 100; i++) {
			  hs.add(i);   
			  hs.remove(i - 1);
			  } 
		  System.out.println(hs);
		  System.out.println(hs.size());
	}

}
