package boardApp;

import java.util.ArrayList;
import java.util.Scanner;

class BoardApp {
	Scanner sc = new Scanner(System.in);
	ArrayList<Article> articles = new ArrayList<Article>();
	ArrayList<Reply> replies = new ArrayList<Reply>();
	ArrayList<Member> members = new ArrayList<Member>();

	int num = 4;
	int rNum = 1;
	int mNum = 1;
	int loginCheck = 0;
	Member loginedMember = new Member(0, null, null, null);

	public void start() {

		Article a1 = new Article(1, "안녕하세요", "안녕하세요", "2021.03.08", "익명", 30);
		Article a2 = new Article(2, "반갑습니다", "반갑습니다", "2021.03.08", "익명", 20);
		Article a3 = new Article(3, "안녕2", "안녕2", "2021.03.08", "익명", 10);

		articles.add(a1);
		articles.add(a2);
		articles.add(a3);

		while (true) {
			if (loginCheck != 0) {
				System.out.println("명령어를 입력해주세요[" + loginedMember.loginId + "(" + loginedMember.nickname +")] :");				
			} else {
				System.out.println("명령어를 입력해주세요 :");								
			}

			String command = sc.next();

			if (command.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;

			} else if (command.equals("help")) {
				printHelp();

			} else if (command.equals("add")) {
				addArticle(); // top 다운방식

			} else if (command.equals("list")) {
				printArticleList(articles);

			} else if (command.equals("update")) {
				updateArticle();

			} else if (command.equals("delete")) {
				deleteArticle();

			} else if (command.equals("search")) {
				searchArticle();

			} else if (command.equals("read")) {
				readArticle();

			} else if (command.equals("signup")) {
				addMember();

			} else if (command.equals("signin")) {
				loginMember();

			}  else if (command.equals("signout")) {
				logoutMember();
			}
		}
	}
	// =================================================================
	public void searchArticle() {
		// 제목으로 검색
		// 게시물 제목, 검색키워드
		// 게시물제목.contains(검색키워드)
		System.out.println("검색 항목을 선택해주세요 (1. 제목, 2. 내용, 3. 제목 + 내용, 4. 작성자) : ");
		int searchFlag = sc.nextInt();
		System.out.println("검색 키워드를 입력해주세요 : ");
		String keyword = sc.next();

		ArrayList<Article> searchedArticles = new ArrayList<Article>();

		String searchTarget = "";

		for(int i = 0; i < articles.size(); i++) {

			Article article = articles.get(i);

			if(searchFlag == 1) {
				searchTarget = article.title; // 게시물 제목
			} else if(searchFlag == 2) {
				searchTarget = article.body;
			} else if(searchFlag == 3) {
				searchTarget = article.title + article.body; 
			}

			if(searchTarget.contains(keyword)) {
				searchedArticles.add(article);
			}
		}

		printArticleList(searchedArticles);

	}
	//=================================================================
	public void addArticle() {

		// 번호 저장 -> 중복 되어서는 안되는 데이터

		System.out.println("제목을 입력해주세요 : ");
		String title = sc.next();
		System.out.println("내용을 입력해주세요 : ");
		String body = sc.next();
		String regDate = Util.getNowDate();

		// Article class를 통해 알려준 게시물 저장소 만들어줘
		Article a1 = new Article(num, title, body, regDate, "익명", 0);
		articles.add(a1);

		num++;

		System.out.println("게시물이 등록되었습니다.");
	}

	//=================================================================
	// 전체 게시물을 받아서 출력해주는 메서드
	public void printArticleList(ArrayList<Article> articles) {
		System.out.println("======================");

		for(int i = 0; i < articles.size(); i++) {

			Article a1 = articles.get(i);
			System.out.println("번호 : " + a1.num);
			System.out.println("제목 : " + a1.title);
			System.out.println("등록일 : " + a1.regDate);
			System.out.println("작성자 : " + a1.nickname);
			System.out.println("조회수 : " + a1.hit);
			System.out.println("======================");
		}
	}
	//=================================================================
	// 전체 게시물을 받아서 출력해주는 메서드
	public void printArticle(Article a1) {
		System.out.println("======" + a1.num + "번 게시물======");
		System.out.println("번호 : " + a1.num);
		System.out.println("제목 : " + a1.title);
		System.out.println("내용 : " + a1.body);
		System.out.println("등록일 : " + a1.regDate);
		System.out.println("조회수 : " + a1.hit);
		System.out.println("작성자 : " + a1.nickname);
		System.out.println("======================");
	}
	//=================================================================
	public void printHelp() {
		System.out.println("========================");
		System.out.println("help : 도움말");
		System.out.println("add : 데이터 추가");
		System.out.println("list : 데이터 조회");
		System.out.println("read : 게시물 상세 보기");
		System.out.println("update : 데이터 수정");
		System.out.println("delete : 데이터 삭제");
		System.out.println("exit : 프로그램 종료");
		System.out.println("signup : 회원가입");
		System.out.println("========================");
	}

