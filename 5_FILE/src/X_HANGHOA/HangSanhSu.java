package X_HANGHOA;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HangSanhSu extends HangHoa {
	private String nhaSanXuat;
	private Date ngayNhapKho;
	final double VAThss=0.1;
	
	public String getNhaSanXuat() {
		return nhaSanXuat;
	}
	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}
	public Date getNgayNhapKho() {
		return ngayNhapKho;
	}
	public void setNgayNhapKho(Date ngayNhapKho) {
		if(ngayNhapKho.compareTo(today)<0)
			this.ngayNhapKho = ngayNhapKho;
		else this.ngayNhapKho=today;
	}
	
	public HangSanhSu(String maHang, String tenHang, double donGia, int soLuongTon, String nhaSanXuat,
			Date ngayNhapKho) {
		super(maHang, tenHang, donGia, soLuongTon);
		this.nhaSanXuat = nhaSanXuat;
		this.ngayNhapKho = ngayNhapKho;
	}
	
	public HangSanhSu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HangSanhSu(String maHang, String tenHang, double donGia, int soLuongTon) {
		super(maHang, tenHang, donGia, soLuongTon);
		// TODO Auto-generated constructor stub
	}
	
	// Số Ngày Lưu Kho
	int soNgayLuuKho()
	{
		return (int)((today.getTime() - this.ngayNhapKho.getTime()) / (1000 * 60 * 60 * 24));
	}
	

	@Override
	String mucDoBuonBan() {
		// TODO Auto-generated method stub
		return (this.soLuongTon > 50 && soNgayLuuKho()>10) ? "Bán Chậm" : "Ko Đánh Giá";
	}
	@Override
	double tinhTienVAT() {
		// TODO Auto-generated method stub
		return this.donGia*this.soLuongTon*VAThss;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String str1 = df.format(ngayNhapKho);
        String content2=String.format("\n%s%-30s%-30s","",nhaSanXuat,str1);
	return super.toString() + content2;
	}
	
	
}
