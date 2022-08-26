package GD;

import java.time.LocalDate;

public class GDTien extends GiaoDich{
	private double tiGia;
	private String loaiTien;
	public double getTiGia() {
		return tiGia;
	}
	public void setTiGia(double tiGia) {
		this.tiGia = tiGia;
	}
	public String getLoaiTien() {
		return loaiTien;
	}
	public void setLoaiTien(String loaiTien) {
		this.loaiTien = loaiTien;
	}
	public GDTien(String maGD, LocalDate ngayGD, double donGia, int soLuong, double tiGia, String loaiTien) {
		super(maGD, ngayGD, donGia, soLuong);
		this.tiGia = tiGia;
		this.loaiTien = loaiTien;
	}
	public double ThanhTien() {
		double tt = 0;
		if(loaiTien.equalsIgnoreCase("VN")) {
			tt += soLuong*donGia;
		} else {
			tt += soLuong*donGia*tiGia;
		}
		return tt;
	}
	public String toString() {
		return super.toString() + String.format("%10s %10s %10s",
				tiGia, loaiTien, ThanhTien());
	}
}
