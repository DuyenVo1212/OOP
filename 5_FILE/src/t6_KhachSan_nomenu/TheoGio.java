package t6_KhachSan_nomenu;

import java.time.LocalDate;

public class TheoGio extends HoaDon{
	private double soGio;

	public double getSoGio() {
		return soGio;
	}

	public void setSoGio(double soGio) {
		this.soGio = soGio;
	}

	public TheoGio(String maHD, LocalDate ngayHD, String tenKH, String maPhong, double donGia, double soGio) {
		super(maHD, ngayHD, tenKH, maPhong, donGia);
		this.soGio = soGio;
	}

	public TheoGio() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double ThanhTien() {
		double so = soGio;
		if(soGio > 24 && soGio < 30) {
			so = 24;
		} else if(soGio >= 30) {
			return -1;
		}
		return donGia*so;
	}
	public String toString() {
		if(ThanhTien() != -1) {
			return super.toString() + String.format("%-10s %-10.2f", soGio, ThanhTien());
		}
		return String.format("Tinh theo ngay");
	}
}
