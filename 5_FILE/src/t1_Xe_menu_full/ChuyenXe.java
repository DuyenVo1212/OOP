package t1_Xe_menu_full;

public class ChuyenXe implements Comparable<ChuyenXe> {
	protected String maXe;
	protected String hoTenTX;
	protected String soXe;
	protected double doanhThu;
	
	public String getMaXe() {
		return maXe;
	}
	
	public void setMaXe(String maXe) {
		this.maXe = maXe;
	}
	
	public String getHoTenTX() {
		return hoTenTX;
	}
	
	public void setHoTenTX(String hoTenTX) {
		this.hoTenTX = hoTenTX;
	}
	
	public String getSoXe() {
		return soXe;
	}
	
	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}
	
	public double getDoanhThu() {
		return doanhThu;
	}
	
	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}

	public ChuyenXe() {
		super();
	}

	public ChuyenXe(String maXe, String hoTenTX, String soXe, double doanhThu) {
		this.maXe = maXe;
		this.hoTenTX = hoTenTX;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}
	
	public String toString() {
		return String.format("%8s %30s %8s %12.2f", maXe, hoTenTX, soXe, doanhThu);
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maXe == null) ? 0 : maXe.hashCode());
		return result;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChuyenXe other = (ChuyenXe) obj;
		if (maXe == null) {
			if (other.maXe != null)
				return false;
		} else if (!maXe.equals(other.maXe))
			return false;
		return true;
	}

	public int compareTo(ChuyenXe cx) {
		int n;
		if(this.getDoanhThu()==cx.getDoanhThu())
			n=0;
		if(this.getDoanhThu()==cx.getDoanhThu())
			n=1;
		else 
			n=0;
		if(n==0)
			return this.getHoTenTX().compareToIgnoreCase(cx.hoTenTX);
		return 0;
	}
}
