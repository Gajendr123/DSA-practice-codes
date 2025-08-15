package Array;

public class Medianoftwosortedarray {
	public static void main(String[] args) {
		int[]nums1= {1,3};
		int[]nums2= {2,5};
		int[]nums3=new int[nums1.length+nums2.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<nums1.length && j<nums2.length) {
			if(nums1[i]<nums2[j]) {
				nums3[k++]=nums1[i++];
			}
			else {
				nums3[k++]=nums2[j++];
			}
		}
		while(i<nums1.length) {
			nums3[k++]=nums1[i++];
		}
		while(j<nums2.length) {
			nums3[k++]=nums2[j++];
		}
		int size=nums3.length;
		double mid=size/2;
		if(size%2==0) {
			mid=(nums3[(int) (mid-1)]+nums3[(int) mid])/2.0;
			System.out.println("the mid is "+mid);
		}
		else {
			mid=nums3[(int) mid];
			System.out.println("the mid of the array is "+mid);
		}
	}

}
