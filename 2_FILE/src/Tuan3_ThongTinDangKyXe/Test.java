package Tuan3_ThongTinDangKyXe;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		try {
			ThongTinXe xe1 = new ThongTinXe(20049891, "Nguyen thu lan", "mes sa dex", 3566, 100);
			ThongTinXe xe2 = nhapCung();
			ThongTinXe xe3 = nhapMem();

			System.err.println(xe1.tieuDe());
			System.out.println(xe1);
			System.out.println(xe2);
			System.out.println(xe3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static ThongTinXe nhapCung() throws Exception {
		ThongTinXe xe2 = new ThongTinXe();
		xe2.setMaChuXe(20049892);
		xe2.setChuXe("Nguyen Van A");
		xe2.setLoaiXe("Au di");
		xe2.setDungTich(3000);
		xe2.setTriGia(250000000);

		return xe2;
	}

	public static ThongTinXe nhapMem() throws Exception {
		Scanner sc = new Scanner(System.in);
		ThongTinXe xe3 = new ThongTinXe();
		System.out.println("Nhap cac thong tin ma:");
		int maChuXe = sc.nextInt();
		System.out.println("Nhap ten : ");
		String chuXe = sc.next();
		System.out.println("Nhap loai : ");
		String loaiXe = sc.next();
		System.out.println("Nhap dung tich):");
		int dungTich = sc.nextInt();
		System.out.println("Nhap tri gia : ");
		float triGia = sc.nextFloat();

		xe3 = new ThongTinXe(maChuXe, chuXe, loaiXe, dungTich, triGia);
//	ThongTinXe xe3= new ThongTinXe
//   (sc.nextInt(), sc.next(), sc.next(),
//			sc.nextFloat(), sc.nextInt());
		return xe3;
	}

}
