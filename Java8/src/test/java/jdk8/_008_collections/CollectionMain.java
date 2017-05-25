package _008_collections;

import java.util.Arrays;

class CollectionMain {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 3, 5, 6, 1 };
		Integer arr1[] = { 2, 3, 4, 5, 3, 5, 6, 1 };
		// Will Not print array value beacuse array does'nt override toSring
		// method
		System.out.println(arr);
		System.out.println(arr.toString());
		// Print List of arrays as string
		System.out.println(Arrays.toString(arr));
		// Can convert only objects
		System.out.println(Arrays.deepToString(arr1));

	}
}
