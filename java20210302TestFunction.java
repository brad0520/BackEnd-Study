package java2021;

import java.util.ArrayList;
import java.util.Scanner;

public class java20210302TestFunction {
	//	공통사용변수는 static 으로 지정
	static ArrayList<String> titles = new ArrayList<String>(); // 제목 저장소
	static ArrayList<String> bodies = new ArrayList<String>(); // 내용 저장소
	//	public static 리턴타입 함수명() { 함수 내용 }
	public static void listItems() {
		System.out.println("======================");
		for(int i = 0; i < titles.size(); i++) {
			System.out.println("번호 : " + (i + 1));
			System.out.println("제목 : " + titles.get(i));
			//			System.out.println("내용 : " + bodies.get(i));
			System.out.println("======================");
		}	
	}
	
	//	핼프 메시지 출력
	public static void printHelp() {
		System.out.println("========================");
		System.out.println("help : 도움말");
		System.out.println("add : 데이터 추가");
		System.out.println("list : 데이터 조회");
		System.out.println("search : 제목 키워드 검색");
		System.out.println("update : 데이터 수정");
		System.out.println("delete : 데이터 삭제");
		System.out.println("exit : 프로그램 종료");
		System.out.println("========================");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 2개 이상의 저장소로 하나의 개념을 표현할 때 인덱스 관리가 필수

		while (true) {
			System.out.println("명령어를 입력해주세요 :");
			String command = sc.next();

			if (command.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (command.equals("help")) {
				printHelp();
			} else if (command.equals("add")) {

				System.out.println("제목을 입력해주세요 : ");
				String title = sc.next();
				System.out.println("내용을 입력해주세요 : ");
				String body = sc.next();

				titles.add(title);
				bodies.add(body);

				System.out.println("게시물이 등록되었습니다.");		

			} else if (command.equals("list")) {

				listItems();

			} else if (command.equals("search")) {
				System.out.println("검색 키워드를 입력해주세요 : ");
				String keyWord = sc.next();
				System.out.println("======================");
				for(int i = 0; i < titles.size(); i++) {
					if (titles.get(i).contains(keyWord)) {
						System.out.println("번호 : " + (i + 1));
						System.out.println("제목 : " + titles.get(i));
						System.out.println("======================");
					}
				}
//				새로운 배열을 만들어서 list 매서드를 재활용하는 코드로 수정


			} else if (command.equals("update")) {

				System.out.println("몇번 데이터를 수정하시겠습니까? :");
				int index = sc.nextInt();

				if(index < 0 || index >= titles.size()) {
					System.out.println("없는 게시물 번호입니다.!!");
				} else {
					// 수정 코드
					System.out.println("새제목 : ");
					String newTitle = sc.next();
					System.out.println("새내용 : ");
					String newBody = sc.next();


					titles.set(index - 1, newTitle);
					bodies.set(index - 1, newBody);
				}

				listItems();

			} else if (command.equals("delete")) {

				System.out.println("몇번 데이터를 삭제하시겠습니까? :");
				int index = sc.nextInt();

				if(index < 0 || index >= titles.size()) {
					System.out.println("없는 게시물 번호입니다.!!");
				} else {
					// 삭제 코드
					titles.remove(index - 1);
					bodies.remove(index - 1);
				}

				listItems();
			}

		}
	}

}
