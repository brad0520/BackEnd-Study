package javaStudy;

import java.util.Arrays;

public class arrayShuffle {

	public static void main(String[] args) {
		int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(numArr));

		for (int i=1; i<100; i++) {
			int n = (int) (Math.random()*10);
			int temp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = temp;
		}

		System.out.println(Arrays.toString(numArr));
	}

}
