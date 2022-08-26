package t3_GD_menu;

import java.time.LocalDate;
import java.util.Scanner;

public class TestGD {

	public static void main(String[] args) {
		AListGD lgd = new AListGD();
		Scanner sc = new Scanner(System.in);
		lgd.ThemGD(new GDVang("V3", LocalDate.of(2020, 10, 6), 500000000, 3, "Trang"));
		lgd.ThemGD(new GDTien("T1", LocalDate.of(2020, 10, 6), 500000000, 3, 3.5, "VN"));
		lgd.ThemGD(new GDVang("V1", LocalDate.of(2020, 7, 8), 1200000000, 5, "9999"));
		lgd.ThemGD(new GDVang("V2", LocalDate.of(2020, 9, 7), 700000000, 5, "80%"));
		lgd.ThemGD(new GDVang("V3", LocalDate.of(2020, 10, 6), 500000000, 3, "Trang"));
		lgd.ThemGD(new GDTien("T1", LocalDate.of(2020, 10, 6), 500000000, 3, 3.5, "VN"));
		lgd.ThemGD(new GDTien("T2", LocalDate.of(2020, 5, 1), 1500000000, 5, 20, "Euro"));
		lgd.ThemGD(new GDTien("T3", LocalDate.of(2020, 7, 3), 2000000000, 7, 23, "USD"));
		
//		lgd.XuatGD();
//		lgd.TBThanhTien();
//		System.out.println("So luong gd tien "+lgd.SLTien());
//		System.out.println("So luong gd vang "+lgd.SLVang());
//		System.out.println("Tong gd "+(lgd.SLTien()+lgd.SLVang()));
//		System.out.println("Don gia lon hon 1 ngan la: ");
//		lgd.DonGia1Ti();

		int x;
		System.out.println("\n\t\t----------------------------------");
		System.out.println("\t\t|0. Thoat ung dung\t\t\t\t |");
		System.out.println("\t\t|1. Them Giao Dich Vang\t\t\t\t |");
		System.out.println("\t\t|2. Them Giao Dich Tien Te\t\t\t |");
		System.out.println("\t\t|3. Hien Thi Danh Sach Giao Dich\t\t |");
		System.out.println("\t\t|4. Hien Thi Giao Dich vang\t\t |");
		System.out.println("\t\t|5. Hien Thi Giao Dich tien\t\t |");
		System.out.println("\t\t|6. Xem Tong So Luong cua cac Giao Dich\t\t |");
		System.out.println("\t\t|7. Xem Trung Binh Cua Giao Dich Tien Te\t |");
		System.out.println("\t\t|8. Hien Thi Danh Sach Giao Dich co Don Gia > 1 ngan|");
		System.out.println("\t\t|9. Xem tong thanh tien cua tung loai\t |");
		System.out.println("\t\t|10. Hien Thi Danh Sach Giao Dich thang 9");
		System.out.println("\t\t--------------------------------------");
		do {
			System.out.println("Lựa chọn của bạn: ");
			x = sc.nextInt();
			System.out.println("------------------------");
			switch (x) {
			case 1: {
				lgd.ThemGD(nhaptien());
				break;
			}
			case 2: {
				lgd.ThemGD(nhapvang());
				break;
			}
			case 3: {
				// ls.tuade();
				lgd.XuatGD();
				break;
			}
			case 4: {
				lgd.xuatGDVang();
				break;
			}
			case 5: {
				lgd.xuatGDTien();
				break;
			}

			case 6: {
				lgd.SLVang();
				lgd.SLTien();
				break;
			}
			case 7: {
				lgd.TBThanhTien();
				break;
			}

			case 8: {
				System.out.println("Don gia lon hon 1 ngan la: ");
				lgd.DonGia1Ti();
				break;
			}
			case 9: {
				lgd.TinhTongTungLoai();
				break;
			}
			case 10: {
				lgd.GDThang9();
				break;
			}
			}

		} while (x != 0);

	}

	public static GDTien nhaptien() {
		int soLuong = 0;
		double donGia = 0;
		double tiGia = 0;
		int ngay, thang, nam;
		boolean check = false;
		String maGD, loaiTien;
		maGD = loaiTien = null;
		Scanner sc = new Scanner(System.in);
		while (!check) {
			System.out.println("Nhap ma gd:");
			maGD = sc.nextLine();
			if (maGD.equalsIgnoreCase(""))
				System.out.println("Ban phai nhap ma gd");
			else
				check = true;
		}

		System.out.print("Nhap ngay: ");
		ngay = sc.nextInt();
		System.out.print("Nhap thang: ");
		thang = sc.nextInt();
		System.out.print("Nhap nam: ");
		nam = sc.nextInt();
		check = false;
		while (!check) {
			try {
				System.out.println("Nhap don gia GD: ");
				donGia = sc.nextDouble();
				check = true;
			} catch (Exception e) {
				System.out.println("don gia phai la so............. Nhap lai.");
				sc.nextLine();
			}
		}
		check = false;
		while (!check) {
			try {
				System.out.println("Nhap so luong GD: ");
				soLuong = sc.nextInt();
				check = true;
			} catch (Exception e) {
				System.out.println("So luong phai la so. Hay nhap lai...........");
				sc.nextLine();
			}
		}
		sc.nextLine();
		System.out.println("Nhap ti gia: ");
		tiGia = sc.nextFloat();
		sc.nextLine();
		System.out.println("Nhap loai tien:  ");
		loaiTien = sc.nextLine();

		GDTien tien = new GDTien(maGD, LocalDate.of(nam, thang, ngay), donGia, soLuong, tiGia, loaiTien);
		return tien;

	}

	public static GDVang nhapvang() {
		int soLuong = 0;
		double donGia = 0;

		int ngay, thang, nam;
		boolean check = false;
		String maGD, loaiVang;
		maGD = loaiVang = null;
		Scanner sc = new Scanner(System.in);
		while (!check) {
			System.out.println("Nhap ma gd:");
			maGD = sc.nextLine();
			if (maGD.equalsIgnoreCase(""))
				System.out.println("Ban phai nhap ma gd");
			else
				check = true;
		}

		System.out.print("Nhap ngay: ");
		ngay = sc.nextInt();
		System.out.print("Nhap thang: ");
		thang = sc.nextInt();
		System.out.print("Nhap nam: ");
		nam = sc.nextInt();
		check = false;
		while (!check) {
			try {
				System.out.println("Nhap don gia GD: ");
				donGia = sc.nextDouble();
				check = true;
			} catch (Exception e) {
				System.out.println("don gia phai la so............. Nhap lai.");
				sc.nextLine();
			}
		}
		check = false;
		while (!check) {
			try {
				System.out.println("Nhap so luong GD: ");
				soLuong = sc.nextInt();
				check = true;
			} catch (Exception e) {
				System.out.println("So luong phai la so. Hay nhap lai...........");
				sc.nextLine();
			}
		}
		sc.nextLine();
		System.out.println("Nhap loai vang:  ");
		loaiVang = sc.nextLine();

		GDVang vang = new GDVang(maGD, LocalDate.of(nam, thang, ngay), donGia, soLuong, loaiVang);
		return vang;

	}
}