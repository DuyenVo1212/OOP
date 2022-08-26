package t4_NhaDat_menu_error;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class AListNhaDat {
	ArrayList<NhaDat> ds;
	DecimalFormat dt = new DecimalFormat("#,###.0");
	
	public AListNhaDat() {
		ds = new ArrayList<NhaDat>();
	}

	public boolean ThemNhaDat(NhaDat nd) {
		if (nd != null) {
			for (NhaDat n : ds) {
				if (n.getMaGD().equalsIgnoreCase(nd.getMaGD())) {
					System.out.println("Khong Them Duoc");
					return false;
				}
			}
			ds.add(nd);
			return true;
		}
		return false;
	}

	public double ttnha = 0, ttdat = 0;

	public void TinhTongTungLoai() {
		for (NhaDat n : ds) {
			if (n instanceof GDNha) {
				ttnha += ((GDNha) n).ThanhTien();
			} else {
				ttdat += ((GDDat) n).ThanhTien();
			}
		}
		System.out.println("Tong tien nha: " + dt.format(ttnha));
		System.out.println("Tong tien dat: " + dt.format(ttdat));
		System.out.println("Tong tien: " + dt.format(ttdat + ttnha));
	}

//	public void TBThanhTien() {
//		System.out.println("Trung binh thanh tien: " + (ttnha + ttdat) / ds.size());
//	}

	public void TBThanhTien() {
		double tb = 0, tbc = 0;
		int d = 0;
		for (int i = 0; i < ds.size(); i++) {
			if (ds.get(i) instanceof GDNha) {
				tbc += ((GDNha) ds.get(i)).ThanhTien();
				d++;
			}
		}
		tb = tbc / d;

		System.out.println("Trung binh thanh tien cua GD nha: " + dt.format(tb));
	}

	public void GDThang9() {
		System.out.println("GD thang 9 la: ");
		for (NhaDat i : ds) {
			if 
				(i.getNgayGD().getMonthValue() == 9 || i.getNgayGD().getYear() == 2013) {
				System.out.println(i.toString());
			}
				
			}
		
	}

	public void XuatNhaDat() {
		for (NhaDat n : ds) {
			System.out.println(n.toString());
		}
	}

	public void xuatGDNha() {
		for (int i = 0; i < ds.size(); i++)
			if (ds.get(i) instanceof GDNha)
				System.out.println(ds.get(i));

	}

	public void xuatGDDat() {
		for (int i = 0; i < ds.size(); i++)
			if (ds.get(i) instanceof GDDat)
				System.out.println(ds.get(i));

	}

	public void ThongKeSoLuongHoaDon() {
		int nha = 0, dat = 0;
		for (NhaDat nd : ds) {
			if (nd instanceof GDNha) {
				nha++;
			} else {
				dat++;
			}
		}
		System.out.println("Theo gio so so hoa don la: " + nha);
		System.out.println("Theo ngay so so hoa don la: " + dat);
	}

//	public void nhapdat() {
//
//		double donGia = 0;
//		double dienTich = 0;
//		int ngay, thang, nam;
//		String maGD, loaiDat;
//		boolean check = false;
//
//		maGD = loaiDat = null;
//		Scanner sc = new Scanner(System.in);
//		while (!check) {
//			System.out.println("Nhap ma gd:");
//			maGD = sc.nextLine();
//			if (maGD.equalsIgnoreCase(""))
//				System.out.println("Ban phai nhap ma gd");
//			else
//				check = true;
//		}
//
//		System.out.print("Nhap ngay: ");
//		ngay = sc.nextInt();
//		System.out.print("Nhap thang: ");
//		thang = sc.nextInt();
//		System.out.print("Nhap nam: ");
//		nam = sc.nextInt();
//		check = false;
//		while (!check) {
//			try {
//				System.out.println("Nhap don gia GD: ");
//				donGia = sc.nextDouble();
//				check = true;
//			} catch (Exception e) {
//				System.out.println("don gia phai la so............. Nhap lai.");
//				sc.nextLine();
//			}
//		}
//		check = false;
//		while (!check) {
//			try {
//				System.out.println("Nhap dien tich GD: ");
//				dienTich = sc.nextInt();
//				check = true;
//			} catch (Exception e) {
//				System.out.println("Dien tich phai la so. Hay nhap lai...........");
//				sc.nextLine();
//			}
//		}
//		sc.nextLine();
//		System.out.println("Nhap loai Dat (A/B/C): ");
//		loaiDat = sc.nextLine();
//
//		GDDat dat = new GDDat(maGD, LocalDate.of(nam, thang, ngay), donGia, dienTich, loaiDat);
//	}
//
//	public void nhapnha() {
//
//		double donGia = 0;
//		double dienTich = 0;
//		int ngay, thang, nam;
//		String maGD, loaiNha, diaChi;
//		boolean check = false;
//
//		maGD = loaiNha = null;
//		Scanner sc = new Scanner(System.in);
//		while (!check) {
//			System.out.println("Nhap ma gd:");
//			maGD = sc.nextLine();
//			if (maGD.equalsIgnoreCase(""))
//				System.out.println("Ban phai nhap ma gd");
//			else
//				check = true;
//		}
//
//		System.out.print("Nhap ngay: ");
//		ngay = sc.nextInt();
//		System.out.print("Nhap thang: ");
//		thang = sc.nextInt();
//		System.out.print("Nhap nam: ");
//		nam = sc.nextInt();
//		check = false;
//		while (!check) {
//			try {
//				System.out.println("Nhap don gia GD: ");
//				donGia = sc.nextDouble();
//				check = true;
//			} catch (Exception e) {
//				System.out.println("don gia phai la so............. Nhap lai.");
//				sc.nextLine();
//			}
//		}
//		check = false;
//		while (!check) {
//			try {
//				System.out.println("Nhap dien tich GD: ");
//				dienTich = sc.nextInt();
//				check = true;
//			} catch (Exception e) {
//				System.out.println("Dien tich phai la so. Hay nhap lai...........");
//				sc.nextLine();
//			}
//		}
//		sc.nextLine();
//		System.out.println("Nhap loai Nha (Thuong/Cao cap): ");
//		loaiNha = sc.nextLine();
//
//		System.out.println("Nhap dia chi:  ");
//		diaChi = sc.nextLine();
//		GDNha nha = new GDNha(maGD, LocalDate.of(nam, thang, ngay), donGia, dienTich, loaiNha, diaChi);
//
//	}

	public void tuade() {
		String str = "";
		str += String.format("%10s %10s %10s %10s %15s %10s %10s", "magd", "ngagd", "donGia", "dienTich",
				"Loainha/LoaiDat", "Dia chi", "Thanhtien");
		System.out.println(str);
	}

	public ArrayList getAllCX() {
		return ds;
	}

	public void SapXepSoNguyen() {
		Collections.sort(ds, new Comparator<NhaDat>() {
			public int compare(NhaDat nd1, NhaDat nd2) {
				Double tmp1 = (Double) nd1.getDienTich();
				Double tmp2 = (Double) nd2.getDienTich();
				return tmp1.compareTo(tmp2);
			}
		});
	}

}
