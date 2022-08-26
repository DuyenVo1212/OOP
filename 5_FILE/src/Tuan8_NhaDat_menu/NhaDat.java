package Tuan8_NhaDat_menu;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class NhaDat {
	Date date = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	private String ma;
	private Date ngayGD;
	private int donGia;
	private String loai;
	private int dienTich;
	
	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public Date getNgayGD() {
		return ngayGD;
	}

	public void setNgayGD(Date ngayGD) {
		this.ngayGD = ngayGD;
	}

	public int getDonGia() {
		return donGia;
	}

	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public int getDienTich() {
		return dienTich;
	}

	public void setDienTich(int dienTich) {
		this.dienTich = dienTich;
	}
	
	public NhaDat(String ma, Date ngayGD, int donGia, String loai, int dienTich) {
		super();
		this.ma = ma;
		this.ngayGD = ngayGD;
		this.donGia = donGia;
		this.loai = loai;
		this.dienTich = dienTich;
	}

	public NhaDat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public abstract float thanhTien();
	
	@Override
	public String toString() {
		return String.format("%10s %10s %10d %10s %10d %10.2f", 
				ma, formatter.format(ngayGD), donGia, loai, dienTich, thanhTien());
	}
	
}
