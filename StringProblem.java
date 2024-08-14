package Examples;

import java.util.HashMap;
import java.util.Map;

public class StringProblem {
	static void check(int[] A, int n, int t) {
		if(n==0|| n==1) {
			System.out.println("-1");
		}
		
	  Map<Integer,Integer>mp=new HashMap<>();
	  for(int i=0;i<n;i++) {
		  int compliment=t-A[i];
		  if(mp.containsKey(compliment)) {
			  System.out.println(mp.get(compliment));
			  System.out.println(i);
			  
		  }else {
			  mp.put(A[i],i);  
		  }
		  
		  
	  }	}

		public static void main(String[] args) {
			   int[] A= {15, 11, 2, -7};
			   int t=26;
			   int n1=A.length;
			   check(A,n1,t);
			
		}
		
}

