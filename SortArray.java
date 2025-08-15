package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {
		int[] arr = {2, 7, 1, 9, 3, 6, 2, 8,9};
		int length=arr.length;
//	Bubble sort	
//		for(int i=0;i<=length-2;i++) {
//			for(int j=0;j<=length-2-i;j++) {
//				if(arr[j]>arr[j+1]) {
//					int temp=arr[j+1];
//					arr[j+1]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
//		Selection sort
//		for(int i=0;i<=arr.length-2;i++) {
//			int min=arr[i];
//			int pos=i;
//			for(int j=i+1;j<=arr.length-1;j++) {
//				if(arr[j]<min) {
//					min=arr[j];
//					pos=j;
//				}
//			}
//			arr[pos]=arr[i];
//			arr[i]=min;
//			
//		}
//		System.out.print(Arrays.toString(arr));
//		Insertion sort
		for(int i=1;i<=arr.length-1;i++) {
			int curr=arr[i];
			int prev=i-1;
			while(prev>=0 && curr<arr[prev]) {
				arr[prev+1]=arr[prev];
				prev--;
			}
			arr[prev+1]=curr;
		}
		System.out.println(Arrays.toString(arr));
		


}
}
