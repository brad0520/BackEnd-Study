package java2021;

import java.util.ArrayList;
import java.util.Scanner;

public class bbs {

	//	�����뺯�� ����
	static ArrayList<Integer> numbers= new ArrayList<Integer>();
	static ArrayList<String> titles = new ArrayList<String>();
	static ArrayList<String> bodies = new ArrayList<String>();
	static Scanner sc;
	static int number = 1;
	static int targetIndex = -1;

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

				help_bbs.help();

			} else if (command.equals("add")) {

				add_bbs.add();

			} else if (command.equals("list")) {

				list_bbs.list();

			} else if (command.equals("search")) {

				search_bbs.search();

			} else if (command.equals("update")) {

				update_bbs.update();

				list_bbs.list();

			} else if (command.equals("delete")) {

				delete_bbs.delete();

				list_bbs.list();
			}
		}
	}
}
