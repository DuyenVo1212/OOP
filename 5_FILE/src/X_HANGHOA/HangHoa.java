package X_HANGHOA;

import java.util.Date;

public abstract class HangHoa {
	protected String maHang;
	protected String tenHang;
	protected double donGia;
	protected int soLuongTon;
	public Date today = new Date(System.currentTimeMillis());
	
	abstract String mucDoBuonBan();
	abstract double tinhTienVAT();
	
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) throws Exception {
		if (!maHang.trim().equals(""))
			this.maHang = maHang;
		else
			throw new Exception("Tên Hàng Không Được Rỗng");
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) throws Exception {
		if (!tenHang.trim().equals(""))
			this.tenHang = tenHang;
		else
			throw new Exception("Tên Hàng Không Được Rỗng");
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) throws Exception {
		if (donGia>=0)
			this.donGia = donGia;
		else
			throw new Exception("Đơn giá > 0");
	}
	public int getSoLuongTon() {
		return soLuongTon;
	}
	public void setSoLuongTon(int soLuongTon) throws Exception {
		if (soLuongTon>=0)
			this.soLuongTon = soLuongTon;
		throw new Exception("Số Lượng Tồn phải >=0");
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maHang == null) ? 0 : maHang.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HangHoa other = (HangHoa) obj;
		if (maHang == null) {
			if (other.maHang != null)
				return false;
		} else if (!maHang.equals(other.maHang))
			return false;
		return true;
	}
	public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon) {
		super();
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.donGia = donGia;
		this.soLuongTon = soLuongTon;
	}
	public HangHoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	double thanhTien()
	{
		return tinhTienVAT() + this.donGia*this.soLuongTon;
	}
	
	@Override
	public String toString() {
		return String.format("%-30s%-30s%-30.3f%-30d%-30s%-30.3f",maHang,tenHang,donGia,soLuongTon,mucDoBuonBan(),thanhTien());
	}
}
