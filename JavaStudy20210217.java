package java2021;

public class java20210217 {

	public static void main(String[] args) {
		
		// 운세 프로그램을 작성해주세요.
		// 세 정수, 순서대로 년도, 월, 일이 있습니다.
		//  (년 - 월 + 일)에 마지막 숫자가 0이면 "대박"을 출력, 그렇지 않으면 "그럭저럭"을 출력해주세요.

		System.out.println();
		System.out.println("------------------------");
		System.out.println("운세 프로그램");
		System.out.println();
		
		//운세 프로그램
	    int year = 2020;
	    int month = 10;
	    int day = 16;
	    
	    int num = year - month + day;
	    int fortune = num % 10;
	    System.out.println(fortune);
	    
	    if (fortune == 0) {
	    	System.out.println("대박");
	    } else {
	    	System.out.println("그럭저럭");
	    }
		
	    System.out.println();
	    System.out.println("------------------------");
	    System.out.println("두 번째로 작은 정수 구하기");
	    System.out.println();
	    
	    //두 번째로 작은 정수 구하기
	    int a = 19;
	    int b = 12;
	    int c = 24;
	    
	    if ((b>=a && a>=c) || (b<=a && a<=c)) {
		    System.out.println("두 번째로 작은 정수는 " + a +"입니다.");
	    } else if ((a>=b && b>=c) || (a<=b && b<=c)) {
		    System.out.println("두 번째로 작은 정수는 " + b +"입니다.");
	    } else {
	    	System.out.println("두 번째로 작은 정수는 " + c +"입니다.");
	    	
	    }
	}

}
