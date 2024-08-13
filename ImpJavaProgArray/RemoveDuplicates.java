package ImpJavaProgArray;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int [] a= {10,20,30,10,20,30,40};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					a[j]=Integer.MAX_VALUE;
				}
			}
		}
System.out.println(Arrays.toString(a));
for(int i=0;i<a.length;i++) {
	if (a[i]!=Integer.MAX_VALUE)
		System.out.println(a[i]);
}
	}

}
