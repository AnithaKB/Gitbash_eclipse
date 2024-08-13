package ImpJavaProgPattern;

import java.util.Scanner;

public class Assign1Patternrow1row2row3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
	    int n=sc.nextInt();
	    int a=0;
	    for(int i=1;i<=n;i++) {
	    	a++;
	    	for(int j=1;j<=n;j++) {
	    		System.out.print(a+" ");
	            
	    	}
	    	System.out.println();
	    }

	}

}
