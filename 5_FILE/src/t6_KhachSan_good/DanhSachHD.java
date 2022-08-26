package t6_KhachSan_good;

import java.util.HashSet;
import java.util.Set;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DanhSachHD {
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	Set<HoaDon> DsHd = null;

	public DanhSachHD(int soluong) {
		DsHd = new HashSet<HoaDon>(soluong);
	}

	public boolean add(HoaDon x) {
		int a = DsHd.size();
		DsHd.add(x);
		if (a == DsHd.size())
			return false;
		return true;
	}

	@Override
	public String toString() {
		String str = "Hoa don gio: \n";
		str += String.format("%10s %15s %15s %10s %10s %10s %10s", "MaKh", "NgayHd", "TenKh", "MaPhong", "DonGia",
				"Tien", "Gio\n");
		for (HoaDon i : DsHd) {
			if (i instanceof Gio)
				str += i + "\n";
		}
		str += "Hoa don Ngay: \n";
		str += String.format("%10s %15s %15s %10s %10s %10s %10s", "MaKh", "NgayHd", "TenKh", "MaPhong", "DonGia",
				"Tien", "Ngay\n");
		for (HoaDon i : DsHd) {
			if (i instanceof Ngay)
				str += i + "\n";
		}
		return str;
	}

	public int soLuongHoaDonTheoGio() {
		int count = 0;
		for (HoaDon i : DsHd) {
			if (i instanceof Gio)
				count++;
		}
		return count;
	}

	public int soLuongHoaDonTheoNgay() {
		int count = 0;
		for (HoaDon i : DsHd)
			if (i instanceof Ngay)
				count++;
		return count;
	}

	public double tinhTongThanhTien(int thang, int nam) throws ParseException {
		String str1 = "01/" + thang + "/" + nam;
		String str2 = "30/" + thang + "/" + nam;
		double sum = 0;
		for (HoaDon i : DsHd) {
			if (i.getNgayHD().after(formatter.parse(str1)) && i.getNgayHD().before((formatter.parse(str2))))
				sum += i.thanhTien();
		}
		return sum;
	}
}
