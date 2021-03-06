package boardApp;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberController {

	Scanner sc = new Scanner(System.in);

	ArrayList<Member> members = new ArrayList<Member>();
	int mNum = 1;

	//=================================================================
	public void doCommand(String command) {

		if (command.equals("signup")) {
			addMember();

		} else if (command.equals("signin")) {
			loginMember();

		}  else if (command.equals("signout")) {
			logoutMember();
		}
	}

	//=================================================================
	public boolean isLogin() {
		if (BoardApp.loginedMember == null ) {
			System.out.println("로그아웃 상태입니다.");
			return false;
		} else {
			return true;
		}

	}
	//=================================================================
	public void addMember() {
		System.out.println("==== 회원 가입을 진행합니다. ====");
		System.out.print("아이디를 입력해주세요 : ");
		String id = sc.next();
		System.out.print("비밀번호를 입력해주세요 : ");
		String pw = sc.next();
		System.out.print("닉네임을 입력해주세요 : ");
		String nick = sc.next();
		Member m1 = new Member(mNum, id, pw, nick);
		members.add(m1);
		mNum++;
		System.out.println("=== 회원 가입이 완료되었습니다. ===");			

	}

	//	public void addMember() {
	//		String inputedId = "";
	//		if (loginCheck != 0) {
	//			System.out.println("로그아웃 이후 회원 가입이 가능합니다.");
	//		} else {
	//			System.out.println("==== 회원 가입을 진행합니다. ====");
	//			while(true) {
	//				System.out.print("아이디를 입력해주세요 : ");
	//				inputedId = sc.next();
	//				for( int i=0; i<members.size(); i++) {
	//					if ( inputedId.equals(members.get(i).loginId) ) {
	//						System.out.print("중복된 아이디입니다.");
	//					} else {
	//						System.out.print("비밀번호를 입력해주세요 : ");
	//						String pw = sc.next();
	//						System.out.print("닉네임을 입력해주세요 : ");
	//						String nick = sc.next();
	//						Member m1 = new Member(mNum, inputedId, pw, nick);
	//						members.add(m1);
	//						mNum++;
	//						System.out.println("=== 회원 가입이 완료되었습니다. ===");			
	//						break;
	//					}
	//				}
	//			}
	//		}
	//	}

	//=================================================================
	public boolean doLogin(String inputId, String inputPw) {
		for( int i=0; i<members.size(); i++) {
			Member member = members.get(i);
			if (member.loginId.equals(inputId) && member.loginPw.equals(inputPw)) {
				BoardApp.loginedMember = member;
				return true;
			}
		}
		return false;			
	}
	//=================================================================
	public void loginMember() {
		if (BoardApp.loginedMember != null ) {
			System.out.println("이미 로그인하셨습니다.");	
		} else {
			System.out.println("아이디를 입력해주세요 :");
			String id = sc.next();
			System.out.println("비밀번호를 입력해주세요 :");
			String pw = sc.next();

			if (doLogin(id, pw)) {
				System.out.println(BoardApp.loginedMember.nickname + "님 환영합니다!");
			} else {
				System.out.println("비밀번호를 틀렸거나 잘못된 회원정보입니다.");			
			}	
		}
	}

	//=================================================================
	public void logoutMember() {
		if (BoardApp.loginedMember == null ) {
			System.out.println("로그아웃 상태입니다.");	
		} else {
			BoardApp.loginedMember = null;
			System.out.println("로그아웃되었습니다. ");
		}
	}

}
