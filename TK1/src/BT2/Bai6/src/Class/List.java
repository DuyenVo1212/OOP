package BT2.Bai6.src.Class;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
	private ArrayList<KhachTro> ds;

	public List() {
		ds = new ArrayList<KhachTro>(10);
	}

	public void themKhachTro(KhachTro kt) {
		ds.add(kt);
	}
	
	public void nhapDanhSach(Scanner sc) {
		KhachTro khach;

		System.out.print("Nhap vao so luong khach: ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap vao thong tin khach tro:");
		for (int i = 0; i < n; i++) {
			System.out.println("Khach tro thu " + (i + 1) + " la:");
			khach = new KhachTro();
			khach.nhapThongTin(sc);
			themKhachTro(khach);
		}
	}

	public void hienThiDanhSach() {
		for (KhachTro khach : ds) {
			khach.hienThiThongTin();
		}
	}

	// ham tinh tien
	public double tinhTien(int CMND) {
		double tien = 0;

		for (KhachTro khach : ds) {
			if (khach.getCMND() == CMND) {
				tien = khach.getSoNgayTro() * khach.getGiaPhong();
			}
		}

		return tien;
	}
}
