package cuoiki.b1;

import java.util.ArrayList;

public class ListNhanVien {
	ArrayList<NhanVien> ds;
	public ListNhanVien() {
		ds = new ArrayList<NhanVien>();
	}
	public boolean ThemNhanVien(NhanVien nv) {
		if(nv != null) {
			for(NhanVien n: ds) {
				if(n.getMaNV().equalsIgnoreCase(nv.getMaNV())) {
					System.out.println("Trung ma nv : "+ nv.getMaNV());
					return false;
				}
			}
			ds.add(nv);
			return true;
		}
		return false;
	}
	public void XuatNhanVien() {
		for(NhanVien n : ds){
			System.out.println(n.toString());
		}
	}
	public double tongTienLuong() {
		double tien = 0;
		for(NhanVien n : ds) {
			if(n.getNgayVaoLam().getMonthValue() == 3 && n.getNgayVaoLam().getYear() == 2020) {
				tien += n.thanhTien();
			}
		}
		return tien;
	}
	public void DanhSachKhongHoanThanh() {
		for(NhanVien n : ds) {
			if(n instanceof BienChe) {
				if(((BienChe) n).isTrangThai() == false)
					System.out.println(n.toString());
			}
		}
	}
	public boolean CapNhat(String maNV, String hoTen) {
		for(NhanVien n : ds) {
			if(n.getMaNV().equalsIgnoreCase(maNV)) {
				n.setHoTen(hoTen);
				return true;
			}
		}
		return false;
	}
}
