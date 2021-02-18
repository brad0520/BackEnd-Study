package java2021;

public class java2021021802 {

	public static void main(String[] args) {
		
		// 1부터 100까지 합
		System.out.println();
		System.out.println("------------------------");
		System.out.println("1부터 100까지 합");
		System.out.println(); 
		
		for (int i=1; i<=100; i++) {
			System.out.println(i);
		}
		
		// 1부터 100까지 짝수의 합
		System.out.println();
		System.out.println("------------------------");
		System.out.println("1부터 100까지 짝수의 합");
		System.out.println(); 
		
		for (int i=2; i<=100; i+=2) {
			System.out.println(i);
		}
		
		// 손흥민선수 득점
		System.out.println();
		System.out.println("------------------------");
		System.out.println("손흥민선수 득점");
		System.out.println(); 
		
	    int time;
	    int score = 0;
		for (time=48; time<90; time+=5) {
			score+=1;
		}
		System.out.println(score);
		
		// a b 두 수가 주어지면 a와 b사이의 수를 오름차순 출력해주세요.
		// 오름차순은 작은 수 부터 큰수로 정렬되는 것을 말합니다. 
		// ex )
		// 오름차순 :  1, 2, 3, 4, 5
		// 내림차순 :  5, 4, 3, 2, 1
		
		// 오름차순 정렬
		System.out.println();
		System.out.println("------------------------");
		System.out.println("오름차순 정렬");
		System.out.println(); 
		
		int a=3;
		int b=6;
		if (a > b) {
			int temp = a;
			a = b;
			b = temp; 
		}
		for(int c = a; c<=b ; c++) {
			System.out.println(c);
		}
	}

}
