package Tuan9_Phong;

public class LyThuyet extends Phong {
	private boolean coMayChieu;
	
	public boolean isCoMayChieu() {
		return coMayChieu;
	}
	public void setCoMayChieu(boolean coMayChieu) {
		this.coMayChieu = coMayChieu;
	}
	public LyThuyet(String maPhong, String dayNha, float dienTich, int soBongDen, boolean coMayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.coMayChieu = coMayChieu;
	}
	public LyThuyet() {
		super();
	}
	@Override
	public boolean qualified() {
		if(!coMayChieu) return false;
		if((super.getDienTich()/super.getSoBongDen())<1.0/10)return false;
		return true;
	}
	public static String tieude()
	{
		String str=String.format("%10s %10s %10s %15s %10s %10s",
				"Ma phong", "day nha", "dien tich", "so bong den","chat luong", "may chieu");
		return str;
	}
	public String kt()
	{
		if(coMayChieu) return "co";
		return "khong";
	}
	@Override
	public String toString() {
		return super.toString()+String.format(" %10s",kt());
	}
}
