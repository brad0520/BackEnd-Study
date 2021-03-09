package bbs3;

public class GetTargetIndex {

	//	============================================================
	//	targetIndex 선언
	public static int targetIndexOfArticle(int index) {
		int targetIndex = -1;

		for(int i=0; i < Articles.articles.size(); i++) {
			if (index == Articles.articles.get(i).number) {
				targetIndex = i;
			}
			
		}
		return targetIndex;
	}
}