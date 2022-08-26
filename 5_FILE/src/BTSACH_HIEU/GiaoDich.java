package BTSACH_HIEU;

import java.util.Scanner;



// phan biete conparable comparator
public class GiaoDich implements Comparable<GiaoDich>{
//	Mã giao dịch, ngày giao dịch (ngày, tháng, năm), đơn giá
	protected String maGiaoDich;
	protected ThoiGian thoiGian;
	protected double donGia;
	protected double dienTich;
	
	public GiaoDich(String maGiaoDich, ThoiGian thoiGian, double donGia, double dienTich) {
		super();
		this.maGiaoDich = maGiaoDich;
		this.thoiGian = thoiGian;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}
	public GiaoDich() {
		maGiaoDich = "";
		thoiGian = new ThoiGian();
		donGia = 0;
		dienTich = 0;
	}
	public String getMaGiaoDich() {
		return maGiaoDich;
	}
	public void setMaGiaoDich(String maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}
	public ThoiGian getThoiGian() {
		return thoiGian;
	}
	public void setThoiGian(ThoiGian thoiGian) {
		this.thoiGian = thoiGian;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	public float thanhTien() {
		return (float) (dienTich * donGia);
	}
	
	public void nhap(Scanner scanner) {
		System.out.println("Nhap ma giao dich: ");
		scanner.nextLine();
		maGiaoDich = scanner.nextLine();
		thoiGian.nhap(scanner);
		do {
			System.out.println("Nhap don gia: ");
			donGia = scanner.nextDouble();
			System.out.println("Nhap dien tich: ");
			dienTich = scanner.nextDouble();
		} while (donGia < 0 || dienTich < 0);
	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return 
					"Ma giao dich: "+maGiaoDich+"\t"+
					"Thoi gian: "+thoiGian.getNgay()+"/"+thoiGian.getThang()+"/"+thoiGian.getNam()+"\t"+
					"Don gia: "+donGia+"\t"+"Dien tich: "+dienTich+"\t";
		}
	@Override
	public int compareTo(GiaoDich o) {
		// TODO Auto-generated method stub
		
		return this.maGiaoDich.compareToIgnoreCase(o.getMaGiaoDich());
	}
	
}
