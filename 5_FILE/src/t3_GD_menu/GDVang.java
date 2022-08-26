package t3_GD_menu;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Date;

public class GDVang extends GiaoDich{

	private String loaiVang;

	public String getLoaiVang() {
		return loaiVang;
	}

	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}
	
	
//	public GDVang(String maGD, LocalDate ngayGD, double donGia, int soLuong, String loaiVang) {
//		super(maGD, ngayGD, donGia, soLuong,loaiVang);
//		this.loaiVang = loaiVang;
//	}
	


	public GDVang(String maGD, LocalDate ngayGD, double donGia, int soLuong, String loaiVang) {
		super(maGD, ngayGD, donGia, soLuong);
		this.loaiVang = loaiVang;
	}

	public double ThanhTien() {
		return soLuong*donGia;
	}
	

	public String toString() {
		return super.toString() + String.format("%10s %10f", loaiVang,ThanhTien());
	}
}
