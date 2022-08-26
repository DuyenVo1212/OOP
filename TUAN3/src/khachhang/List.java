package khachhang;

public class List {
	private KhachHang kh[] = new KhachHang[100];
	private int CountKH, sum1 = 0, sum2 = 0, dem = 0, sumtien = 0;

	public List() {
		CountKH = 0;
		for (int i = 0; i < 100; i++)
			kh[i] = new KhachHang();
	}

	public void ThemKH(int temp) {
		if (CountKH > 100)
			System.out.println("Bo Nho Da Day, ko the them!");
		else {
			if (temp == 1) {
				kh[CountKH] = new KhachHangViet();
				KhachHangViet khv = new KhachHangViet();
				khv.nhap();
				khv.ThanhTien = khv.TTien();
				kh[CountKH] = khv;
				sum1 += khv.SoLuong;
			} else {
				kh[CountKH] = new KhachHangNuocNgoai();
				KhachHangNuocNgoai khnn = new KhachHangNuocNgoai();
				khnn.nhap();
				khnn.ThanhTien = khnn.TTien();
				kh[CountKH] = khnn;
				sum2 += khnn.SoLuong;
				sumtien += khnn.ThanhTien;
				dem++;
			}
			CountKH++;
		}
	}

	public void HienThiKH() {
		for (int i = 0; i < CountKH; i++) {
			System.out.println("\nSo TT: " + (i + 1));
			System.out.println(kh[i].toString());
		}
	}

	public static void tuade() {
		String str = "";
		str += String.format("%20s %5s %10s %5s %5s", "MaKH", "hoTen", "Ngaylap", "Soluong", "Dongia");
		System.out.println(str);
	}

	public void TongSL() {
		System.out.println(":::->> Tong So Luong(KW) Dien cua KH Viet Nam: " + sum1);
		System.out.println(":::->> Tong So Luong(KW) Dien cua KH Nuoc Ngoai: " + sum2);

	}

	public void TrungBinh() {
		System.out.println("|-->> Trung Binh Thanh Tien cua KH Nuoc Ngoai: " + (sumtien / dem));
	}

	public void XuatThang9() {
		System.out.println("Giao dich thang 9 nam 2013");
		for (int i = 0; i < dem; i++) {
			if (kh[i].getNgayHD().getMonth().getValue() == 9 && kh[i].getNgayHD().getYear() == 2013) {
				System.out.println(kh[i].toString());
			}
		}
	}
}