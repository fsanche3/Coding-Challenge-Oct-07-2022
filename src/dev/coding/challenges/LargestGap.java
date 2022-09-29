package dev.coding.challenges;

import java.util.Arrays;

public class LargestGap {
	
	/*
	 * Largest Gap (Java)

	Given an array of integers, return the largest gap between the sorted elements of the array.

	For example, consider the array:


	[9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5]


	... in which, after sorting, the array becomes:


	[0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 26]


	... so that we now see that the largest gap in the array is between 9 and 20 which is 11.

	Examples
	largestGap([9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5]) ➞ 11
	 After sorting: [0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 26]

	 Largest gap between 9 and 20 is 11

	 */
	
	public static void main(String[] args) {

		int[] arr = {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5};		
		int ans = largestGap(arr);
		System.out.println(ans);
	}
		
	static int largestGap(int[] arr) {
		
		Arrays.sort(arr);
		
		int maxGap = 0;
		int j  = 1;
		
		for(int i = 0; i < arr.length - 1; i++, j++) {
			if(arr[j] - arr[i] > maxGap) {
				maxGap = arr[j] - arr[i];
			}
		}
		
		return maxGap;
	}

}
