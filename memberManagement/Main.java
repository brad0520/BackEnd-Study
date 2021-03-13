package memberManagement;

public class Main {

	public static void main(String[] args) {
		
		// 회원 관리 프로그램
		MemberManagement mm = new MemberManagement();

		// 테스트 데이터 만들기
		mm.makeData();

		// 모든 고객 조회
		mm.printMembers();

		// 아이디로 특정 회원 찾기
		mm.printMemberByUserId("aaaa");

		// 회원 정보로 비밀번호 찾기
		mm.findMemberPassword("secondUser", "임꺽정", 47);
		// 비밀번호는 5678입니다.

		mm.findMemberPassword("firstUser", "홍길동", 27);
		// 회원의 정보가 일치하지 않습니다.

		// 로그인 기능 - 아이디와 비밀번호를 받아 로그인 체크
		mm.loginCheck("thirdUser", "abcd");
		// 황진이님 로그인. 환영합니다.

		mm.loginCheck("thirdUser", "2234");
		// 비밀번호를 틀렸습니다.

		mm.loginCheck("noneUser", "2468");
		// 없는 아이디입니다.

		mm.printMembers();
		System.out.println("===================================================");
		// 회원 가입
		mm.insertMember("firstUser", "a1234", "차태진", 35);

		// 모든 고객 조회
		mm.printMembers();

		// 중북 체크
		mm.insertMember("newUser", "a1234", "차태진", 35);
		System.out.println("====================================================");
		// 모든 고객 조회
		mm.printMembers();

	}

}
