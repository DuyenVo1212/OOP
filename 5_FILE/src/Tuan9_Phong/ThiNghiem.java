package Tuan9_Phong;

public class ThiNghiem extends Phong{
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
	public ThiNghiem(String maPhong, String dayNha, float dienTich, int soBongDen, String chuyenNganh, int sucChua,
			boolean coBonRuaTay) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.chuyenNganh = chuyenNganh;
		this.sucChua = sucChua;
		this.coBonRuaTay = coBonRuaTay;
	}
	public ThiNghiem() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean qualified() {
		if(!coBonRuaTay) return false;
		if((super.getDienTich()/super.getSoBongDen()*1.0)<1.0/10)return false;
		return true;
	}
	public static String tieude()
	{
		String str=String.format("%10s %10s %10s %15s %10s %15s %10s %15s",
				"Ma phong", "day nha", "dien tich", "so bong den","chat luong", "chuyen nganh","suc chua","bon rua tay");
		return str;
	}
	public String kt()
	{
		if(coBonRuaTay) return "co";
		return "khong";
	}
	@Override
	public String toString() {
		return super.toString()+String.format("%15s %10d %15s",chuyenNganh, sucChua, coBonRuaTay);
	}
	
	
	
}
