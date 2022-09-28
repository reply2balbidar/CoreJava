package com.javaworld.array;

public class DiveideOfSubArrayEqualsToSum {

	static void printSubArray(int arr[], int start, int end) {
		System.out.print("[ ");
		for (int i = start; i <= end; i++)
			System.out.print(arr[i] + " ");
		System.out.print("] ");
	}

	static boolean divideArray(int arr[], int n) {
		int sum = 0;
		for (int i = 0; i < n; i++)
			sum += arr[i];

		int sum_so_far = 0;

		for (int i = 0; i < n; i++) {
			if (2 * sum_so_far + arr[i] == sum) {
				printSubArray(arr, 0, i - 1);
				printSubArray(arr, i + 1, n - 1);

				return true;
			}
			sum_so_far += arr[i];
		}
		return false;
	}
	
	public static void main(String[] args) {

		int arr[] = { 1, 4, 2, 5 };
		int n = arr.length;
		divideArray(arr, n);
	}

}
