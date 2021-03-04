package bbs;

public class add_bbs {

	//	============================================================
	//	add 메서드 선언
	public static void add() {
		System.out.println("제목을 입력해주세요 : ");
		String title = repository.sc.next();
		System.out.println("내용을 입력해주세요 : ");
		String body = repository.sc.next();

		repository.numbers.add(repository.number);
		repository.titles.add(title);
		repository.bodies.add(body);
		repository.number++;
		
		System.out.println("게시물이 등록되었습니다.");		
	}
}
