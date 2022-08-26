package t3TaiKhoanNganHang;

public class Account {
	private long maAcc;
	private String tenChuAcc;
	private double soDu;
	private final double LAISUAT = 0.035;
	private final double PHIRUT = 1100;
	
	public long getMaAcc() {
		return maAcc;
	}
	public void setMaAcc(long maAcc) {
		this.maAcc = maAcc;
	}
	public String getTenChuAcc() {
		return tenChuAcc;
	}
	public void setTenChuAcc(String tenChuAcc) {
		this.tenChuAcc = tenChuAcc;
	}
	public double getSoDu() {
		return soDu;
	}
	public void setSoDu(double soDu) {
		this.soDu = soDu;
	}
	public Account(long maAcc, String tenChuAcc, double soDu) {
		super();
		this.maAcc = maAcc;
		this.tenChuAcc = tenChuAcc;
		this.soDu = soDu;
	}
	
	public Account(long maAcc, String tenChuAcc) {
		super();
		this.maAcc = maAcc;
		this.tenChuAcc = tenChuAcc;
		this.soDu = 50000;
	}
	
	public Account() {
		super();
	}
	public void napTien(long soTienNap) throws Exception {
		if(soTienNap > 0)
			this.soDu = this.soDu + soTienNap;
		else
			throw new Exception("So tien phai lon hon 0");
	}
	
	public void rutTien(long  soTienRut) throws Exception {
		if(soTienRut > 0 & (this.soDu - (soTienRut + PHIRUT)) > 50000)
			this.soDu = this.soDu - (soTienRut + PHIRUT);
		else 
			throw new Exception("Số tiền trong tài khoản phải lớn hơn 50000 ");
		}
	
	public void daoHan() {
		this.soDu = this.soDu + (this.soDu * LAISUAT);
	}
	
	public void chuyenTien(Account accnhan, long soTienChuyen) throws Exception {
		if(soTienChuyen > 0)
			this.rutTien(soTienChuyen);
			accnhan.napTien(soTienChuyen);
	}

	public String toString() {
		return String.format("%-10d %35s %15.2f", this.maAcc, this.tenChuAcc, this.soDu);
	}
}
