package Examples;

import java.util.HashMap;
import java.util.Map;

public class Sum_2 {
	public static void main(String[] args) {
		int[] A= {2,11,7,15};
		int target = 9; 
		int n=A.length;
		
		check(A,n,target);
	}

	private static void check(int[] A, int n,int target) {
		Map<Integer,Integer>mp=new HashMap<>();
		for(int i=0;i<A.length;i++) {
			int sum=target-A[i];
			if(mp.containsKey(sum)) {
				System.out.println(mp.get(sum));
				System.out.println(i);
				break;
			}
			else {
				mp.put(A[i], i);
			}
		}
	

		
	
		
//		int l=0,h=n-1;
//		int res_l=0,res_r=0;
//		if(n==0)return;
//		while(l<h) {
//			System.out.println("sscndmsnxck");
//		  if(A[l]+A[h]==target) {
//			  res_l=l;
//			  res_r=h;
//		  }
//		  else if((A[l]+A[h])<target) {
//			  l++;
//		  }
//		  else {
//			  h--;
//		  }
//		}
//		System.out.println(res_l+ " "+res_r);
		
		
	}

}
