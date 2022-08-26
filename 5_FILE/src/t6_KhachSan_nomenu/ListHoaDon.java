package t6_KhachSan_nomenu;

import java.util.ArrayList;

public class ListHoaDon {
	ArrayList<HoaDon> ds;
	public ListHoaDon() {
		ds = new ArrayList<HoaDon>();
	}
	public boolean ThemHoaDon(HoaDon hd) {
		if(hd != null) {
			for(HoaDon h : ds) {
				if(h.getMaHD().equalsIgnoreCase(hd.getMaHD())) {
					System.out.println("Khong them duoc");
					return false;
				}
			}
			ds.add(hd);
		}
		return false;
	}
	public void ThongKeSoLuongHoaDon() {
		int gio = 0, ngay = 0;
		for(HoaDon h: ds) {
			if(h instanceof TheoGio) {
				gio++;
			}
			else {
				ngay++;
			}
		}
		System.out.println("Theo gio so so hoa don la: "+ gio);
		System.out.println("Theo ngay so so hoa don la: "+ ngay);
	}
	public void TinhTongThanhTien(int thang, int nam) {
		double ttg = 0; double ttn = 0;
		for(HoaDon h : ds) {
			if(h.getNgayHD().getMonthValue() == thang && h.getNgayHD().getYear() == nam) {
				if(h instanceof TheoGio) {
					ttg += ((TheoGio) h).ThanhTien();
				} else {
					ttn += ((TheoNgay) h).ThanhTien();
				}
			}
		}
		System.out.println("Tong Tien: " + ttg+ttn);
	}
	public void XuatHoaDon() {
		for(HoaDon h : ds) {
			System.out.println(h.toString());
		}
	}
}
