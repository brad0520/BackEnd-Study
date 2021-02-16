package java2021;

public class javaStudy0216 {

	public static void main(String[] args) {
		// 문제 : 할인 대상인지 아닌지 출력해주세요.
		// 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
		// 조건 : 출력예시 처럼 출력되어야 합니다.
		// 조건 : `구현시작` 부분만 수정 할 수 있습니다..
		// 조건 : 2가지 이상의 방법으로 풀어야 합니다.
		
	    int age = 27; // 이 값을 바꿔가면서 실행해보세요.
	    System.out.println("당신의 나이는 " + age + "살 입니다.");
	    if(age<20) {
	    	System.out.println("할인대상입니다.");
	    }
	    else if(age<60) {
	    	System.out.println("할인대상이 아닙니다.");
	    }
	    else {
	    	System.out.println("할인대상입니다.");
	    }

	    System.out.println();
	    System.out.println("----------------------------");
	    System.out.println();
	    
	    
	    if (age>19 && age<60) {
	    	
	    }
	    /*
	    어떤 차의 높이가 170cm 입니다..

	    이 차는 3개의 터널을 차례대로 지나게 될 것입니다.

	    터널의 높이가 차의 높이보다 같거나 낮다면 차는 터널과 충돌하여 사고가 납니다.

	    터널의 높이가 차 터널을 무사히 잘 통과하면 PASS 를 출력하고, 사고례대로 3개 주어지고가 난다면 CRASH 를 출력하세요.
	    */
	    int tunnel1 = 180;
	    int tunnel2 = 182;
	    int tunnel3 = 172;
	    
	    int carHeight = 181;
//	    터널1 통과 체크
	    if (carHeight<tunnel1) {
	    	System.out.println("PASS1");
	    }
	    else {
	    	System.out.println("CRASH1");  	
	    }
//	    터널2 통과 체크
	    if (carHeight<tunnel2) {
	    	System.out.println("PASS2");
	    }
	    else {
	    	System.out.println("CRASH2");  	
	    }
//	    터널3 통과 체크
	    if (carHeight<tunnel3) {
	    	System.out.println("PASS3");
	    }
	    else {
	    	System.out.println("CRASH3");  	
	    }
	    
	    System.out.println();
//	    터널 통과 체크 : 조건 중첩
	    if (carHeight<tunnel1 && carHeight<tunnel2 && carHeight<tunnel3) {
	    	System.out.println("PASS");
	    }
	    else {
	    	System.out.println("CRASH"); 
	    }
	    
	    
	    System.out.println();
	    System.out.println("----------------------------");
	    System.out.println();
	}

}
