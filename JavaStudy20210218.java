package java2021;

public class java20210218 {

	public static void main(String[] args) {
		// 1부터 100까지의 합을 구해주세요.
		System.out.println();
		System.out.println("------------------------");
		System.out.println("1부터 100까지의 합을 구하기");
		System.out.println();

		int sum=0;
		for (int i=1; i<=100; i++) {
			sum+=i;
		}
		System.out.println(sum);

		// n부터 m까지의 수중 k의 배수인 수들의 합 구하기
		System.out.println();
		System.out.println("------------------------");
		System.out.println("n부터 m까지의 수중 k의 배수인 수들의 합 구하기");
		System.out.println();

		int n = 5;
		int m = 80;
		int k = 3;
		int sum1=0;
		for(int n1=n; n1<=m; n1++) {
			if(n1%k==0) {
				sum1+=n1;
			}
		}
		System.out.println(sum1);

		// 구구단 (짝수번째만 곱하기)
		System.out.println();
		System.out.println("------------------------");
		System.out.println("구구단 (짝수번째만 곱하기)");
		System.out.println();

		for(int i=2; i<=9; i++) {
			for (int j=2; j<9; j+=2) {
				System.out.println(i + " * " + j +" = " + i*j);
			}
		}

		// 응용구구단
		System.out.println();
		System.out.println("------------------------");
		System.out.println("응용구구단");
		System.out.println();

		int n1 = 3;
		int m2 = 17;
		int limit = 10;

		for(int i = n1; i <= m2; i++) {
			if(i % 2 != 1) {
				for(int j = 1; j <= limit; j++) {
					if(j % 2 == 0) {
						System.out.println(i + " * " + j + " = " + i * j);
					}
				}
			}
		}
		
		// 가로 출력 구구단
		System.out.println();
		System.out.println("------------------------");
		System.out.println("가로 출력 구구단");
		System.out.println();

		for(int i=2; i<=9; i++) {
			for (int j=2; j<=9; j++) {
				System.out.print(j + " * " + i +" = " + j*i + "\t");
			}
			System.out.println();
		}
		

		// 삼각형 그리기1
		System.out.println();
		System.out.println("------------------------");
		System.out.println("삼각형 그리기1");
		System.out.println(); 

		int y=10;
		for (int i=1; i<=y; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 삼각형 그리기2
		System.out.println();
		System.out.println("------------------------");
		System.out.println("삼각형 그리기2");
		System.out.println(); 

		int y1=10;
		for (int i=1; i<=y1; i++) {
			for (int j=y1; j>i; j--) {
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 삼각형 그리기3
		System.out.println();
		System.out.println("------------------------");
		System.out.println("삼각형 그리기3");
		System.out.println(); 

		int y2=10;
		for (int i=1; i<=y2; i++) {
			for (int j=y2-i; j>=0; j--) {
				System.out.print(" ");
			}
			for (int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
