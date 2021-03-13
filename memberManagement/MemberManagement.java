package memberManagement;

public class MemberManagement {
	Member[] members = new Member[100]; // 회원들 저장소
	int count = 0;

	void makeData() {

		insertMember("firstUser", "1234", "홍길동", 27);
		insertMember("secondUser", "5678", "임꺽정", 47);
		insertMember("thirdUser", "abcd", "이순신", 57);
		insertMember("fourthUser", "efgh", "홍길동", 28);
		insertMember("firstUser", "1234", "손흥민", 27);

	}
	// int count = 0;

	//	void makeData() {
	//		Member m1 = new Member();
	//
	//		m1.userId = "firstUser";
	//		m1.userPw = "1234";
	//		m1.userName = "홍길동";
	//		m1.age = 27;
	//
	//		insertMember(m1);
	//
	//		Member m2 = new Member();
	//
	//		m2.userId = "secondUser";
	//		m2.userPw = "5678";
	//		m2.userName = "임꺽정";
	//		m2.age = 45;
	//
	//		insertMember(m2);
	//
	//		Member m3 = new Member();
	//
	//		m3.userId = "thirdUser";
	//		m3.userPw = "2468";
	//		m3.userName = "황진이";
	//		m3.age = 25;
	//
	//		insertMember(m3);
	//
	//		Member m4 = new Member();
	//
	//		m4.userId = "fourthUser";
	//		m4.userPw = "1357";
	//		m4.userName = "전우치";
	//		m4.age = 29;
	//
	//		insertMember(m4);
	//
	//		Member m5 = new Member();
	//
	//		m5.userId = "fourthUser";
	//		m5.userPw = "2233";
	//		m5.userName = "정약용";
	//		m5.age = 40;
	//
	//		insertMember(m5);
	//
	//	}

	// 모든 고객 정보 출력
	void printMembers() {

		// null - 데이터 없음!, 비어있음!
		for (int i = 0; i < count; i++) {
			System.out.println(members[i].userId);
			System.out.println(members[i].userPw);
			System.out.println(members[i].userName);
			System.out.println(members[i].age);
		}

	}
	// 특정 아이디를 가진 고객 정보 출력
	void printMemberByUserId(String loginId) {

		int flag = 0;

		for (int i = 0; i < count; i++) {
			if (members[i].userId == loginId) {
				flag = 1;
				System.out.println("아이디 : " + members[i].userId);
				System.out.println("이름 : " + members[i].userName);
				System.out.println("나이 : " + members[i].age);
				break;
			}
		}

		if (flag == 0) {
			System.out.println("없는 아이디입니다.");
		}

	}

	// 아이디, 이름, 나이 정보로 해당 고객의 비밀번호 찾기
	void findMemberPassword(String loginId, String name, int age) {
		int flag = 0;

		for (int i = 0; i < count; i++) {
			if (members[i].userId == loginId && members[i].userName == name && members[i].age == age) {
				flag = 1;
				System.out.println("당신의 비밀번호는 " + members[i].userPw + "입니다.");
			}
		}

		if (flag == 0) {
			System.out.println("없는 아이디이거나 잘못된 회원정보입니다.");
		}
	}

	// 아이디와 비밀번호를 입력받아 로그인 처리하기
	void loginCheck(String loginId, String loginPw) {
		int flag = 0;

		for (int i = 0; i < count; i++) {
			if (members[i].userId == loginId) {
				flag = 1;
				if(members[i].userPw == loginPw) {
					flag = 2;
					System.out.println(members[i].userName + "님 환영합니다!");
				}
			}
		}

		if (flag == 0) {
			System.out.println("없는 아이디입니다.");
		} else if(flag == 1) {
			System.out.println("비밀번호를 틀렸습니다.");
		}
	}

	public void insertMember(String id, String pw, String name, int age) {

		int flag = 0;

		for (int i = 0; i < count; i++) {
			if (members[i].userId == id) {
				flag = 1;
			}
		}


		if(flag == 0) {
			Member m = new Member();
			m.userId = id;
			m.userPw = pw;
			m.userName = name;
			m.age = age;

			members[count] = m;
			count++;			
		} else {
			System.out.println("이미 존재하는 아이디입니다.");
		}
	}
}
