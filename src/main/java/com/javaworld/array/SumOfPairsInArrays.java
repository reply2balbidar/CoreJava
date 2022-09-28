package com.javaworld.array;

import java.util.Arrays;

public class SumOfPairsInArrays {

	static void sumOfArray(int a[], int n) {

		Arrays.sort(a);
		int left = 0, right = a.length - 1;
		while (left<right) {
			int sum = a[left] + a[right];
			if (sum == n) {
				System.out.printf("(%d,%d) %n", a[left], a[right]);
				left = left + 1;
				right = right - 1;
			} else if (sum < n) {
				left = left + 1;
			} else if (sum > n) {
				right = right - 1;
			}
		}
	}

	static void sumOfpairsInArray(int[] a, int n) {
		int start = 0, end = a.length;
		for (int i = 0; i < a.length; i++) {
			start = a[i];
			for (int j = i + 1; j < a.length; j++) {
				end = a[j];
				if ((start + end) == n) {
					System.out.printf("(%d,%d) %n", start, end);
				}
			}

		}
	}

	public static void main(String[] args) {

		int a[] = {2, 4, 7, 5, 9, 10, -1 };
		int sum = 9;
         sumOfArray(a, sum);
         sumOfpairsInArray(a, sum);
	}
}
