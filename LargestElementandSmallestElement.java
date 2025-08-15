package Array;

import java.util.Scanner;

public class LargestElementandSmallestElement {
	public static void main(String[] args) {
		int[] arr = {2, 7, 1, 9, 3, 6, 2, 8,9};
//		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
//				max=arr[i];
				min=arr[i];
			}
		}
//		System.out.print("the largest element in the array is"+ max);
		System.out.print("the largest element in the array is"+ min);
	}

}
