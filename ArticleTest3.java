
class ArticleTest3 {
	public static void main(String[] args) {
		사람인력관리소 a사람인력관리소 = new 사람인력관리소();
		
		a사람인력관리소.add사람("홍길순", 33);
		// 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
		a사람인력관리소.add사람("홍길동", 20);
		// 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
		a사람인력관리소.add사람("임꺽정", 30);
		// 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.
		
		사람 a사람1 = a사람인력관리소.get사람(1);
		a사람1.자기소개();
		// 저는 1번, 홍길순, 33살 입니다.
		
		사람 a사람2 = a사람인력관리소.get사람(2);
		a사람2.자기소개();
		// 저는 2번, 홍길동, 20살 입니다.
		
		사람 a사람3 = a사람인력관리소.get사람(3);
		a사람3.자기소개();
		// 저는 3번, 임꺽정, 30살 입니다.
	}
}

class 사람인력관리소 {
	
	사람[]사람들;
	
	int 마지막_사람_번호;
	
	사람인력관리소() {
		마지막_사람_번호 = 0;
		사람들 = new 사람[100];
	}
	
	public void add사람(String 이름, int 나이) {
		int 번호 = 마지막_사람_번호 + 1;
		사람 a사람 = new 사람(번호, 나이, 이름);
		System.out.printf("나이가 %d인 %d번째 사람(%s)이 추가되었습니다.\n", 나이, 번호, 이름);		
		
		사람들[번호-1] = a사람;
			
		마지막_사람_번호++;
	}

	public 사람 get사람 (int 번호) {
		for(사람 a : 사람들) {
			if (a.번호 == 번호) {
				return a;
			}
		}
		return null;
	}
	
}

class 사람 {
	public int 번호;
	public int 나이;
	public String 이름;
	
	public 사람(int 번호, int 나이, String 이름) {
		super();
		this.번호 = 번호;
		this.나이 = 나이;
		this.이름 = 이름;
	}

	public void 자기소개() {
		System.out.println("저는 " + this.번호 + "번, " + this.이름 + ", " + this.나이 + "살 입니다.");
	}

}
