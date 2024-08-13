package ImpJavaProgArray;

public class MinimumInArray {

	public static void main(String[] args) {
		int [] a= {1,2,30,4,5};
		int min=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]<min)
				min=a[i];
	}
	System.out.println(min);
	}

}
