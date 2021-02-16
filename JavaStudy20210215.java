package java2021;

	public class Main {
		
		public static void main(String[] args) {
	 
		System.out.println("연산자 테스트입니다.");
	    System.out.println();
	    // 128에 235를 더한 값을 출력해주세요.
		System.out.println(128+235);
	    // 512에서 227를 뺀 값을 출력해주세요.
		System.out.println(512-227);
	    // 1200을 15로 나눈 값을 출력해주세요.
		System.out.println(1200/15);
	    // 128를 32번 곱한 값을 출력해주세요.
		System.out.println(128*32);
	    // 10을 3으로 나눈 나머지를 출력해주세요.
		System.out.println(100%7);
		
	    System.out.println();
	    System.out.println("---------------------------------");

	    //1부터 i까지의 합구하기
		int sum = 0;
		int i;
		for (i = 1; i<=100; i++ ) {
			sum = sum + i;
		}
		System.out.println("1부터 " + i + "까지의 합입니다.");
	    System.out.println();
	    System.out.println(sum);
	    System.out.println();
	    System.out.println("---------------------------------");
		
		// 문제시작
		System.out.println("비교연산자 테스트입니다.");
		
	    System.out.println();
		int aa = 10;
		//aa와 10이 같다.
	    System.out.println(aa==10);
	    // aa와 10이 같지 않다.
	    System.out.println(aa!=10);
	    // aa가 10보다 크다.
	    System.out.println(aa>10);
	    // aa가 10보다 크거나 같다.
	    System.out.println(aa>=10);
	    System.out.println();
	    
	    int bb = 10;
	    // aa와 bb가 같다.
	    System.out.println(aa==bb);
	    // a와 b가 같지 않다.
	    System.out.println(aa!=bb);
	    boolean cc = false;
	    boolean dd = true;
	    System.out.println(cc==dd);
	    // cc와 dd가 같다.
	    System.out.println();
	    System.out.println("---------------------------------");
	    
//	    조건문 활용
		System.out.println("조건문 테스트입니다.");
	    System.out.println();
//	    1-비, 2-눈, 3-맑음
	    int weather=2;

	    if(weather==1) {
			System.out.println("비가 옵니다. 우산을 챙기세요");
		}
	    if(weather==2) {
			System.out.println("눈이 옵니다. 미끄러지지 않게 조심하세요");
	    }
	    if(weather==3) {
			System.out.println("날씨가 맑아서 산책하기 좋습니다.");
	    }
	    System.out.println();
	    
//	    조건문 활용
	    System.out.println("---------------------------------");

		System.out.println("두 수의 크기 비교");
	    System.out.println();
	    if ( true ) {
	       System.out.println("참");
	    }	   
	    if ( false ) {
	      System.out.println("거짓");
	    }
	    int a = 10;
	    // `==` => 같다.
	    if ( a == 10 ) {
	      System.out.println("참");
	    }
	    // `!=` => 같지 않다.
	    if ( a != 10 ) {
	      System.out.println("거짓");
	    }
	    if ( a > 10 ) {
	      System.out.println("거짓");
	    }
	    if ( a >= 10 ) {
	      System.out.println("참");
	    }
	    int b = 10;
	    if ( a == b ) {
	      System.out.println("참");
	    }
	    //boolean c => c 에는 오직 true/false 만 담을 수 있다.
	    boolean c = (a != b); 
	    if ( c ) {
	      System.out.println("거짓");
	    }
	    if ( c == false ) {
	      System.out.println("참");
	    }
	    // `!` => 반전
	    if ( !c ) {
	      System.out.println("참");
	    }	    
	    // `!` => 반전
	    if ( !(!c) ) {
	      System.out.println("거짓");
	    }	    
	    boolean d = true;	    
	    if ( c != d ) {
	      System.out.println("참");
	    }
	    
//	    방향 반별
	    System.out.println("---------------------------------");
		System.out.println("방향 판별");
	    System.out.println();
	    
	    int left = 30;
	    int right = 20;
	    
	    if (left>right) {
	    	System.out.println("left");
	    }
    	else if (left<right) {
    		System.out.println("right");
    	}
    	else {
    		System.out.println("equal");
    	}
	    System.out.println();
	    
//	    홀수 짝수 판별
	    System.out.println("---------------------------------");
		System.out.println("홀수 짝수 판별");
	    System.out.println();
	    
	    int num = 199;
	    
	    if (num%2==0) {
	    	System.out.println("even");
	    }
	    else {
	    	System.out.println("odd");
	    }
	    System.out.println();
	    
//	    큰 수에서 작은 수 빼기
	    System.out.println("---------------------------------");
		System.out.println("큰 수에서 작은 수 빼기");
	    System.out.println();
	    
	    int num1 = 10;
	    int num2 = 100;
	    
	    if (num1>num2) {
	    	System.out.println(num1-num2);
	    }
	    else {
	    	System.out.println(num2-num1);
	    }
	    System.out.println();
}
}
