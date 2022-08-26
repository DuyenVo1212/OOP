package t4_NhaDat_menu_error;

import java.time.LocalDate;

public class GDDat extends NhaDat{
	private String loaiDat;

	public String getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}

	public GDDat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GDDat(String maGD, LocalDate ngayGD, double donGia, double dienTich, String loaiDat) {
		super(maGD, ngayGD, donGia, dienTich);
		this.loaiDat = loaiDat;
	}
	public double ThanhTien() {
		double tt = 0;
		if(loaiDat.equalsIgnoreCase("A")) {
			tt = dienTich*donGia*1.5;
		} else {
			tt = dienTich*donGia;
		}
		return tt;
	}
	public String toString() {
		return super.toString() + String.format("%10s %10s", loaiDat, ThanhTien());
	}
}
