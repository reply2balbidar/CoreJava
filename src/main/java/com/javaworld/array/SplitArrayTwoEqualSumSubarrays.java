package com.javaworld.array;

public class SplitArrayTwoEqualSumSubarrays {

	static int findSplitPoint(int arr[], int n) {

		int leftSum = 0;

		for (int i = 0; i < n; i++)
			leftSum += arr[i];

		int rightSum = 0;

		for (int i = n - 1; i >= 0; i--) {
			rightSum += arr[i];

			leftSum -= arr[i];

			if (rightSum == leftSum)
				return i;
		}

		return -1;
	}

	static void printTwoParts(int arr[], int n) {
		int splitPoint = findSplitPoint(arr, n);
		for (int i = 0; i < n; i++) {
			if (splitPoint == i)
				System.out.println();

			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 5 };
		int n = arr.length;
		printTwoParts(arr, n);

	}
}
