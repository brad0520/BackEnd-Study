package bbs;

public class targetIndex_bbs {

	//	============================================================
	//	targetIndex �޼��� ����
	public static int targetIndex(int index) {
		int targetIndex = -1;

		for(int i=0; i < repository.numbers.size(); i++) {
			if (index == repository.numbers.get(i)) {
				targetIndex = i;
			}
			
		}
		return targetIndex;
	}
}
