package X_HANGHOA;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPham extends HangHoa{
	
	private String nhaCungCap;
	private Date ngaySanXuat;
	private Date ngayHetHan;
	final double VAThtp=0.05;
	
	public String getNhaCungCap() {
		return nhaCungCap;
	}
	public void setNhaCungCap(String nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}
	
	public Date getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(Date ngaySanXuat) {
		if (ngaySanXuat.compareTo(today)<0)
			this.ngaySanXuat = ngaySanXuat;
		else
			this.ngaySanXuat=today;
	}
	
	public Date getNgayHetHan() {
		return ngayHetHan;
	}
	public void setNgayHetHan(Date ngayHetHan) {
		if (ngayHetHan.compareTo(this.ngaySanXuat)>0)
			this.ngayHetHan = ngayHetHan;
		else this.ngayHetHan= this.ngaySanXuat;
	}
	
	public HangThucPham(String maHang, String tenHang, double donGia, int soLuongTon, String nhaCungCap,
			Date ngaySanXuat, Date ngayHetHan) {
		super(maHang, tenHang, donGia, soLuongTon);
		this.nhaCungCap = nhaCungCap;
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
	}
	public HangThucPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HangThucPham(String maHang, String tenHang, double donGia, int soLuongTon) {
		super(maHang, tenHang, donGia, soLuongTon);
		// TODO Auto-generated constructor stub
	}
	
	// Kiểm tra ngày hết hạn
	boolean kiemTraHetHan()
	{
		return ngayHetHan.compareTo(today)<0 ? true : false;
	}
	
	// Hiện thực Hàm mucDoBuonBan()
	@Override
	String mucDoBuonBan()
	{
		return (this.soLuongTon > 0 && kiemTraHetHan()) ? "Khó Bán" : "Ko đánh Giá";
	}
	
	@Override
	double tinhTienVAT()
	{
		return this.donGia*this.soLuongTon*VAThtp;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String str1 = df.format(ngaySanXuat);
        String str2 = df.format(ngayHetHan);
		String content1=String.format("\n%-30s%-30s%-30s",nhaCungCap,str1,str2);
	return super.toString() + content1;
	}
}
