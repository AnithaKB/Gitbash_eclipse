package ImpJavaProgArray;

import java.util.Arrays;

public class Remove {

	public static void main(String[] args) {
		 int[] a = { 10, 20, 30, 40, 1, 23 }; 
		 Arrays.sort(a);
		 int st = 0, end = a.length - 1;
		 int ele = 100; 
		 boolean flag = false; 
		 while (st <= end) {
			 int mid = (st + end) / 2; 
			 if (a[mid] == ele) { 
				 flag = true; break; } 
			 else if (a[mid] > ele) end = mid - 1; else st = mid + 1; 
			 } 
		 if (flag == true) 
			 System.out.println("Element is Found");
		 else 
			 System.out.println("Elemnent Not Found");
		 } 

	

}
