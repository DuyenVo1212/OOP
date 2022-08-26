package BTNHANVIEN_TL;

import java.util.Scanner;

public class Menu {
	static List list = new List();

	public static void menu(Scanner scanner) {
		int chon1, chon2;
		do {
			System.out.println("0. Thoat");
			System.out.println("Moi ban chon: ");
			chon1 = scanner.nextInt();

			switch (chon1) {
			case 1://NHAP
				System.out.println("\t1. Nhap ad");
				System.out.println("\t2. Nhap pr");
				System.out.println("\t2. Nhap le");
				System.out.println("Moi ban chon: ");
				chon2 = scanner.nextInt();
				list.nhapList(chon2, scanner);
				
				break;
				
			case 2://XUAT ALL GD
				list.xuatList();
				break;
			
			case 0:
				System.out.println("Good bye");
				System.exit(0);

			default:
				System.out.println("Ban da nhap lua chon sai");
				break;
			}
		} while (chon1 != 0);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		menu(scanner);
	}

		}

