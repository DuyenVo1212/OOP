package Tuan9_Phong;

public class MayTinh extends Phong{
	private int soLuongMT;

	public int getSoLuongMT() {
		return soLuongMT;
	}
	public void setSoLuongMT(int soLuongMT) {
		this.soLuongMT = soLuongMT;
	}
	public MayTinh(String maPhong, String dayNha, float dienTich, int soBongDen, int soLuongMT) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.soLuongMT = soLuongMT;
	}
	public MayTinh() {
		super();
	}
	@Override
	public boolean qualified() {
		if((soLuongMT/super.getDienTich())<1/1.5) return false;
		if((super.getDienTich()/super.getSoBongDen()*1.0)<1.0/10)return false;
		return true;
	}
	public static String tieude()
	{
		String str=String.format("%10s %10s %10s %15s %10s %15s",
				"Ma phong", "day nha", "dien tich", "so bong den","chat luong", "so may tinh");
		return str;
	}
	@Override
	public String toString() {
		return super.toString()+String.format(" %10d",soLuongMT );
	}
	
	
}
