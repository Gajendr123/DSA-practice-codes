package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Arraykth {
	public static void main(String[] args) {
		int[] arr = {2, 7, 1, 9, 3, 6, 2, 8,9};
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the kth value");
			int k = sc.nextInt();
			int index = -1;
			int max = 0;

			for (int i = 0; i < k; i++) {
				max = Integer.MIN_VALUE;
				index=-1;
				for (int j = 0; j < arr.length; j++) {
					if (arr[j] > max) {
						max = arr[j];
						index = j;
					}
				}
				if(index!=-1) {
				arr[index] = Integer.MIN_VALUE;
			}
			}
//			System.out.println(Arrays.toString(arr));
			System.out.println(max);
		}
	}
}
