package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Binarysearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {3,2,7,4,5,9};
		System.out.println("Enter the value who you want to search:");
		int value=sc.nextInt();
		Arrays.sort(arr);
		int lower=0;
		int upper=arr.length-1;
		boolean isfound=false;
		while(lower<=upper) {
			int median=(lower+upper)/2;
			if(value<arr[median]) {
				upper=median-1;
				
			}
			else if(value>arr[median]) {
				lower=median+1;
			}
			else {
				System.out.println("the value of the array found at the index"+median);
				isfound=true;
				break;
				
			}
		}	
		if(!isfound) {
			System.out.println("the"+value+"is not found in the array");
		}
		
	}

}
