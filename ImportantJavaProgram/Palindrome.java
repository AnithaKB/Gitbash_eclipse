package ImportantJavaProgram;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int rev=0;
		int temp=n;
		while(n!=0)
		{
			rev=(rev*10)+n%10;
			n=n/10;
		}
	System.out.println(rev);
	
		if(rev==temp) {
			System.out.println("palindrome");
		}
			
		else
			System.out.println("not a palindrome");

	}

}
