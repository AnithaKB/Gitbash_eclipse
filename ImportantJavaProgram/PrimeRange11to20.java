package ImportantJavaProgram;

public class PrimeRange11to20 {

	public static void main(String[] args) {
		
		for(int num=11;num<=20;num++) {
		int count=0;
		for(int i=1;i<=num;i++) 
		{
			if(num%i==0)
				count++;
		}

		if(count==2)
		{
			System.out.println(num);
		}
		}
	
		
	}

}
