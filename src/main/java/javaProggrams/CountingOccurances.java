package javaProggrams;

import java.util.HashMap;

public class CountingOccurances {

	public static int occurance(int arr[], int x, int n) {

		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			if (x == arr[i]) {
				res++;

			}
		}
		return res;
	}

	public static void main(String[] args) {

		int a[] = { 1, 1, 1, 3, 2, 2, 2, 2, 0, 0, 0 };

		int x = 3;
		int n = a.length;
		System.out.println(occurance(a, x, n));

		// HashMap<Integer, Integer> countmap = new HashMap<Integer, Integer>();
		//
		// for (int i : a) {
		// if (countmap.containsKey(i)) {
		//
		// countmap.put(i, countmap.get(i) + 1);
		//
		// }
		//
		// else {
		// countmap.put(i, 1);
		// }
		//
		// }
		// System.out.println(countmap);
	}

}
