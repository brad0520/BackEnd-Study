package java2021;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		while (true) {
		System.out.println();
		System.out.println("-------------------------------------------------------------------");
		System.out.println("원하는 기능을 선택해주세요  (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료):");
		
		Scanner sc = new Scanner(System.in);
		int select = Integer.parseInt(sc.nextLine());
		
		if (select==1 ) {
			System.out.println("덧셈을 수행합니다.");
			System.out.println();
			System.out.println("첫번째 숫자를 입력해주세요.");
			int num1 = Integer.parseInt(sc.nextLine());	
			System.out.println("두번째 숫자를 입력해주세요.");
			int num2 = Integer.parseInt(sc.nextLine());	
			System.out.println(num1 +" + " + num2 + " = " + num1+num2);
		} else if (select==2 ) {
			System.out.println("뺄셈을 수행합니다.");
			System.out.println();
			System.out.println("첫번째 숫자를 입력해주세요.");
			int num1 = Integer.parseInt(sc.nextLine());	
			System.out.println("두번째 숫자를 입력해주세요.");
			int num2 = Integer.parseInt(sc.nextLine());	
			System.out.println(num1 +" - " + num2 + " = " + (num1-num2));
		} else if (select==3) {
			System.out.println("곱셈을 수행합니다.");
			System.out.println();
			System.out.println("첫번째 숫자를 입력해주세요.");
			int num1 = Integer.parseInt(sc.nextLine());	
			System.out.println("두번째 숫자를 입력해주세요.");
			int num2 = Integer.parseInt(sc.nextLine());	
			System.out.println(num1 +" * " + num2 + " = " + num1*num2);
		} else if (select==4) {
			System.out.println("나눗셈을 수행합니다.");
			System.out.println();
			System.out.println("첫번째 숫자를 입력해주세요.");
			int num1 = Integer.parseInt(sc.nextLine());	
			System.out.println("두번째 숫자를 입력해주세요.");
			int num2 = Integer.parseInt(sc.nextLine());	
			System.out.println(num1 +" / " + num2 + " = " + num1/num2);
		} else {
			System.out.println();
			System.out.println("계산기를 종료합니다.");
			System.out.println();
			System.out.println("-------------------------------------------------------------------");
			break;
		}
		}
	}

}
