package TienDien;

import java.util.ArrayList;

public class ListKhachHang {
	ArrayList<KhanhHang> ds;
	public ListKhachHang() {
		ds = new ArrayList<KhanhHang>();
	}
	public boolean ThemKhachHang(KhanhHang kh) {
		if(kh != null) {
			for(KhanhHang k : ds) {
				if(k.getMaKH().equalsIgnoreCase(kh.getMaKH())) {
					System.out.println("Khong them duoc");
					return false;
				}
			}
			ds.add(kh);
			return true;
		}
		return false;
	}
	public void TinhTongTungLoai() {
		int vn = 0, nn = 0;
		for(KhanhHang k : ds) {
			if(k instanceof VietNam) {
				vn++;
			}
			else {
				nn++;
			}
		}
		System.out.println("So luong VN: "+ vn);
		System.out.println("So luong NN: "+ nn);
	}
	public void TinhTBThanhTien() {
		double tt = 0;
		int d = 0;
		for(KhanhHang k : ds) {
			if(k instanceof NuocNgoai) {
				tt += ((NuocNgoai) k).ThanhTien();
				d++;
			}
		}
		System.out.println("Tong trung binh kh nuoc ngoai: "+ tt/d);
	}
	public void HoaDonThang9() {
		System.out.println("Hoa don thang 9");
		for(KhanhHang k : ds) {
			if(k.getNgayLap().getMonthValue() == 9) {
				System.out.println(k.toString());
			}
		}
	}
	public void XuatKhachHang() {
		for(KhanhHang k : ds) {
			System.out.println(k.toString());
		}
	}
}
