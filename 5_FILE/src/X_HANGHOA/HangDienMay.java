package X_HANGHOA;

public class HangDienMay extends HangHoa {
	private int thoiGianBaoHanh;
	private double congSuat;
	final double VAThdm=0.1;
	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}
	public void setThoiGianBaoHanh(int thoiGianBaoHanh) throws Exception {
		if (thoiGianBaoHanh>=0)
			this.thoiGianBaoHanh = thoiGianBaoHanh;
		else throw new Exception("Thời gian bảo hành >=0");
	}
	public double getCongSuat() {
		return congSuat;
	}
	public void setCongSuat(double congSuat) throws Exception {
		if (congSuat >0)
			this.congSuat = congSuat;
		else throw new Exception("Công suất >0");
	}
	public HangDienMay(String maHang, String tenHang, double donGia, int soLuongTon, int thoiGianBaoHanh,
			double congSuat) {
		super(maHang, tenHang, donGia, soLuongTon);
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		this.congSuat = congSuat;
	}
	public HangDienMay() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HangDienMay(String maHang, String tenHang, double donGia, int soLuongTon) {
		super(maHang, tenHang, donGia, soLuongTon);
		// TODO Auto-generated constructor stub
	}
	
	// Hiện thực Hàm mucDoBuonBan()
	@Override
	String mucDoBuonBan()
	{
		return (this.soLuongTon < 3 ) ? "Bán được" : "Ko Đánh Giá";
	}
	
	// Hiện thực Hàm tinhTienVAT()
	@Override
	double tinhTienVAT()
	{
		return this.donGia*this.soLuongTon*VAThdm;
	}
	
	@Override
	public String toString() {
		String content3=String.format("\n%-150s%-30d%-30.3f","",thoiGianBaoHanh,congSuat);
	return super.toString() + content3;
	}
	
}
