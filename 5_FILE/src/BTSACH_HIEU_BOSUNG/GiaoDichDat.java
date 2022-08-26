package BTSACH_HIEU_BOSUNG;

import java.util.Scanner;


public class GiaoDichDat extends GiaoDich{
	private char loaiDat;

	public GiaoDichDat(String maGiaoDich, ThoiGian thoiGian, double donGia, double dienTich, char loaiDat) {
		super(maGiaoDich, thoiGian, donGia, dienTich);
		this.loaiDat = loaiDat;
	}

	public GiaoDichDat() {
		super();
		loaiDat = 'A';
	}

	public char getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(char loaiDat) {
		this.loaiDat = loaiDat;
	}
	
	@Override
	public void nhap(Scanner scanner) {
		// TODO Auto-generated method stub
		super.nhap(scanner);
		do {
			System.out.println("Nhap loai dat(A || B || C) : ");
			loaiDat = scanner.next().charAt(0);
			
		} while (loaiDat != 'A' && loaiDat != 'B' && loaiDat != 'C');
	}
	
	@Override
	public float thanhTien() {
		// TODO Auto-generated method stub
		if(loaiDat == 'A')
			return (float) (super.thanhTien() * 1.5);
		else 
			return super.thanhTien();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "Loai dat: "+loaiDat+"\t"+
					"Thanh tien: "+thanhTien();
	}
	/*
	 * @Override 
	 * public String toString() { return super.toString() +
	 * String.format("%10d", soNgayThue); }
	 */
}
