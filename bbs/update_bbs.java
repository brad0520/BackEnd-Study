package bbs;

public class update_bbs {

	//	============================================================
	//	update 메서드 선언
	public static void update() {
		System.out.println("몇번 데이터를 수정하시겠습니까? :");
		int index = repository.sc.nextInt();
		
		int targetIndex = targetIndex_bbs.targetIndex(index);
		
		if(targetIndex == -1) {
			System.out.println("없는 게시물 번호입니다.!!");
		} else {
			// 수정 코드
			System.out.println("새제목 : ");
			String newTitle = repository.sc.next();
			System.out.println("새내용 : ");
			String newBody = repository.sc.next();


			repository.titles.set(targetIndex, newTitle);
			repository.bodies.set(targetIndex, newBody);
		}		
	}
}
