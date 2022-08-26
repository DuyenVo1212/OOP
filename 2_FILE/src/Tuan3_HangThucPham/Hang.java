package Tuan3_HangThucPham;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Hang {
	private String maHang;
	private String tenHang;
	private float donGia;
	Date date = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	private Date ngaySX;
	private Date ngayHH;
	
	public String getMaHang() {
		return maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) throws Exception {
		if(!tenHang.isEmpty())this.tenHang = tenHang;
		else throw new Exception("Ten hang ko dc trong!");
	}
	public float getDonGia() {
		return donGia;
	}
	public void setDonGia(float donGia) throws Exception {
		if(donGia>=0) this.donGia = donGia;
		else throw new Exception("Don gia ko dc am!");
	}
	public Date getNgaySX() {
		return ngaySX;
	}
	
	public void setNgaySX(Date ngaySX) throws Exception {
		Date da = new Date();
		if(ngaySX.after(da))this.ngaySX = ngaySX;
		else throw new Exception("Phai truoc ngay hien tai!");
	}
	public Date getNgayHH() {
		return ngayHH;
	}
	public void setNgayHH(Date ngayHH) throws Exception {
		if(ngayHH.after(ngaySX))this.ngayHH = ngayHH;
		else throw new Exception("Ngay het han phai lon hon ngay san xuat!");
	}
	public Hang(String maHang, String tenHang, float donGia, Date ngaySX, Date ngayHH) throws Exception {
		super();
		if(!maHang.isEmpty()) 
		this.maHang=maHang;
		else throw new Exception("Ma hang ko dc trong!");
		setTenHang(tenHang);
		setDonGia(donGia);
		setNgaySX(ngaySX);
		setNgayHH(ngayHH);
	}
	public Hang() {
		this.tenHang="xxx";
		Date da = new Date();
		this.ngaySX= da;
		this.ngayHH=this.ngaySX;
	}
	
	public String ghiChu() {
		long day= (this.ngayHH.getTime()-this.ngaySX.getTime())/ (24 * 3600 * 1000);
		if(day>365) return "Het han!";
		else return "";
	}
	
	public String tieuDe() {
		String s="";
		s+=String.format("%-10s%-10s%10s  %-15s%-15s%-15s","Ma hang", 
				"Ten hang","Don gia", "Ngay san xuat", "Ngay het han", "Ghi chu");
		return s;
	}
	public String toString() {
		String tr="";
		tr+=String.format("%-10s%-10s%10.2f  %-15s%-15s%-15s", 
				this.maHang,this.tenHang, this.donGia,
				formatter.format(this.ngaySX), 
				formatter.format(this.ngayHH), 
				ghiChu());
		return tr;
	}
	
	
	
	
	
}
