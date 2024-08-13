package ImpJavaProgString;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		//Anagram has same length and letters
		
		String s1="silent";
		String s2="listen";
		if(s1.length()==s2.length()) {
			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean flag=true;
			for(int i=0;i<=ch1.length-1;i++) {
				if(ch1[i]!=ch2[i]) {
					flag=false;
					break;
				}
			}if(flag==true)
				System.out.println("Anagram");
			else
				System.out.println("Not a anagram..");
		}
		else
			System.out.println("Lengths are not same");
	}

}
