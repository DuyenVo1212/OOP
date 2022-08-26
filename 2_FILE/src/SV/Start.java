package SV;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(1,"A", 6.7f, 7.7f);
		SinhVien sv2 = new SinhVien();
		SinhVien sv3 = new SinhVien();
		sv2.setMaSV(2);
		sv2.setHoTen("B");
		sv2.setDiemLT(5.5f);
		sv2.setDiemTH(5.5f);
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma so Sv3: ");
		int masv = sc.nextInt();
		System.out.println("Nhập họ và tên của sinh viên sv3: ");
		sc = new Scanner(System.in);
		String hoten = sc.nextLine();
		System.out.println("Nhập điểm lý thuyết của sinh viên sv3: ");
		sc = new Scanner(System.in);
		float diemlt = sc.nextFloat();
		System.out.println("Nhập điểm thực hành của sinh viên sv3: ");
		sc = new Scanner(System.in);
		float diemth = sc.nextFloat();
		sv3 = new SinhVien(masv, hoten, diemlt, diemth);
		System.out.println(sv1.TieuDe());
		System.out.println(sv1.ToString());
		System.out.println(sv2.ToString());
		System.out.println(sv3.ToString());
	}

}
