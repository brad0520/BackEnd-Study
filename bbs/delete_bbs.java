package java2021;

public class delete_bbs {

	//	============================================================
	//	delete 메서드 선언
	public static void delete() {
		System.out.println("몇번 데이터를 삭제하시겠습니까? :");
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
			// 삭제 코드
			bbs.numbers.remove(targetIndex);
			bbs.titles.remove(targetIndex);
			bbs.bodies.remove(targetIndex);
		}
	}
}
