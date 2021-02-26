package java2021;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCRUD {

	public static void main(String[] args) {
		//2개 이상의 저장소를 
		Scanner sc = new java.util.Scanner(System.in);
		ArrayList<Integer> numbers= new ArrayList<Integer>();
		ArrayList<String> titles = new ArrayList<String>();
		ArrayList<String> contents = new ArrayList<String>();
		int number = 0;
		int inputedNumber = 0; 

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
				System.out.println("list : 데이터 조회");
				System.out.println("update : 데이터 수정");
				System.out.println("delete : 데이터 삭제");
				System.out.println("exit : 프로그램 종료");
				System.out.println("==========================");
			} 
			else if(command.equals("add")) { 
				System.out.println("제목을 입력해주세요 : ");
				String title = sc.next();
				titles.add(title);
				System.out.println("내용을 입력해주세요 : ");
				String content = sc.next();
				contents.add(content);
				System.out.println("게시물이 등록되었습니다.");
				number++;
				numbers.add(number);
			} 
			else if(command.equals("list")) {
				for (int i=0; i<titles.size(); i++) {
					System.out.println("==========================");
					System.out.println("번호 : " + (numbers.get(i)));
					System.out.println("제목 : " + titles.get(i));
					System.out.println("내용 : " + contents.get(i));
				}
				System.out.println("==========================");
			} 
			else if(command.equals("update")) {
				System.out.println("수정할 게시물 번호 : ");
				inputedNumber = Integer.parseInt(sc.next());
				if (inputedNumber > numbers.size() || inputedNumber < 1) {
					System.out.println("없는 게시물입니다.");
				} else {
					System.out.println("수정할 제목을 입력해주세요 : ");
					String inputedTitle = sc.next();
					System.out.println("수정할 내용을 입력해주세요 : ");
					String inputedContent = sc.next();
					System.out.println("수정이 완료되었습니다.");	
					titles.set(inputedNumber-1, inputedTitle);
					contents.set(inputedNumber-1, inputedContent);
					System.out.println("==========================");
					System.out.println("번호 : " + inputedNumber);
					System.out.println("제목 : " + titles.get(inputedNumber-1));
					System.out.println("==========================");
				}

			} 
			else if(command.equals("delete")) {
				System.out.println("삭제할 게시물 번호 : ");
				inputedNumber = Integer.parseInt(sc.next());
				if (inputedNumber > numbers.size() || inputedNumber < 1) {
					System.out.println("없는 게시물입니다.");
				} else {
					System.out.println("삭제가 완료되었습니다.");	
					numbers.remove(inputedNumber-1);
					titles.remove(inputedNumber-1);
					contents.remove(inputedNumber-1);
					for (int i=0; i<titles.size(); i++) {
						System.out.println("==========================");
						System.out.println("번호 : " + (numbers.get(i)));
						System.out.println("제목 : " + titles.get(i));
						System.out.println("내용 : " + contents.get(i));
					}
					System.out.println("==========================");
				}

			}

		}
	}
}