	//=================================================================
	// 특정 게시물의 index를 찾아주는 메서드
	public int getIndexOfArticle(int targetNum) {

		int targetIndex = -1;

		for(int i = 0; i < articles.size(); i++) {
			Article article = articles.get(i);
			if(article.num == targetNum) {
				targetIndex = i;
			}
		}

		return targetIndex; 
	}

	//=================================================================

	public void updateArticle() {
		System.out.println("몇번 데이터를 수정하시겠습니까? :");
		int targetNum = sc.nextInt();

		// 호출한 쪽으로 넣어주는 방법 : 인수 - 매개변수

		int targetIndex = getIndexOfArticle(targetNum); // 메서드를 사용(호출) 

		if(targetIndex == -1) {
			System.out.println("없는 게시물 번호입니다.!!");

		} else {
			// 수정 코드
			System.out.println("새제목 : ");
			String newTitle = sc.next();
			System.out.println("새내용 : ");
			String newBody = sc.next();

			Article article = articles.get(targetIndex);
			article.title = newTitle;
			article.body = newBody;
		}

		printArticleList(articles);
	}

	//=================================================================

	public void readArticle() {
		System.out.println("상세보기할 게시물 번호를 입력해주세요 : ");
		int targetNum = sc.nextInt();

		// 호출한 쪽으로 넣어주는 방법 : 인수 - 매개변수

		int targetIndex = getIndexOfArticle(targetNum); // 메서드를 사용(호출) 

		if(targetIndex == -1) {
			System.out.println("없는 게시물 번호입니다.!!");

		} else {
			Article a1 = articles.get(targetIndex);
			printArticle(a1);
			readDetailArticle(a1);
			a1.hit++;
		}

	}

	//=================================================================

	public void readDetailArticle(Article a1) {
		while (true) {
			System.out.println("상세보기 기능을 선택해주세요(1. 댓글 등록, 2. 좋아요, 3. 수정, 4. 삭제, 5. 목록으로) : ");
			int command = sc.nextInt();

			if (command < 1 || command > 5) {
				System.out.println("올바른 명령을 입력해주세요.");

			} else if (command == 1) {
				replyArticle(a1);
				break;

			} else if (command == 2) {
				System.out.println("좋아요를 눌러주세요.");
				break;

			} else if (command == 3) {
				updateArticle();
				break;

			} else if (command == 4) {
				deleteArticle();
				break;

			} else if (command == 5) {
				printArticleList(articles);
				break;
			}
		}
	}

	//=================================================================
	public void replyArticle(Article a1) {
		if (loginCheck ==0) {
			System.out.println("로그인 후 작성해주세요.");
			loginMember();
		} else {
			System.out.println("댓글 내용을 입력해주세요 :");
			String newReply = sc.next();
			String regDate = Util.getNowDate();
			Reply reply = new Reply(rNum, a1.num, newReply, loginedMember.nickname, regDate);
			replies.add(reply);
			System.out.println("댓글이 등록되었습니다.");
			
			printArticle(a1);
			
			//		게시글별로 댓글이 관리가 되야하지 않을까? 
			//		그러면 게시글의 번호를 갖는 댓글만 먼저 정리하는 과정이 필요하지 않을지...
			System.out.println("=========댓글=========");
			for (int i=0; i<replies.size(); i++) {
				Reply r1 = replies.get(i);
				if(a1.num == r1.articleNum) {
					System.out.println("내용 : " + r1.reply);
					System.out.println("작성자 : " + r1.nickname);
					System.out.println("작성일 : " + r1.regDate);
				}
			}
			System.out.println("====================");
			
			rNum++;
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
				loginedMember = member;
				loginCheck++;
				return true;
			}
		}
		return false;
	}

	//=================================================================
	public void loginMember() {
		if (loginCheck != 0 ) {
			System.out.println("이미 로그인하셨습니다.");	
		} else {
			System.out.println("아이디를 입력해주세요 :");
			String id = sc.next();
			System.out.println("비밀번호를 입력해주세요 :");
			String pw = sc.next();

			if (doLogin(id, pw)) {
				System.out.println(loginedMember.nickname + "님 환영합니다!");
			} else {
				System.out.println("비밀번호를 틀렸거나 잘못된 회원정보입니다.");			
			}	
		}
	}

	//=================================================================
	public void logoutMember() {
		if (loginCheck == 0 ) {
			System.out.println("로그아웃 상태입니다.");	
		} else {
			loginedMember = new Member(0, null, null, null);
			loginCheck--;
			System.out.println("로그아웃되었습니다. ");
		}
	}

	//=================================================================
	public void deleteArticle() {

		System.out.println("몇번 데이터를 삭제하시겠습니까? :");
		int targetNum = sc.nextInt();
		int targetIndex = getIndexOfArticle(targetNum);

		if(targetIndex == -1) {
			System.out.println("없는 게시물 번호입니다.!!");
		} else {
			// 삭제 코드
			articles.remove(targetIndex);
		}

		printArticleList(articles);
	}
}
//=================================================================
