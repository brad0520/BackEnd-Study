package bbs2;

public class targetIndex_bbs {

	//	============================================================
	//	targetIndex 메서드 선언
	public static int targetIndex(int index) {
		int targetIndex = -1;

		for(int i=0; i < Articles.articles.size(); i++) {
			if (index == Articles.articles.get(i).number) {
				targetIndex = i;
			}
			
		}
		return targetIndex;
	}
}
