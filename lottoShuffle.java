package javaStudy;

public class lottoShuffle {

	public static void main(String[] args) {
//		1부터 45까지 배열 만들기
		int[] ball = new int[45];
		
		for (int i=0; i<45; i++) {
			ball[i] = i+1;
		}

//		앞의 6개의 숫자를 랜덤하게 섞기
		for (int i=0; i < 6; i++) {
			int n = (int) (Math.random()*45);
			int temp = ball[i];
			ball[i] = ball[n];
			ball[n] = temp;
		}
		
//		로또 당첨 번호 출력
		System.out.println("로또 당첨 번호입니다.");
		System.out.println("===============\n");
		for (int i=0; i < 6; i++) {
			System.out.println(i + " 번: " + ball[i]);
		}
		System.out.println("\n===============\n");

	}

}
