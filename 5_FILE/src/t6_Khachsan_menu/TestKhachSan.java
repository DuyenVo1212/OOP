package t6_Khachsan_menu;

import java.time.LocalDate;
import java.util.Scanner;

public class TestKhachSan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListHoaDon l = new ListHoaDon();
		l.ThemHoaDon(new TheoGio("G1", LocalDate.of(2012, 5, 7),"Toan","A1",50000,10));
		l.ThemHoaDon(new TheoGio("G2", LocalDate.of(2012, 5, 7),"Toan","A3",50000,15));
		l.ThemHoaDon(new TheoGio("G3", LocalDate.of(2012, 6, 7),"Toan","A5",50000,33));
		l.ThemHoaDon(new TheoNgay("N4", LocalDate.of(2012, 7, 7),"Toan","B2",50000,5));
		l.ThemHoaDon(new TheoNgay("N3", LocalDate.of(2013, 8, 7),"Toan","B3",50000,7));
		l.ThemHoaDon(new TheoNgay("N2", LocalDate.of(2012, 5, 7),"Toan","B4",50000,0));
//		l.XuatHoaDon();
//		l.ThongKeSoLuongHoaDon();
//		l.TinhTongThanhTien(5, 2012);
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("---------------------------------");
		System.out.println("|\t0. Exit");
		System.out.println("|\t1. Them hoa don ngay.");
		System.out.println("|\t2. Them hoa don gio.");
		System.out.println("|\t3. Xuat toan bo hoa don.");
		System.out.println("|\t4. Tinhs tong tien hoa don theo thang va nam nhap tu ban phim.");
		System.out.println("|\t5. Thong ke so luong hoa don.");
		System.out.println("|\t6. Xoa theo ma hd");
		
		do {
			System.out.println("Lựa chọn của bạn: ");
			x = sc.nextInt();
			System.out.println("------------------------");
			switch (x) {
			case 1: {
				l.ThemHoaDon(nhaphd_gio());
				break;
			}
			case 2: {
				l.ThemHoaDon(nhaphd_ngay());
				break;
			}
			case 3: {
				l.XuatHoaDon();
				break;
			}
			
			case 4: {
				int thang,nam;
				System.out.println("Nhap thang");
				thang=sc.nextInt();
				System.out.println("Nhap nam");
				nam=sc.nextInt();
				System.out.println("Tong tien trong thang "+thang+" nam "+nam);
				l.TinhTongThanhTien(thang,nam);
				break;
			}
			case 5: {
				l.ThongKeSoLuongHoaDon();
				break;
			}
			case 6: {
				String maHD;
				System.out.println("Nhap ma hd can xoa: ");
				sc.nextLine();
				maHD = sc.nextLine();
				l.xoaHD(maHD);
				System.out.println("Ma hd " + maHD + " da xoa");
				System.out.println("Ket qua sau khi xoa");
				l.XuatHoaDon();
				break;
			}
			}

		} while (x != 0);

	}

	public static TheoGio nhaphd_gio() {
		double soGio=0;
		double donGia= 0;
		String maHD , tenKH, maPhong;
		maHD = tenKH= maPhong = null;
		int ngay, thang, nam;
		boolean check = false;
		Scanner sc = new Scanner(System.in);
		while (!check) {
			System.out.println("Nhap ma hd:");
			maHD = sc.nextLine();
			if (maHD.equalsIgnoreCase(""))
				System.out.println("Ban phai nhap ma hd");
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
				System.out.println("Nhap don gia hd: ");
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
				System.out.println("Nhap so gio thue: ");
				soGio= sc.nextDouble();
				check = true;
			} catch (Exception e) {
				System.out.println("So gio phai la so............. Nhap lai.");
				sc.nextLine();
			}
		}
		
		sc.nextLine();
		System.out.println("Nhap ma phong: ");
		maPhong = sc.nextLine();
		System.out.println("Nhap ten kh:  ");
		tenKH = sc.nextLine();

		TheoGio gio = new TheoGio (maHD, LocalDate.of(nam, thang, ngay),tenKH,maPhong,donGia,soGio);
		return gio;

	}

	public static TheoNgay nhaphd_ngay() {
		double soNgay=0;
		double donGia= 0;
		String maHD , tenKH, maPhong;
		maHD = tenKH= maPhong = null;
		int ngay, thang, nam;
		boolean check = false;
		Scanner sc = new Scanner(System.in);
		while (!check) {
			System.out.println("Nhap ma hd:");
			maHD = sc.nextLine();
			if (maHD.equalsIgnoreCase(""))
				System.out.println("Ban phai nhap ma hd");
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
				System.out.println("Nhap don gia hd: ");
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
				System.out.println("Nhap so gio thue: ");
				soNgay= sc.nextDouble();
				check = true;
			} catch (Exception e) {
				System.out.println("So ngay phai la so............. Nhap lai.");
				sc.nextLine();
			}
		}
		
		sc.nextLine();
		System.out.println("Nhap ma phong: ");
		maPhong = sc.nextLine();
		System.out.println("Nhap ten kh:  ");
		tenKH = sc.nextLine();

		TheoNgay ngayt = new TheoNgay (maHD, LocalDate.of(nam, thang, ngay),tenKH,maPhong,donGia,soNgay);
		return ngayt;

	
		
	}
}
