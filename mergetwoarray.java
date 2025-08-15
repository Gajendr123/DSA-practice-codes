package Array;

import java.util.Arrays;

public class mergetwoarray {
	public static void main(String [] args) {
		int[] arr = {2, 7, 1, 9, 3, 6, 2, 8,9};
		int[] arr1 = {2, 7, 1, 9, 2, 8,9};
//		int[] arr2=new int[arr.length +arr1.length];
//		int index=0;
//		for(int i=0;i<arr.length;i++) {
//			arr2[index++]=arr[i];
//		}
//		for(int i=0;i<arr1.length;i++) {
//			arr2[index++]=arr1[i];
//		}
//		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr);
		Arrays.sort(arr1);
		int m=arr.length;
		int n=arr1.length;
		int [] arr2=new int[m+n];
		int i=m-1;
		int j=n-1;
		int k=m+n-1;
		while(i>=0 && j>=0) {
			if(arr[i]>arr1[j]) {
				arr2[k--]=arr[i--];
			}
			else {
				arr2[k--]=arr1[j--];
			}
		}
		while(i>=0) {
			arr2[k--]=arr1[i--];
		}
		while(j>=0) {
			arr2[k--]=arr1[j--];
		}
		
		System.out.println(Arrays.toString(arr2));
		
	}

}
