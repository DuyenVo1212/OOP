package t5_TienDien;

import java.time.LocalDate;

public class VietNam extends KhanhHang{
	private String doiTuong;
	private double dinhMuc;
	public String getDoiTuong() {
		return doiTuong;
	}
	public void setDoiTuong(String doiTuong) {
		this.doiTuong = doiTuong;
	}
	public double getDinhMuc() {
		return dinhMuc;
	}
	public void setDinhMuc(double dinhMuc) {
		this.dinhMuc = dinhMuc;
	}
	public VietNam(String maKH, String hoTen, LocalDate ngayLap, double soKW, double donGia, String doiTuong,
			double dinhMuc) {
		super(maKH, hoTen, ngayLap, soKW, donGia);
		this.doiTuong = doiTuong;
		this.dinhMuc = dinhMuc;
	}
	public VietNam() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double ThanhTien() {
		double tt = 0;
		if(soKW <= dinhMuc) {
			tt = soKW*donGia;
		} else {
			tt = (soKW - dinhMuc)*donGia*dinhMuc + (soKW - dinhMuc)*donGia*2.5;
		}
		return  tt;
	}
	public String  toString() {
		return super.toString() + String.format("%-10s %-10s %-10s", doiTuong, dinhMuc, ThanhTien());
	}
}
