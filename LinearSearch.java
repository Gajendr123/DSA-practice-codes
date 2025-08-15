package Array;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {3,2,7,4,5,9};
		System.out.println("Enter the value who you wnat to search:");
		int index=0;
		int k=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k) {
				System.out.println("the value is found in the array at the index "+i);
				
			}
		}
	}

}
