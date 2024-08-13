package ImpJavaProgPattern;

import java.util.Scanner;

public class Assign2Patterncol1col2col3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
	    int n=sc.nextInt();
	    
	    for(int i=1;i<=n;i++) {
	    	int a=1;
	    	for(int j=1;j<=n;j++) {
	    		System.out.print(a+" ");
	            a++;
	    	}
	    	System.out.println();
	    }
	}
}
