package Base25.week5.hw8.sort;

import java.util.Arrays;

import Base25.week5.lesson9.ArraySort;

public class MainBinarySearcherReccur {
	static final int	arrNum	= 100;

	public static int[] getArr() {
		int[] arr = new int[arrNum];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * arrNum);
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = getArr();
		ArraySort.sortInsertion(arr);
		int k = (int) (Math.random() * arrNum) + 1;
		System.out.println("elem= " + k + ", index = "
				+ BinarySearcherReccur.binarySearch(arr, k));
		System.out.println(Arrays.toString(arr));

	}
}
