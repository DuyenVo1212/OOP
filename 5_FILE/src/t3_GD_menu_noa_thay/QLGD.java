package t3_GD_menu_noa_thay;

import java.util.Scanner;

public class QLGD {
	public static void main(String[] args) {
		List lgd = new List();
		Scanner in = new Scanner(System.in);
		int x;
		do {
			System.out.println("\n\t\t----------------------------------");
			System.out.println("\t\t|0. Thoat ung dung\t\t\t\t |");
			System.out.println("\t\t|1. Them Giao Dich Vang\t\t\t\t |");
			System.out.println("\t\t|2. Them Giao Dich Tien Te\t\t\t |");
			System.out.println("\t\t|3. Hien Thi Danh Sach Giao Dich\t\t |");
			System.out.println("\t\t|4. Xem Tong So Luong cua cac Giao Dich\t\t |");
			System.out.println("\t\t|5. Xem Trung Binh Cua Giao Dich Tien Te\t |");
			System.out.println("\t\t|6. Hien Thi Danh Sach Giao Dich co Don Gia > 1 ngan|");
			System.out.println("\t\t--------------------------------------");
			x = in.nextInt();
			switch (x) {
			case 1:
				lgd.ThemGD(1);
				break;
			case 2:
				lgd.ThemGD(2);
				break;
			case 3:
				lgd.HienThiDS();
				break;
			case 4:
				lgd.TongSL();
				break;
			case 5:
				lgd.TrungBinhGDTT();
				break;
			case 6:
				lgd.GiaoDich1ty();
				break;
			}
		} while (x != 0);
		System.out.println("");
	}
}