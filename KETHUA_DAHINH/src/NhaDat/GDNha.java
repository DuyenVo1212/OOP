package NhaDat;

import java.time.LocalDate;

public class GDNha extends NhaDat{
	private String loaiNha;
	private String diaChi;
	public String getLoaiNha() {
		return loaiNha;
	}
	public void setLoaiNha(String loaiNha) {
		this.loaiNha = loaiNha;
	}
	public String getDiaCHi() {
		return diaChi;
	}
	public void setDiaCHi(String diaCHi) {
		this.diaChi = diaCHi;
	}
	public GDNha() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GDNha(String maGD, LocalDate ngayGD, double donGia, double dienTich, String loaiNha, String diaChi) {
		super(maGD, ngayGD, donGia, dienTich);
		this.loaiNha = loaiNha;
		this.diaChi = diaChi;
	}
	public double ThanhTien() {
		double tt = 0;
		if(loaiNha.equalsIgnoreCase("Thuong")) {
			tt = dienTich*donGia*90/100;
		} else {
			tt = dienTich*donGia;
		}
		return tt;
	}
	public String toString() {
		return super.toString() + String.format("%10s %10s %10s", loaiNha, diaChi, ThanhTien()); 
	}
}
