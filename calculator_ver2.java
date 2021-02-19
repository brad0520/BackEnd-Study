package java2021;

import java.util.Scanner;

public class calculator2 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int result = 0;

		Outter : while (true) {
			System.out.println();
			System.out.println("---------------------------------------------------------------");
			System.out.println("원하는 기능을 선택해주세요  (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료):");

			Scanner sc = new Scanner(System.in);
			int select = Integer.parseInt(sc.nextLine());

			String str = "";
			String form1 = "";

			switch (select) {
			case 1: 
				str="덧셈";
				result = num1 + num2;
				form1 = num1 + " + " + num2;
				break;
			case 2:
				str="뺄셈";
				result = num1 - num2;
				form1 = num1 + " - " + num2;
				break;
			case 3: 
				str="곱셈";
				result = num1 * num2;
				form1 = num1 + " * " + num2;
				break;
			case 4: 
				str="나눗셈";
				result = num1 / num2;
				form1 = num1 + " / " + num2;
				break;
			case 5:
				System.out.println();
				System.out.println("계산기를 종료합니다.");
				System.out.println("---------------------------------------------------------------");
				break Outter;
			}

			System.out.println();
			System.out.println(str + "을 수행합니다.");
			System.out.println("첫번째 숫자를 입력해주세요.");
			num1 = Integer.parseInt(sc.nextLine());	
			System.out.println("두번째 숫자를 입력해주세요.");
			num2 = Integer.parseInt(sc.nextLine());
			System.out.println(form1 + " = " + result);

		}

	}

}
