package t4_NhaDat_menu_error;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Scanner;

public class TestNhaDat {

	public static void main(String[] args) {
		AListNhaDat lnd = new AListNhaDat();
		lnd.ThemNhaDat(new GDDat("D1", LocalDate.of(2012, 5, 4), 50000000, 500, "A"));
		lnd.ThemNhaDat(new GDDat("D2", LocalDate.of(2012, 9, 9), 100000000, 800, "B"));
		lnd.ThemNhaDat(new GDDat("D3", LocalDate.of(2012, 9, 5), 150000000, 1000, "C"));
		lnd.ThemNhaDat(new GDNha("N1", LocalDate.of(2012, 9, 1), 40000000, 2000, "Thuong", "Nga 3"));
		lnd.ThemNhaDat(new GDNha("N2", LocalDate.of(2012, 5, 1), 50000000, 1000, "cao cap", "Nga 4"));
		lnd.ThemNhaDat(new GDNha("N3", LocalDate.of(2012, 9, 2), 140000000, 5000, "Thuong", "Nga 6"));
//		lnd.XuatNhaDat();
//		lnd.TinhTongTungLoai();
//		lnd.TBThanhTien();
//		lnd.GDThang9();

		int x;
		System.out.println("\n\t\t----------------------------------");
		System.out.println("\t\t|0. Thoat ung dung\t\t\t\t |");
		System.out.println("\t\t|1. Them Giao Dich Nha\t\t\t\t |");
		System.out.println("\t\t|2. Them Giao Dich Dat\t\t\t |");
		System.out.println("\t\t|3. Hien Thi Danh Sach Giao Dich\t\t |");
		System.out.println("\t\t|4. Hien Thi Giao Dich Nha\t\t |");
		System.out.println("\t\t|5. Hien Thi Giao Dich Dat\t\t |");
		System.out.println("\t\t|6. Xem Tong So Luong cua cac Giao Dich\t\t |");
		System.out.println("\t\t|7. Xem Trung Binh thanh tien cua tung giao dich\t |");
		System.out.println("\t\t|8. In ra danh sach ban dau");
		System.out.println("\t\t|9. Sap xep dien tich tang dan\t |");
		System.out.println("\t\t|10. Tinh tong thanh tien tung loai\t |");
		System.out.println("\t\t|11. Hien Thi Danh Sach Giao Dich thang 9");
		System.out.println("\t\t--------------------------------------");
		do {
			System.out.println("Lựa chọn của bạn: ");
			Scanner sc = new Scanner(System.in);
			x = sc.nextInt();
			System.out.println("------------------------");
			switch (x) {
			case 1: {
				lnd.ThemNhaDat(nhapnha());
	
				break;
			}
			case 2: {
				lnd.ThemNhaDat(nhapdat());
				break;
			}
			case 3: {
				 lnd.tuade();
				lnd.XuatNhaDat();
				break;
			}
			case 4: {
				lnd.xuatGDNha();
				break;
			}
			case 5: {
				lnd.xuatGDDat();
				break;
			}

			case 6: {
				lnd.ThongKeSoLuongHoaDon();
				break;
			}
			case 7: {
				lnd.TBThanhTien();
				break;
			}

			case 8: 
				//sap xep theo thu tu add tung chuyen xe giam dan
				Collections.sort(lnd.getAllCX());
				System.out.println("Da sap xep");
				lnd.getAllCX();
				break;
				
			case 9:{//sap xep dien tich tang dan
				lnd.SapXepSoNguyen();
				System.out.println("Da sap xep");
				lnd.getAllCX();
				lnd.XuatNhaDat();
				break;
			
			}
			case 10: {
				lnd.TinhTongTungLoai();
				break;
			}
			case 11: 
				lnd.GDThang9();
				break;
			
		
			}
		} while (x != 0);

	}
	public static NhaDat nhapnha() {

		double donGia = 0;
		double dienTich = 0;
		int ngay, thang, nam;
		String maGD, loaiNha, diaChi;
		boolean check = false;

		maGD = loaiNha = null;
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
				System.out.println("Nhap dien tich GD: ");
				dienTich = sc.nextInt();
				check = true;
			} catch (Exception e) {
				System.out.println("Dien tich phai la so. Hay nhap lai...........");
				sc.nextLine();
			}
		}
		sc.nextLine();
		System.out.println("Nhap loai Nha (Thuong/Cao cap): ");
		loaiNha = sc.nextLine();

		System.out.println("Nhap dia chi:  ");
		diaChi = sc.nextLine();
		GDNha nha = new GDNha(maGD, LocalDate.of(nam, thang, ngay), donGia, dienTich, loaiNha, diaChi);
		return nha;

	}
	
	public static GDDat nhapdat() {

		double donGia = 0;
		double dienTich = 0;
		int ngay, thang, nam;
		String maGD, loaiDat;
		boolean check = false;

		maGD = loaiDat = null;
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
				System.out.println("Nhap dien tich GD: ");
				dienTich = sc.nextInt();
				check = true;
			} catch (Exception e) {
				System.out.println("Dien tich phai la so. Hay nhap lai...........");
				sc.nextLine();
			}
		}
		sc.nextLine();
		System.out.println("Nhap loai Dat (A/B/C): ");
		loaiDat = sc.nextLine();

		GDDat dat = new GDDat(maGD, LocalDate.of(nam, thang, ngay), donGia, dienTich, loaiDat);
		return dat;

	}

}