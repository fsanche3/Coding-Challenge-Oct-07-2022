package dev.coding.challenges;

import java.util.Arrays;

public class One {
	/*	Problem Statement
Write a program that accepts sets of three numbers and prints the second-maximum number among the three.
Input
First line contains the number of triples, N.
The next N lines which follow each have three space separated integers.
Output
For each of the N triples, output one new line which contains the second-maximum integer among the three.
Constraints
1 ≤ N ≤ 6
1 ≤ every integer ≤ 10000
The three integers in a single triplet are all distinct. That is, no two of them are equal.
Sample Input
3
1 2 3
10 15 5
100 999 500
Sample Output
2
10
500
	 */
	
	public static void main(String[] args) {

		int[][] triplets = { {1,2,3}, {10,15,5}, {100,999,500} };
		
		int[] ans = secondMaxNumber(triplets);
		
		for(int secondMax: ans) {
			System.out.println(secondMax);
		}
		
	}
		
	static int[] secondMaxNumber(int[][] triplets) {
		int[] arr = new int[triplets.length];
		
		for(int i = 0; i < triplets.length; i++) {
			Arrays.sort(triplets[i]);
		}
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = triplets[i][1];
		}
		return arr;
	}

}
