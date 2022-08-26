package BTSACH_HIEU_BOSUNG;

import java.util.Scanner;

public class GiaoDichNha extends GiaoDich {
	private String loaiNha;
	private String diaChi;

	public GiaoDichNha(String maGiaoDich, ThoiGian thoiGian, double donGia, double dienTich, String loaiNha,
			String diaChi) {
		super(maGiaoDich, thoiGian, donGia, dienTich);
		this.loaiNha = loaiNha;
		this.diaChi = diaChi;
	}

	public GiaoDichNha() {
		super();
		loaiNha = "cao cap";
		diaChi = "";
	}

	public String getLoaiNha() {
		return loaiNha;
	}

	public void setLoaiNha(String loaiNha) {
		this.loaiNha = loaiNha;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public void nhap(Scanner scanner) {
		// TODO Auto-generated method stub
		super.nhap(scanner);
		scanner.nextLine();
		do {
			System.out.println("Nhap loai nha(cao cap||thuong): ");

			loaiNha = scanner.nextLine();
			loaiNha = loaiNha.trim();
		} while (!loaiNha.equalsIgnoreCase("cao cap") && !loaiNha.equalsIgnoreCase("thuong"));

		System.out.println("Nhap dia chi: ");
		diaChi = scanner.nextLine();
	}

	@Override
	public float thanhTien() {
		// TODO Auto-generated method stub

		// if(loaiNha.equals("cao cap"))
		if (loaiNha.equalsIgnoreCase("Thuong"))
			return super.thanhTien();
		else
			return (float) (super.thanhTien() * 0.9);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "Loai nha: " + loaiNha + "\t" + "Dia chi: " + diaChi + "\t" + "Thanh tien: "
				+ thanhTien();
	}

}
