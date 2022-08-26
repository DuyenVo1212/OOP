package t7QuanLyThucPham;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class KiemThuHangHoa {
	
	public static int menu() {
		System.out.println("*******************************************");
		System.out.println("*                   Menu                  *");
		System.out.println("*    1.Them hang hoa                      *");
		System.out.println("*    2.Tim kiem theo ma                   *");
		System.out.println("*    3.Xuat toan bo danh sach hang hoa    *");
		System.out.println("*    4.Xoa                                *");
		System.out.println("*    0.thoat!                             *");
		System.out.println("*******************************************");
		System.out.print("\nchon: ");
		Scanner scan = new Scanner(System.in);
		int chon = scan.nextInt();
		return chon;
	}	

	public static HangHoa suaHTP(DanhSachHangHoa dSachHangHoa) throws Exception {
		String maHang;
		Scanner scan = new Scanner(System.in);
		System.out.println("nhap ma can sua: ");
		maHang = scan.nextLine();
		HangThucPham i = (HangThucPham) dSachHangHoa.timKiem(maHang);
		if(i != null) {
			System.out.println("thong tin truoc khi sua: ");
			System.out.println(i);
			System.out.println("nhap ma hang: ");
			i.setMaHang(scan.next());
			System.out.println("nhap ten hang: ");
			i.setTenHang(scan.next());
			System.out.println("nhap so luong ton: ");
			i.setSoLuongTon(scan.nextInt());
			System.out.println("nhap don gia: ");
			i.setDonGia(scan.nextDouble());
			System.out.println("nhap ngay san xuat: (nam, thang, ngay)");
			i.setNgaySanXuat(LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt()));
			System.out.println("nhap ngay het han: (nam, thang, ngay)");
			i.setNgayHetHan(LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt()));
			System.out.println("nhap ten nha cung cap: ");
			i.setNhaCungCap(scan.next());
			return i;			
		}
		return null;
	}
	
	public static HangHoa suaHDM(DanhSachHangHoa dSachHangHoa) throws Exception {
		String maHang;
		Scanner scan = new Scanner(System.in);
		System.out.println("nhap ma can sua: ");
		maHang = scan.nextLine();
		HangDienMay i =  (HangDienMay) dSachHangHoa.timKiem(maHang);
		if(i != null) {
			System.out.println("thong tin truoc khi sua: ");
			System.out.println(i);
			System.out.println("nhap ma hang: ");
			i.setMaHang(scan.next());
			System.out.println("nhap ten hang: ");
			i.setTenHang(scan.next());
			System.out.println("nhap so luong ton: ");
			i.setSoLuongTon(scan.nextInt());
			System.out.println("nhap don gia: ");
			i.setDonGia(scan.nextDouble());
			System.out.println("nhap thoi gian bao hanh: ");
			i.setTimeBaoHanh(scan.nextInt());
			System.out.println("nhap cong suat: ");
			i.setCongSuatKW(scan.nextDouble());
			return i;			
		}
		return null;
	}
	
	public static HangHoa suaHSS(DanhSachHangHoa dSachHangHoa) throws Exception {
		String maHang;
		Scanner scan = new Scanner(System.in);
		System.out.println("nhap ma can sua: ");
		maHang = scan.nextLine();
		HangSanhSu i = (HangSanhSu) dSachHangHoa.timKiem(maHang);
		if(i != null) {
			System.out.println("thong tin truoc khi sua: ");
			System.out.println(i);
			System.out.println("nhap ma hang: ");
			i.setMaHang(scan.next());
			System.out.println("nhap ten hang: ");
			i.setTenHang(scan.next());
			System.out.println("nhap so luong ton: ");
			i.setSoLuongTon(scan.nextInt());
			System.out.println("nhap don gia: ");
			i.setDonGia(scan.nextDouble());
			System.out.println("nhap ngay nhap kho: (nam, thang, ngay)");
			i.setNgayNhapKho(LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt()));
			System.out.println("nhap nha san xuat: ");
			i.setNhaSanXuat(scan.next());
			return i;			
		}
		return null;
	}

	
	public static void themHTP(DanhSachHangHoa dSachHangHoa) throws Exception {
		Scanner scan = new Scanner(System.in);
		HangThucPham htp = new HangThucPham();
		System.out.println("nhap ten hang: ");
		htp.setTenHang(scan.next());
		System.out.println("nhap ma hang: ");
		htp.setMaHang(scan.next());
		System.out.println("nhap so luong ton: ");
		htp.setSoLuongTon(scan.nextInt());
		System.out.println("nhap don gia: ");
		htp.setDonGia(scan.nextDouble());
		System.out.println("nhap ngay san xuat: (nam, thang, ngay)");
		htp.setNgaySanXuat(LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt()));
		System.out.println("nhap ngay het han: (nam, thang, ngay)");
		htp.setNgayHetHan(LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt()));
		System.out.println("nhap nha cung cap: ");
		htp.setNhaCungCap(scan.next());
		if(dSachHangHoa.themHangHoa(htp)) System.out.println("them thanh cong");
		else System.out.println("them that bai, trung ma");
	}
	
	public static void themHDM(DanhSachHangHoa dSachHangHoa) throws Exception {
		Scanner scan = new Scanner(System.in);
		HangDienMay hdm = new HangDienMay();
		System.out.println("nhap ten hang: ");
		hdm.setTenHang(scan.next());
		System.out.println("nhap ma hang: ");
		hdm.setMaHang(scan.next());
		System.out.println("nhap so luong ton: ");
		hdm.setSoLuongTon(scan.nextInt());
		System.out.println("nhap don gia: ");
		hdm.setDonGia(scan.nextDouble());
		System.out.println("nhap thoi gian bao hanh: ");
		hdm.setTimeBaoHanh(scan.nextInt());
		System.out.println("nhap cong suat: ");
		hdm.setCongSuatKW(scan.nextDouble());
		if(dSachHangHoa.themHangHoa(hdm)) System.out.println("them thanh cong");
		else System.out.println("them that bai, trung ma");
	}
	
	public static void themHSS(DanhSachHangHoa dSachHangHoa) throws Exception {
		Scanner scan = new Scanner(System.in);
		HangSanhSu hss = new HangSanhSu();
		System.out.println("nhap ten hang: ");
		hss.setTenHang(scan.next());
		System.out.println("nhap ma hang: ");
		hss.setMaHang(scan.next());
		System.out.println("nhap so luong ton: ");
		hss.setSoLuongTon(scan.nextInt());
		System.out.println("nhap don gia: ");
		hss.setDonGia(scan.nextDouble());
		System.out.println("nhap ngay nhap kho: (nam, thang, ngay)");
		hss.setNgayNhapKho(LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt()));
		System.out.println("nhap nha san xuat: ");
		hss.setNhaSanXuat(scan.next());
		if(dSachHangHoa.themHangHoa(hss)) System.out.println("them thanh cong");
		else System.out.println("them that bai, trung ma");
	}
	
	public static void main(String[] args) {
		try {
				DanhSachHangHoa dSachHangHoa = new DanhSachHangHoa(9);
				HangDienMay hdm1 = new HangDienMay("may giat", "111", 23, 12000000.00, 5, 25);
				HangDienMay hdm2 = new HangDienMay("may lanh", "222", 33, 3300000000.00, 12, 50);
				HangDienMay hdm3 = new HangDienMay("may rua chen", "333", 47, 200000000.00, 24, 30);
				HangSanhSu hss1 = new HangSanhSu("binh hoa", "444", 37, 2000000.00, LocalDate.of(2020, 12, 5), "minh long");
				HangSanhSu hss2 = new HangSanhSu("chen", "555", 12, 3000000.00, LocalDate.of(2021, 11, 7), "bat trang");
				HangSanhSu hss3 = new HangSanhSu("bat", "666", 10, 4000000.00, LocalDate.of(2022, 5, 1), "bau truc");
				HangThucPham htp1 = new HangThucPham("sua", "777", 35, 30000.00 ,LocalDate.of(2021, 11, 5), LocalDate.of(2022,11, 5),"vinamilk");
				HangThucPham htp2 = new HangThucPham("mi goi", "888", 8, 10000.00 ,LocalDate.of(2020, 9, 5), LocalDate.of(2023,9, 5),"acecook");
				HangThucPham htp3 = new HangThucPham("trung ga", "999", 25, 25000.00 ,LocalDate.of(2021, 2, 12), LocalDate.of(2025, 2, 12),"vissan");
				dSachHangHoa.themHangHoa(htp1); dSachHangHoa.themHangHoa(htp2);
				dSachHangHoa.themHangHoa(htp3); dSachHangHoa.themHangHoa(hdm1);
				dSachHangHoa.themHangHoa(hdm2); dSachHangHoa.themHangHoa(hdm3);
				dSachHangHoa.themHangHoa(hss1); dSachHangHoa.themHangHoa(hss2);
				dSachHangHoa.themHangHoa(hss3); 
				int choose;
				Scanner scan = new Scanner(System.in);
				 do {
					 	choose = menu();
						switch (choose) {
							case 0: {
								break;
							}
							case 1: {
								System.out.println("*********************");
								System.out.println("* 1. Hang Thuc Pham *");
								System.out.println("* 2. Hang Sanh Su   *");
								System.out.println("* 3. Hang Dien May  *");
								System.out.println("*********************");
								System.out.print("moi lua chon: ");
								int chon = scan.nextInt();
								if(chon == 1) themHTP(dSachHangHoa);
								else if (chon == 2) themHSS(dSachHangHoa);
								else themHDM(dSachHangHoa);
								break;
							}
							case 2: {
								System.out.print("Nhap ma:");
								String x = scan.next();
								HangHoa i = dSachHangHoa.timKiem(x);
								if(i instanceof HangThucPham) System.out.println(HangThucPham.tieuDe());
								if(i instanceof HangSanhSu) System.out.println(HangSanhSu.tieuDe());
								if(i instanceof HangDienMay) System.out.println(HangDienMay.tieuDe());
								System.out.println(i);
								break;
							}
							case 3: {
								System.out.println(dSachHangHoa.toString());
								break;
							}
							case 4: {
								System.out.print("Nhap ma cua hang hoa can xoa: ");
								String x = scan.next();
								if(dSachHangHoa.timKiem(x) == null) System.out.println("khong tim thay");
								else {
									System.out.print("Nhap 1 de xoa:");
									int i = scan.nextInt();
									if(i == 1) {
										dSachHangHoa.xoa(x);
										System.out.println("xoa thanh cong");
									} else System.out.println("xoa that bai");
								}
								break;
							}
						}
				 } while(choose!=0);
					System.out.println("Thoat thanh cong!");
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
}
