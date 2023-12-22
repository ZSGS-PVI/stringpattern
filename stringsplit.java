package patternProgram;

import java.util.Scanner;

public class stringsplit {
	
	static void pattern(String[] str) {
		
		String s1=str[0];
		String s2=str[1];

		String  sr ="";
		String st="";
		int j=0;
		for(int i=0;i<s1.length();i++) {
			
			char m = s1.charAt(i);
			sr+=m;
			if(j<s2.length()) {
				char n = s2.charAt(j);
				st+=n;
				j++;
			}
		
		
		System.out.println(sr.toUpperCase()+st.toUpperCase()); 
					
		}
		}
	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		String str=in.next();//"BreakingBad"
		String[] k=str.split("(?=[A-Z])");

		pattern(k);

}
}
