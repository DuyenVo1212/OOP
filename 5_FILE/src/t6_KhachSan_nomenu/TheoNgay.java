package t6_KhachSan_nomenu;

import java.time.LocalDate;

public class TheoNgay extends HoaDon{
	private double soNgay;

	public double getSoNgay() {
		return soNgay;
	}

	public void setSoNgay(double soNgay) {
		this.soNgay = soNgay;
	}

	public TheoNgay(String maHD, LocalDate ngayHD, String tenKH, String maPhong, double donGia, double soNgay) {
		super(maHD, ngayHD, tenKH, maPhong, donGia);
		this.soNgay = soNgay;
	}

	public TheoNgay() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double ThanhTien() {
		double ngay = 0;
		if(soNgay > 7) {
			ngay = soNgay - 7;
		}
		return soNgay*donGia + ngay*donGia*80/100;
	}
	public String toString() {
		return super.toString() + String.format("%-10s %-10.2f", soNgay, ThanhTien());
	}
}
