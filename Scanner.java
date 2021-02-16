package java2021;

import java.io.IOException;
import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) throws IOException {
//in : 입력, read : 콘솔의 내용을 읽음
//		int num = System.in.read();
//		System.out.println(num);
		
		Scanner sc = new Scanner(System.in); 
		String name = sc.nextLine();
		System.out.println(name); //한 줄 입력
		System.out.println(sc.next()); //한 단어 입력(공백이 나올때까기)
	}
}
