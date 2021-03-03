package java2021;

import java.util.ArrayList;
import java.util.Scanner;

public class java20210303TestFunctionRefactored {

	//	�����뺯�� ����
	static ArrayList<String> titles = new ArrayList<String>();
	static ArrayList<String> bodies = new ArrayList<String>();
	static Scanner sc;

	//	============================================================
	//	help �޼��� ����
	public static void help() {
		System.out.println("========================");
		System.out.println("help : ����");
		System.out.println("add : ������ �߰�");
		System.out.println("list : ������ ��ȸ");
		System.out.println("search : ���� Ű���� �˻�");
		System.out.println("update : ������ ����");
		System.out.println("delete : ������ ����");
		System.out.println("exit : ���α׷� ����");
		System.out.println("========================");
	}

	//	============================================================
	//	add �޼��� ����
	public static void add() {
		System.out.println("������ �Է����ּ��� : ");
		String title = sc.next();
		System.out.println("������ �Է����ּ��� : ");
		String body = sc.next();

		titles.add(title);
		bodies.add(body);

		System.out.println("�Խù��� ��ϵǾ����ϴ�.");		
	}

	//	============================================================
	//	list �޼��� ����
	public static void list() {
		System.out.println("======================");
		for(int i = 0; i < titles.size(); i++) {
			System.out.println("��ȣ : " + (i + 1));
			System.out.println("���� : " + titles.get(i));
			//			System.out.println("���� : " + bodies.get(i));
			System.out.println("======================");
		}	
	}

	//	============================================================
	//	search �޼��� ����

	public static void search() {
		System.out.println("�˻� Ű���带 �Է����ּ��� : ");
		String keyWord = sc.next();
		System.out.println("======================");
		for(int i = 0; i < titles.size(); i++) {
			if (titles.get(i).contains(keyWord)) {
				System.out.println("��ȣ : " + (i + 1));
				System.out.println("���� : " + titles.get(i));
				System.out.println("======================");
			}
		}
	}

	//	============================================================
	//	update �޼��� ����
	public static void update() {
		System.out.println("��� �����͸� �����Ͻðڽ��ϱ�? :");
		int index = sc.nextInt();

		if(index < 0 || index >= titles.size()) {
			System.out.println("���� �Խù� ��ȣ�Դϴ�.!!");
		} else {
			// ���� �ڵ�
			System.out.println("������ : ");
			String newTitle = sc.next();
			System.out.println("������ : ");
			String newBody = sc.next();


			titles.set(index - 1, newTitle);
			bodies.set(index - 1, newBody);
		}		
	}

	//	============================================================
	//	delete �޼��� ����
	public static void delete() {
		System.out.println("��� �����͸� �����Ͻðڽ��ϱ�? :");
		int index = sc.nextInt();

		if(index < 0 || index >= titles.size()) {
			System.out.println("���� �Խù� ��ȣ�Դϴ�.!!");
		} else {
			// ���� �ڵ�
			titles.remove(index - 1);
			bodies.remove(index - 1);
		}
	}

	//	============================================================
	//	main �޼���
	public static void main(String[] args) {

		sc = new Scanner(System.in);

		while (true) {
			System.out.println("��ɾ �Է����ּ��� :");
			String command = sc.next();

			if (command.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else if (command.equals("help")) {

				help();

			} else if (command.equals("add")) {

				add();

			} else if (command.equals("list")) {

				list();

			} else if (command.equals("search")) {

				search();

			} else if (command.equals("update")) {

				update();

				list();

			} else if (command.equals("delete")) {

				delete();

				list();
			}
		}
	}
}
