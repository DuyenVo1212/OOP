package cuoiki.b1;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class BienChe extends NhanVien{
	private double hsLuong;
	private boolean trangThai;
	
	public double getHsLuong() {
		return hsLuong;
	}
	public void setHsLuong(double hsLuong) {
		this.hsLuong = hsLuong;
	}
	public boolean isTrangThai() {
		return trangThai;
	}
	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}
	
	public BienChe(String maNV, String hoTen, LocalDate ngayVaoLam, double hsLuong, boolean trangThai) {
		super(maNV, hoTen, ngayVaoLam);
		this.hsLuong = hsLuong;
		this.trangThai = trangThai;
	}
	
	public BienChe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double thanhTien() {
		// TODO Auto-generated method stub
		double tien = 0;
		if(trangThai)
			tien = hsLuong*140000+2000000;
		else
			tien = hsLuong*140000+500000;
		return tien;
	}

	Locale LocaleVN = new Locale("vi", "VN");
	//dinh dang tien te
	NumberFormat nf = NumberFormat.getInstance(LocaleVN);
	//dinh dang number
	public String toString() {
		String congViec = trangThai ? "Hoan Thanh":"Khong Hoan Thanh";
		return super.toString() + String.format("%-10s %-10s %-10s", hsLuong, congViec, nf.format(thanhTien()));
	}

}
