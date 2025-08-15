package Array;

import java.util.Arrays;

public class Twosum {
	public static void main(String[] args) {
		int[]arr= {8,2,3,9,5};
		int[]index=new int[2];
		int target=5;
		int p=0;
		boolean found=false;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					index[p++]=i;
					index[p++]=j;
					found=true;
					break;
					
				}
			}
			if(found) {
				break;
				
			}
		}
		System.out.println("the index are those has the sum equals to target");
		System.out.println(Arrays.toString(index));
	
		
	}

}
