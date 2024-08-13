package ImportantJavaProgram;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		while(n>0) {   //factorial till first num
		int rem=n%10;
		int fact=1;
		for(int i=1;i<=rem;i++) {   //factorial
			fact=fact*i;
			
		}
		sum=sum+fact;
		n=n/10;
		
		}
		if(sum==temp)
			System.out.println("Strong number");

		else
			System.out.println("not a strong number");
	}

}
