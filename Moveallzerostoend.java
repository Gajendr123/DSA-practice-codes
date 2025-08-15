package Array;

import java.util.Arrays;

public class Moveallzerostoend {
	public static void main(String[] args) {
		int[] arr= {0, 1, 0, 3, 12};
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[j]=arr[i];
				j++;
			}
		}
		while(j<arr.length) {
			arr[j]=0;
			j++;
		}
		System.out.println(Arrays.toString(arr));
		
	}


}
