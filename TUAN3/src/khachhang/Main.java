package khachhang;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List lkh = new List();
		Scanner in = new Scanner(System.in);
		int x;
		do {
			System.out.println("\n\t\t------------------------------------");
			System.out.println("\t\t|0. Thoat ung dung\t\t\t\t |");
			System.out.println("\t\t|1. Them Khach Hang Viet\t\t\t |");
			System.out.println("\t\t|2. Them Khach Hang Nuoc Ngoai\t\t\t |");
			System.out.println("\t\t|3. Hien Thi Danh Sach Khach Hang\t\t |");
			System.out.println("\t\t|4. Xem Tong (KW)cua cac KH\t\t |");
			System.out.println("\t\t|5. Xem TB Thanh Tien cua KH NN\t |");
			System.out.println("\t\t|6. Xuat sach trong thang 9 nam 2013");
			System.out.println("\t\t--------------------------------------");
			x = in.nextInt();
			System.out.println("======>>");
			switch (x) {
			case 1:
				lkh.ThemKH(1);
				break;
			case 2:
				lkh.ThemKH(2);
				break;
			case 3:
				lkh.tuade();
				lkh.HienThiKH();
				break;
			case 4:
				lkh.TongSL();
				break;
			case 5:
				lkh.TrungBinh();
				break;
			case 6:
				lkh.XuatThang9();
				break;
				
			}
		} while (x != 0);
		System.out.println("");
	}
}