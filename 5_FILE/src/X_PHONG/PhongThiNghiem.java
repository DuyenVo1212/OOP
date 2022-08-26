package X_PHONG;

public class PhongThiNghiem extends PhongHoc {
	
	// Thuộc tính riêng
	private boolean bonRuaTay;
	private String chuyenNganh;
	private int sucChua;
	// Constructor
	public PhongThiNghiem() {
		super();
		
	}

	public String getChuyenNganh() {
		return chuyenNganh;
	}


	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}


	public int getSucChua() {
		return sucChua;
	}


	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}

	public PhongThiNghiem(String dayNha, String maPhong, double dienTich, int soBongDen, boolean bonRuaTay,
			String chuyenNganh, int sucChua) {
		super(dayNha, maPhong, dienTich, soBongDen);
		this.bonRuaTay = bonRuaTay;
		this.chuyenNganh = chuyenNganh;
		this.sucChua = sucChua;
	}

	// Setter
	public void setBonRuaTay(boolean bonRuaTay) {
		this.bonRuaTay = bonRuaTay;
	}
	
	// Hàm kiểm tra có Bồn rửa tay hay không
	public boolean isBonRuaTay() {
		return bonRuaTay ? true : false;
	}

	// Hiện thực phương thức datChuan()
	@Override
	boolean datChuan() {
		return isBonRuaTay() && duSang() ? true : false;
	}

	@Override
	public String toString() {
		String brt = isBonRuaTay() ? "Có Bồn rửa tay(PTN)" : "Không Bồn rửa tay(PTN)";
		return super.toString() + String.format("%-30s%-20s%-2d", brt,chuyenNganh,sucChua)+" Ngư�?i";
	}

}
