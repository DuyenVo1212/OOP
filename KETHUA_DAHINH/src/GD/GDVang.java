package GD;

import java.time.LocalDate;

public class GDVang extends GiaoDich{

	private String loaiVang;

	public String getLoaiVang() {
		return loaiVang;
	}

	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}
	public GDVang(String maGD, LocalDate ngayGD, double donGia, int soLuong, String loaiVang) {
		super(maGD, ngayGD, donGia, soLuong);
		this.loaiVang = loaiVang;
	}
	public double ThanhTien() {
		return soLuong*donGia;
	}
	public String toString() {
		return super.toString() + String.format("%10s %10s", loaiVang, ThanhTien());
	}
}
