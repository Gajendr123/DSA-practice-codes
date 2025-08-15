package Array;

import java.util.Arrays;

public class Palindromearray {
	public static void main(String[] args) {
		int[] arr = {2, 7, 1, 9, 9, 1, 7,2};
		boolean ispalindrome=true;
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			if(arr[start]!=arr[end]) {
				ispalindrome=false;
				break;
			}
			start++;
			end--;
		}
		if(ispalindrome) {
			System.out.println("Array is  palindrome ");
		}
		else {
			System.out.println("Arrays is not plaindrome");
		}
		
		
	}

}
