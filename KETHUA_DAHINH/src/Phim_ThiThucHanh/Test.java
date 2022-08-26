package Phim_ThiThucHanh;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws Exception {
		DanhSachPhim dsPhim = new DanhSachPhim(10);
		PhimNoi pn1 = new PhimNoi("h1","Ten k",LocalDate.of(2021, 12, 20),"ha noi",10, 200000,"Phim truyen");
		PhimNoi pn2 = new PhimNoi("s1","Ten x",LocalDate.of(2021, 12, 25),"hcm",2, 100000,"Phim thieu nhi");
		PhimNoi pn3 = new PhimNoi("b1","Ten y",LocalDate.of(2021, 12, 1),"binh thuan",30, 100000,"Phim truyen");
		PhimNgoai pngoai1 = new PhimNgoai("a1","Ten z",LocalDate.of(2021, 7, 12),"hue",15, 250000,30);
		PhimNgoai pngoai2 = new PhimNgoai("g1","Ten c",LocalDate.of(2021, 12, 6),"da nang",5, 270000,10);
		PhimNgoai pngoai3 = new PhimNgoai("c1","Ten a",LocalDate.of(2021, 5, 5),"ca mau",25, 220000,15);
		dsPhim.themPhim(pn1); dsPhim.themPhim(pngoai1);
		dsPhim.themPhim(pn2); dsPhim.themPhim(pngoai2);
		dsPhim.themPhim(pn3); dsPhim.themPhim(pngoai3);
		
		System.out.println(dsPhim.xuatHet());
		
		System.out.println("truoc khi sap tang theo ten phim:");
		System.out.println(dsPhim.xuatHet());
		dsPhim.sortTangTenPhim();
		System.out.println("sau khi sap tang theo ten phim:");
		System.out.println(dsPhim.xuatHet());
		
		System.out.println("So luong phim la: " + dsPhim.soLuongPhim());
		
		System.out.print("Nhap ma phim can xoa: ");
		Scanner scan = new Scanner(System.in);
		String x = scan .next();
		if(dsPhim.searchMa(x) == null) 
			System.out.println("khong tim thay ma");
		else {
			System.out.print("Nhap 1 de xoa:");
			int i=scan.nextInt();
			if(i == 1) {
				dsPhim.xoaPhim(x);
				System.out.println("xoa thanh cong");
			} else System.out.println("xoa that bai");
		}

		System.out.println("Tong doanh thu ca danh sach la: " + dsPhim.tongDoanhThu() + " VND");

		System.out.println(PhimNoi.tieuDe());
		for(Phim i: dsPhim.dsPhimNoi())
			System.out.println(i);

		System.out.print("Nhap moc thoi gian: ");
		LocalDate a = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
		System.out.println(dsPhim.xuatHetTheoNgay(a));
	}
}
