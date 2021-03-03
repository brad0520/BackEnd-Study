package java2021;

import java.util.ArrayList;
import java.util.Scanner;

public class java20210303addCondition {

	//	공통사용변수 선언
	static ArrayList<String> titles = new ArrayList<String>();
	static ArrayList<String> bodies = new ArrayList<String>();
	static Scanner sc;

	//	============================================================
	//	help 메서드 선언
	public static void help() {
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

	//	============================================================
	//	add 메서드 선언
	public static void add() {
		System.out.println("제목을 입력해주세요 : ");
		String title = sc.next();
		System.out.println("내용을 입력해주세요 : ");
		String body = sc.next();

		titles.add(title);
		bodies.add(body);

		System.out.println("게시물이 등록되었습니다.");		
	}

	//	============================================================
	//	list 메서드 선언
	public static void list() {
		System.out.println("======================");
		for(int i = 0; i < titles.size(); i++) {
			System.out.println("번호 : " + (i + 1));
			System.out.println("제목 : " + titles.get(i));
			//			System.out.println("내용 : " + bodies.get(i));
			System.out.println("======================");
		}	
	}

	//	============================================================
	//	search 메서드 선언

	public static void search() {

		System.out.println("검색 항목을 선택해주세요 (1. 제목, 2. 내용, 3. 제목 + 내용) : ");
		
		int command = Integer.parseInt(sc.next());
		String keyword = "";
		
		switch(command) {
		case 1: 		
			System.out.println("검색 제목을 입력해주세요 : ");
			keyword = sc.next();
			System.out.println("======================");
			for(int i = 0; i < titles.size(); i++) {
				if (titles.get(i).contains(keyword)) {
					System.out.println("번호 : " + (i + 1));
					System.out.println("제목 : " + titles.get(i));
					System.out.println("======================");
				}
			}
			break;
			
		case 2:
			System.out.println("검색 내용을 입력해주세요 : ");
			keyword = sc.next();
			System.out.println("======================");
			for(int i = 0; i < titles.size(); i++) {
				if (bodies.get(i).contains(keyword)) {
					System.out.println("번호 : " + (i + 1));
					System.out.println("제목 : " + titles.get(i));
					System.out.println("======================");
				}
			}
			break;
			
		case 3:
			System.out.println("키워드를 입력해주세요 : ");
			keyword = sc.next();
			System.out.println("======================");
			for(int i = 0; i < bodies.size(); i++) {
				if (titles.get(i).contains(keyword)||bodies.get(i).contains(keyword)) {
					System.out.println("번호 : " + (i + 1));
					System.out.println("제목 : " + titles.get(i));
					System.out.println("======================");
				}
			}
			break;
	
		}
	}

	//	============================================================
	//	update 메서드 선언
	public static void update() {
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
	}

	//	============================================================
	//	delete 메서드 선언
	public static void delete() {
		System.out.println("몇번 데이터를 삭제하시겠습니까? :");
		int index = sc.nextInt();

		if(index < 0 || index >= titles.size()) {
			System.out.println("없는 게시물 번호입니다.!!");
		} else {
			// 삭제 코드
			titles.remove(index - 1);
			bodies.remove(index - 1);
		}
	}

	//	============================================================
	//	main 메서드
	public static void main(String[] args) {

		sc = new Scanner(System.in);

		while (true) {
			System.out.println("명령어를 입력해주세요 :");
			String command = sc.next();

			if (command.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (command.equals("help")) {

				help();

			} else if (command.equals("add")) {

				add();

			} else if (command.equals("list")) {

				list();

			} else if (command.equals("search")) {

				search();

			} else if (command.equals("update")) {

				update();

				list();

			} else if (command.equals("delete")) {

				delete();

				list();
			}
		}
	}
}
