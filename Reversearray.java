package Array;

import java.util.Arrays;

public class Reversearray {
	public static void main(String[] args) {
		int[] arr = {2, 7, 1, 9, 3, 6, 2, 8,9};
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
//		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
