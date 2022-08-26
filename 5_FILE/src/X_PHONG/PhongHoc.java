package X_PHONG;

import java.util.Objects;

public abstract class PhongHoc {
	// Thuộc tính chung
	protected String dayNha;
	protected String maPhong;
	protected int soBongDen;
	protected double dienTich;
	
	// Phương thức trừu tượng datChuan()
	abstract boolean datChuan();

	// Constructor
	public PhongHoc() {

	}

	public PhongHoc(String dayNha, String maPhong, double dienTich, int soBongDen) {
		super();
		this.dayNha = dayNha;
		this.maPhong = maPhong;
		this.dienTich = dienTich;
		this.soBongDen = soBongDen;
	}

	// Getter & Setter

	public String getDayNha() {
		return dayNha;
	}

	public void setDayNha(String dayNha) {
		this.dayNha = dayNha;
	}

	public String getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}

	public double getDienTich() {
		return dienTich;
	}

	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}

	public int getSoBongDen() {
		return soBongDen;
	}

	public void setSoBongDen(int soBongDen) {
		this.soBongDen = soBongDen;
	}

	// Hàm kiểm tra đủ sáng hay không
	protected boolean duSang() {
		return (getDienTich() / getSoBongDen() <= 10) ? true : false;

	}
	// Hashcode & equals
	@Override
	public int hashCode() {
		return Objects.hash(maPhong);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhongHoc other = (PhongHoc) obj;
		return Objects.equals(maPhong, other.maPhong);
	}

	@Override
	public String toString() {
		return String.format("%-10s%-15s%-15d%-15.2f",getDayNha(),getMaPhong(),getSoBongDen(),getDienTich());
	}

}
