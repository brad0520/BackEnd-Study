package java2021;

public class javaStudy20210302 {

	public static void main(String[] args) {

		hi1();
		hi2();
		hi3();
		hi4();
		hi();
		bye();
		print(4);
		prints(10);
		greeting(2,10);
		

	}

	public static void greeting(int a, int b) {
		String x = "";
		switch (a) {
		case 1: x = "안녕하세요";
		break;
		case 2: x = "하이~";
		break;
		case 3: x = "봉쥬";
		break;
		}
		for(int i=0; i<b; i++) {
			System.out.println(x);			
		}
	}
	public static void prints(int b) {
		for(int i=0; i<b; i++) {
			System.out.println("안녕하세요. 20살 홍길동입니다.!");			
		}
	}
	public static void print(int a) {
		System.out.println(a);
	}
	public static void hi1() {
		System.out.println("저는 차태진입니다.");
	}

	public static void hi2() {
		System.out.println("안녕하세요.");
	}

	public static void hi3() {
		System.out.println("프로그램을 만들어보아요.");
	}

	public static void hi4() {
		System.out.println("자바를 통해");
	}
	public static void hi() {
		System.out.println("안녕하세요. 저는 홍길동입니다. 잘부탁드립니다.");
	}
	public static void bye() {
		System.out.println("안녕히 가세요. 다음에 또 봐요!");
	}
}


