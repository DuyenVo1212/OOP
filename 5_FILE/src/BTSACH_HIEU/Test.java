package BTSACH_HIEU;

import java.util.Scanner;



public class Test {
	static ListGiaoDich listGiaoDich = new ListGiaoDich();
	
	
	public static void menu(Scanner scanner) {
		int chon1, chon2;
		do {
			System.out.println("1. Nhap giao dich");
			System.out.println("2. Xuat giao dich");
			System.out.println("3. Tong so luong tung loai");
			System.out.println("4. Trung binh thanh tien cua giao dich dat");
			System.out.println("5. Xuat giao dich trong 9/2013");
			System.out.println("7. Sap xep theo ma");
			System.out.println("6. Thoat");
			System.out.println("Moi ban chon: ");
			chon1 = scanner.nextInt();
			
			switch (chon1) {
			case 1:
				System.out.println("1. Nhap giao dich dat");
				System.out.println("2. Nhap giao dich nha");
				System.out.println("Moi ban chon: ");
				chon2 = scanner.nextInt();
				listGiaoDich.nhapList(chon2, scanner);
				break;
			case 2:
				listGiaoDich.xuatList();
				break;
			case 3:
				System.out.println("So luong giao dich dat: "+listGiaoDich.getSoLuongDat());
				System.out.println("So luong giao dich nha: "+listGiaoDich.getSoLuongNha());
				break;
			case 4:
				System.out.println("Trung binh thanh tien cho giao dich dat: "+listGiaoDich.thanhTienGiaoDichDat());
				break;
			case 5:
				listGiaoDich.xuatGiaDichNgay();
				break;
			case 6:
				System.out.println("Good bye");
				System.exit(0);
				break;
			case 7:
				listGiaoDich.sepXepTheoMa();
				listGiaoDich.xuatList();
				break;
			default:
				System.out.println("Ban da nhap lua chon sai");
				break;
			}
		} while (chon1 != 6);
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		menu(scanner);
	}
}
