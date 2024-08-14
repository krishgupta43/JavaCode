package Examples;

//input: aabbcccddddab
//output: 2a2b3c4d1a1b
public class AccionLab {
	
	public static void main(String[] args) {
		String str="aabbcccddddab";
		for(int i=0;i<str.length();i++) {
			int count=1;
			while(i <str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
				i++;
				count++;
			}
			System.out.print(count+""+str.charAt(i));
		}
		
	}

}

//T-o(n)
//S-o(1)