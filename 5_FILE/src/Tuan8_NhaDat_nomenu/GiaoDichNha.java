package Tuan8_NhaDat_nomenu;

public class GiaoDichNha extends GiaoDich {
	private String loaiNha, diaChi;
	private int choose;

	public GiaoDichNha() {
		super();
	}

	public GiaoDichNha(String loaiNha, String diaChi) {
		super();
		this.loaiNha = loaiNha;
		this.diaChi = diaChi;
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

	public void nhap() {
		super.nhap();
		System.out.print("Nhap dia chi: ");
		diaChi = scanner.nextLine();
		System.out.print("Nhap loai nha (cao cap/thuong): ");
		choose = scanner.nextInt();
		switch (choose) {
		case 0:
			loaiNha = "cao cap";
			break;
		case 1:
			loaiNha = "thuong";
			break;
		default:
			System.out.println("Chon lai.");
			break;
		}
	}

	@Override
	public String toString() {
		return super.toString() + ", loai nha: " + this.loaiNha + ", dia ch?: " + this.diaChi;
	}
}
