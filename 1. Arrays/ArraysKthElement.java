import java.util.*;

class ArraysKthElement {
	public static void main(String[] args) {
		int a[] = { 2, 34, 56, 45, 90, 33 };
		int k = 3; // 3rd smallest
		int l = 1;
		int r = 6;
		int kth = kthSmallest(a, l, r, k);
	}

	public static int kthSmallest(int[] arr, int l, int r, int k) {
		// Copy the array into a new array
		int[] copyArr = Arrays.copyOfRange(arr, l, r + 1);

		// Sort the new array
		Arrays.sort(copyArr);

		// Return the kth smallest element
		return copyArr[k - 1];

	}

}
