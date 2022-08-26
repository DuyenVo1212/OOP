package SV;

public class SinhVien {
	private int maSV;
	private String hoTen;
	private float diemLT;
	private float diemTH;
	public SinhVien() {
		this(0, "", 0.0f, 0.0f);
	}
	
	public SinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
		setMaSV(maSV);
		setHoTen(hoTen);
		setDiemLT(diemLT);
		setDiemTH(diemTH);
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		if(maSV <= 0) {
			this.maSV = 1;
		}
		this.maSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public float getDiemLT() {
		return diemLT;
	}

	public void setDiemLT(float diemLT) {
		if(diemLT < 0 && diemLT > 10) {
			this.maSV = 0;
		}
		this.diemLT = diemLT;
	}

	public float getDiemTH() {
		return diemTH;
	}

	public void setDiemTH(float diemTH) {
		if(diemTH < 0 && diemTH > 10) {
			this.diemTH = 0;
		}
		this.diemTH = diemTH;
	}
	
	public float DiemTB() {
		return (diemLT+diemTH)/2;
	}
	public String TieuDe() {
		return String.format("%5s %15s %10s %10s %10s", "MaSV", "Ho Ten", "Diem LT", "Diem TH", "Diem TB");
	}
	public String ToString() {
		return String.format("%5s %15s %10.2f %10.2f %10.2f", maSV, hoTen, diemLT, diemTH, DiemTB());
	}
}
