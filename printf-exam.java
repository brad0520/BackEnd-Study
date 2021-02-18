package javaStudy;

public class printf {

	public static void main(String[] args) {

		// 가로 출력 구구단
		System.out.println();
		System.out.println("------------------------");
		System.out.println("가로 출력 구구단");
		System.out.println();

		for(int i=2; i<=9; i++) {
			for (int j=2; j<=9; j++) {
//				System.out.print(j + " * " + i +" = " + j*i + "\t");
				System.out.printf("%d * %d = %-4d", j, i, j*i );
			}
			System.out.println();
		}

	}
}
