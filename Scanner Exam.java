package java2021;

import java.io.IOException;
import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) throws IOException {

		System.out.println();
		System.out.println("------------------------");
		System.out.println("입력값으로 덧셈");
		System.out.println();

		//입력받은 값으로 덧셈

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("첫번째 숫자를 입력해 주세요.");
			int num1 = Integer.parseInt(sc.nextLine());
			
			System.out.println("두번째 숫자를 입력해 주세요.");
			int num2 = Integer.parseInt(sc.nextLine());
			int result = num1+num2;
			
			System.out.println(num1 + "과 " + num2 + "의 합은 " + result + "입니다."); //한 줄 입력
			
			System.out.println();
			System.out.println("------------------------");
			System.out.println("구구단 출력");
			System.out.println();

			//구구단 출력
			while (true) {
				System.out.println("원하는 단을 입력해주세요.");
				int dan = Integer.parseInt(sc.nextLine());
				System.out.println("구구단 " + dan + " 단을 출력합니다." );
				System.out.println();
				
				for (int i=1; i<=9; i++) {
					System.out.println(dan + " * " + i + " = " + dan*i);
				}
				
				if (dan >9 ) {
					System.out.println();
					System.out.println("구구단 출력을 마칩니다.");
					break;
				}
			}
			
			System.out.println();
			System.out.println("------------------------");
			System.out.println("이름과 나이를 입력받아 자기소개");
			System.out.println();
			
			//나이를 입력받아 자기소개 하기
			System.out.println("이름을 입력해주세요:");
			String name = sc.nextLine();
			
			System.out.println("나이를 입력해주세요:");
			int age = Integer.parseInt(sc.nextLine());


			// 출력 : 안녕하세요 29세 홍길동입니다.
			System.out.println("안녕하세요. ^^ " + age + "세 " + name + "입니다.");
			
			System.out.println();
			System.out.println("------------------------");
			System.out.println("입력받은 수의 짝홀 판별");
			System.out.println();
			
			//입력받은 수의 짝홀 판별
			System.out.println("숫자를 입력해주세요:");
			int num4 = Integer.parseInt(sc.nextLine());
			
			if (num4%2 == 0) {
				System.out.println("입력하신 숫자 " + num4 + "는 짝수입니다.");
			} else {
				System.out.println("입력하신 숫자 " + num4 + "는 홀수입니다.");
			}
		} 
		System.out.println();
		System.out.println("------------------------");
		System.out.println();
	}
}
