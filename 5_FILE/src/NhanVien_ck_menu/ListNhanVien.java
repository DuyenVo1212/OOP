package NhanVien_ck_menu;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class ListNhanVien {
	ArrayList<NhanVien> ds;
	public ListNhanVien() {
		ds = new ArrayList<NhanVien>();
	}
	public boolean AddNhanVien(NhanVien nv) {
		if(nv != null) {
			for(NhanVien n : ds) {
				if(n.getMaNV().equalsIgnoreCase(nv.getMaNV())) {
					System.out.println("Trung ma");
					return false;
				}
			}
			ds.add(nv);
			return true;
		}
		return false;
	}
	public void XuatNhanVien() {
		for(NhanVien n : ds) {
			System.out.println(n.toString());
		}
	}
	public void TongTienLuong(int thang) {
		NumberFormat fm = NumberFormat.getInstance(new Locale("vi", "VN"));
		double ttbienche = 0, tthopdong = 0;
		for(NhanVien n : ds) {
			if(n.getNgayLam().getMonthValue() == thang) {
				if(n instanceof NVBienChe) {
					ttbienche += ((NVBienChe) n).TinhLuong();
				}
				else {
					tthopdong += ((NVHopDong) n).TinhLuong();
				}
			}
		}
		System.out.println("Tong tien trong thang la: " + fm.format(ttbienche+tthopdong));
	}

	public void tongTienLuong() {
		
		double ttbienche = 0;
		double tthopdong = 0;
		NumberFormat fm = NumberFormat.getInstance(new Locale("vi", "VN"));
		for(NhanVien n : ds) {
		//	if(n.getNgayLam().getMonthValue() == 8 && n.getNgayLam().getYear() == 2020) {
				if(n instanceof NVBienChe) 
					ttbienche += ((NVBienChe) n).TinhLuong();
				else 
					tthopdong += ((NVHopDong) n).TinhLuong();
				
			//}
		}
		System.out.println("Tong tien trong thang la: " + fm.format(ttbienche+tthopdong));
		System.out.println("Tong tien bc trong thang la: " + fm.format(ttbienche));
		System.out.println("Tong tien hd trong thang la: " +fm.format(tthopdong));
		//System.out.println("Tong tien trong thang la: " + (ttbienche+tthopdong));
	}
		
	

	//loi
	public boolean EditSoNGayCong(String maNV, int snc) {
		try {
			for(NhanVien n : ds) {
				if(n.getMaNV().equalsIgnoreCase(maNV)){
					((NVHopDong) n).setSnCong(snc);
					return true;
				}
			}
			return false;
		} catch(Exception e) {
			System.out.println("Khong phai nhan vien hop dong");
			return false;
		}
		
	}
	public void NhanVienKhongHoanThanh() {
		try {
			for(NhanVien n : ds) {
				if(!((NVBienChe) n).getTrangThai().equalsIgnoreCase("Co")) {
					System.out.println(n.toString());
				}
			}
		} catch(Exception e) {
			
		}
		
	}
}
