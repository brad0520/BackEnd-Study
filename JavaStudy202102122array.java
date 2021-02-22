package java2021;

import java.util.Arrays;
import java.util.Scanner;

public class java20210222 {

	public static void main(String[] args) {

		Scanner sc = new java.util.Scanner(System.in);

		String[] data = new String[3];

		while(true) {
			System.out.println("명령어를 입력해주세요 : ");
			String command = sc.next();

			if(command.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if(command.equals("help")) {
				System.out.println("==========================");
				System.out.println("help : 도움말");
				System.out.println("add : 데이터 추가");
				System.out.println("read : 데이터 조회");
				System.out.println("update : 데이터 수정");
				System.out.println("delete : 데이터 삭제");
				System.out.println("exit : 프로그램 종료");
				System.out.println("==========================");
			} else if(command.equals("add")) {
				System.out.println("저장할 값을 입력해주세요 : ");
				for (int i = 0; i < data.length; i++) {
					if (data[i] == null) {
						String newData = sc.next();
						data[i] = newData;
						System.out.println(newData + "이/가 저장되었습니다.");
					} else {
						break;
					}
				}
				//				저장 주소를 기억하는 방식으로 코딩
			} else if(command.equals("read")) {
				if(data.length == 0) {
					System.out.println("저장되어 있는 값이 없습니다.");					
				} else {
					System.out.println("현재 저장되어 있는 값 : " + Arrays.toString(data));					
				}
			} else if(command.equals("update")) {
				System.out.println("수정할 값을 입력해주세요 : ");
				data[0] = sc.next();
				System.out.println(data + "로 값이 수정되었습니다.");	
			} else if(command.equals("delete")) {
				System.out.println(data + "값이 삭제되었습니다.");
				data[0] = "";	
			} 
		}
	}
}
