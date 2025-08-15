package Array;

import java.util.HashSet;
import java.util.Set;

public class unionandintersection {
	
	 public static void printUnion(int[] a, int[] b) {
	        Set<Integer> unionSet = new HashSet<>();
	        for (int num : a) {
	            unionSet.add(num);
	        }
	        for (int num : b) {
	            unionSet.add(num);
	        }

	        System.out.println("Union: " + unionSet);
	    }

	    public static void printIntersection(int[] a, int[] b) {
	        Set<Integer> setA = new HashSet<>();
	        Set<Integer> intersectionSet = new HashSet<>();

	        for (int num : a) {
	            setA.add(num);
	        }

	        for (int num : b) {
	            if (setA.contains(num)) {
	                intersectionSet.add(num);
	            }
	        }

	        System.out.println("Intersection: " + intersectionSet);
	    }

	    public static void main(String[] args) {
	        int[] a = {1, 2, 4, 5, 6};
	        int[] b = {2, 3, 5, 7};

	        printUnion(a, b);         
	        printIntersection(a, b);  
	    }

}
