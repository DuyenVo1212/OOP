package t7QuanLyThucPham;

public abstract class HangHoa {
	private String tenHang;
	private String maHang;
	private int soLuongTon;
	private double donGia;
	
	public String getTenHang() {
		return tenHang;
	}
	
	public void setTenHang(String tenHang) throws Exception {
		if(!tenHang.trim().equals("")) { 
			this.tenHang = tenHang;
		}
		else
			throw new Exception("Ten hang khong duoc de trong");
	}
	
	public String getMaHang() {
		return maHang;
	}
	
	public void setMaHang(String maHang) throws Exception {
		if(!maHang.trim().equals("")) { 
			this.maHang = maHang;
		}
		else
			throw new Exception("Ma hang khong duoc de trong");
	}
	
	public int getSoLuongTon() {
		return soLuongTon;
	}
	
	public void setSoLuongTon(int soLuongTon) {
		if (donGia >= 0) {
			this.soLuongTon = soLuongTon;
		} else
			this.soLuongTon = 0;
	}
	
	public double getDonGia() {
		return donGia;
	}
	
	public void setDonGia(double donGia) {
		if (donGia > 0) {
			this.donGia = donGia;
		} else
			this.donGia = 0;
	}
	
	public HangHoa(String tenHang, String maHang, int soLuongTon, double donGia) {
		super();
		this.tenHang = tenHang;
		this.maHang = maHang;
		this.soLuongTon = soLuongTon;
		this.donGia = donGia;
	}
	
	public HangHoa() {
		super();
	}
	
	public abstract String danhGiaHangHoa();

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maHang == null) ? 0 : maHang.hashCode());
		return result;
	}
	
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
	
	public String toString() {
		return String.format("%15s %10s %15d %10.2f", tenHang, maHang, soLuongTon, donGia);
	}
}
