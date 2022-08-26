package EndLearn;

import java.time.LocalDate;

public class NVBienChe extends NhanVien{
	private double hsLuong;
	private String trangThai;
	public double getHsLuong() {
		return hsLuong;
	}
	public void setHsLuong(double hsLuong) {
		if(hsLuong >= 2.34 && hsLuong <= 4.98) {
			this.hsLuong = hsLuong;
		}
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public NVBienChe(String maNV, String hoTen, LocalDate ngayLam, double hsLuong, String trangThai) {
		super(maNV, hoTen, ngayLam);
		this.hsLuong = hsLuong;
		this.trangThai = trangThai;
	}
	public NVBienChe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double PhuCap() {
		if(trangThai.equals("Co")) {
			return 2000000;
		}
		return 500000;
	}
	public double TinhLuong() {
		return hsLuong * 1400000 + PhuCap();
	}
	public String TieuDe() {
		return String.format("%-10s %-10s %-15s %-10s %-10s %-10s", 
				"Ma NV", "Ho ten", "Ngay lam", "Hs Luong", "Trang thai", "Luong");
	}
	public String toString() {
		return super.toString() + String.format("%-10s %-10s %-10.2f", hsLuong, trangThai, TinhLuong());
	}
}
