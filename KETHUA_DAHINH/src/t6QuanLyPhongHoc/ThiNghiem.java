package t6QuanLyPhongHoc;

public class ThiNghiem extends Phong {
	private String chuyenNganh;
	private int sucChua;
	private boolean coBonRuaTay;
	
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

	public boolean isCoBonRuaTay() {
		return coBonRuaTay;
	}

	public void setCoBonRuaTay(boolean coBonRuaTay) {
		this.coBonRuaTay = coBonRuaTay;
	}

	public ThiNghiem(String maPhong, String dayNha, float dienTich, int soBongDen, String chuyenNganh, int sucChua, boolean coBonRuaTay) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.chuyenNganh = chuyenNganh;
		this.sucChua = sucChua;
		this.coBonRuaTay = coBonRuaTay;
	}

	public ThiNghiem() {
		super();
	}

	public boolean datChuan() {
		if(!coBonRuaTay) return false;
		if((super.getSoBongDen()/super.getDienTich()) < 1.0/10)return false;
		return true;
	}

	public static String tieuDe()
	{
		String str = String.format("%10s %10s %10s %15s %10s %15s %10s %15s",
				"Ma phong", "day nha", "dien tich", "so bong den","chat luong", "chuyen nganh","suc chua","bon rua tay");
		return str;
	}
	public String kiemTraDatChuan() {
		if(coBonRuaTay) return "Dat chuan";
		return "Khong dat chuan";
	}
	
	public String toString() {
		return super.toString() + String.format("%25s %10d %15s",chuyenNganh, sucChua, coBonRuaTay);
	}
	
}
