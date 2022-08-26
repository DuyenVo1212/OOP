package t6_KhachSan_good;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public abstract class HoaDon {
	Date date = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	private String maHD;
	private Date ngayHD;
	private String tenKH;
	private String maPhong;
	private int donGia;
	public String getMaHD() {
		return maHD;
	}
	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}
	public Date getNgayHD() {
		return ngayHD;
	}
	public void setNgayHD(Date ngayHD) {
		this.ngayHD = ngayHD;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public int getDonGia() {
		return donGia;
	}
	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}
	public HoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HoaDon(String maHD, Date ngayHD, String tenKH, String maPhong, int donGia) {
		super();
		this.maHD = maHD;
		this.ngayHD = ngayHD;
		this.tenKH = tenKH;
		this.maPhong = maPhong;
		this.donGia = donGia;
	}
	public abstract float thanhTien();
	@Override
	public int hashCode() {
		return Objects.hash(maHD);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HoaDon other = (HoaDon) obj;
		return Objects.equals(maHD, other.maHD);
	}
	@Override
	public String toString() {
		return String.format("%10s %15s %15s %10s %10d %10.2f", maHD, formatter.format(ngayHD), tenKH, maPhong, donGia, thanhTien());
	}
}
