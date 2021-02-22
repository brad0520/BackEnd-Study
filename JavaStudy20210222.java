package java2021;

import java.util.Scanner;

public class java20210222exam {

	public static void main(String[] args) {

		//		배열 선언 및 초기화 : 자료형[] 배열이름 = {  }
		//		1. 배열 선언하고 사용
		//		필수조건 : 자료형, 길이, 길이를 정하고 값은 기본값으로 초기화 int[] arr = new int[100];

		Scanner sc = new java.util.Scanner(System.in);

		// 배열을 이용해 1~10까지 출력해보세요.
		// 선언과 동시에 초기화
		// 먼저 10개짜리 배열 만들고. 값을 각각 부여.
		System.out.println("배열을 이용해 1~10까지 출력");
		System.out.println();
		int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int i=0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		System.out.println();

	    // 배열의 값을 거꾸로 출력해주세요.
		// 먼저 10개짜리 배열 만들고. 값을 각각 부여.
		System.out.println("배열의 값을 거꾸로 출력");
		System.out.println();
		for (int i = data.length-1; i >= 0; i--) {
			System.out.println(data[i]);
		}
		System.out.println();
		
		
		// 배열을 이용해 사과, 배, 감, 귤, 바나나를 출력해주세요.
		System.out.println("배열을 이용해 사과, 배, 감, 귤, 바나나를 출력");
		System.out.println();
		String[] fruits = {"사과", "배", "감", "귤"};
		for (int i=0; i< fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		System.out.println();

		// arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.
		System.out.println("arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력");
		System.out.println();
		int[] arr = new int[10];
		for (int i=0; i< arr.length; i++) {
			arr[i] = (i+1)*10;
		}
		for (int i=0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();

		// 아래 배열을 두번 출력해주세요.
		int[] arr1 = {1,2,3,4,5};
		System.out.println("배열을 두번 출력");
		System.out.println();
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j< arr1.length; j++) {
				System.out.println(arr1[j]);
			}
			System.out.println();
		}
		System.out.println();
		
	    // v1 아래 배열의 값중 짝수만 출력
		System.out.println("배열의 값중 짝수만 출력");
		System.out.println();
		int[] arr2 = {2,45,12,4,21,6,17,2,8,10};
		int sum = 0;
			for (int i = 0; i < arr2.length; i++) {
				if (arr2[i]%2 == 0) {
					System.out.println(arr2[i]);
					sum += arr2[i];
				}
			}
		System.out.println();
		
	    // v2 배열의 값중 짝수의 합 출력
		System.out.println("배열의 값중 짝수의 합 출력");
		System.out.println();
		System.out.println(sum);
		

	}
}
