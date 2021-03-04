package java2021;

public class update_bbs {

	//	============================================================
	//	update 메서드 선언
	public static void update() {
		System.out.println("몇번 데이터를 수정하시겠습니까? :");
		int index = bbs.sc.nextInt();
		int targetIndex = -1;

		for(int i=0; i < bbs.numbers.size(); i++) {
			if (index == bbs.numbers.get(i)) {
				targetIndex = i;
			}
		}
		
		if(targetIndex == -1) {
			System.out.println("없는 게시물 번호입니다.!!");
		} else {
			// 수정 코드
			System.out.println("새제목 : ");
			String newTitle = bbs.sc.next();
			System.out.println("새내용 : ");
			String newBody = bbs.sc.next();


			bbs.titles.set(targetIndex, newTitle);
			bbs.bodies.set(targetIndex, newBody);
		}		
	}
}
