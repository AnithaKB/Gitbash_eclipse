package ImportantJavaProgram;

public class Reverse {

	public static void main(String[] args) {
		int n=386535012;
		int rev=0;
		while(n!=0) {
			rev=(rev*10)+n%10;  // 2 21
			n=n/10;  //38653501 3865350
			System.out.println(rev);
			System.out.println(n);
		}
        System.out.println(rev);
		
	}

}


