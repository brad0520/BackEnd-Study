package java2021;

public class getIndex_bbs {

	//	============================================================
	//	getIndex 메서드 선언
	public static void getIndex() {
		int index = bbs.sc.nextInt();
		targetIndex = -1;

		for(int i=0; i < bbs.numbers.size(); i++) {
			if (index == bbs.numbers.get(i)) {
				targetIndex = i;
			}
		}
	}
}
