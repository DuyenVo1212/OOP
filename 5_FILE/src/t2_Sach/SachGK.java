package t2_Sach;

import java.time.LocalDate;

public class SachGK extends Sach{
	private String tinhTrang;

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public SachGK(String maS, LocalDate ngayNhap, double donGia, int soLuong, String nxb, String tinhTrang) {
		super(maS, ngayNhap, donGia, soLuong, nxb);
		this.tinhTrang = tinhTrang;
	}
	public double ThanhTien() {
		double tt =0;
		if(tinhTrang.equalsIgnoreCase("Moi")) {
			tt = soLuong*donGia;
		} else {
			tt = soLuong*donGia*0.5;
		}
		return tt;
	}
	public String toString() {
		return super.toString() + String.format("%10s %10s",
												tinhTrang, ThanhTien());
	}
}
