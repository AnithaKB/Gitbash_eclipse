package ImportantJavaProgram;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int count=0;
		int temp=num;
		int sum=0;
		while(num>0) {
			num/=10;
			count++;
			System.out.println(num);
			System.out.println(count);
		}
		num=temp;
		while(num>0) {
		int rem=num%10;
		int pow=1;
		for(int i=1;i<=count;i++) {
			pow=pow*rem;
			
		}
		System.out.println(pow);
		sum+=pow;
		num/=10;
		
		}
		if(sum==temp)
			System.out.println("Armstrong number");
		else
			System.out.println("not an Armstrong number");
		
	}

}
