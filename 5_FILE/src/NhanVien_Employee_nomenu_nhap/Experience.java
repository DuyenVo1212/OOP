package NhanVien_Employee_nomenu_nhap;

import java.time.LocalDate;

public class Experience extends Employee{
	private int soNamKinhNghiem;

	public Experience() {
		super();
	}

	public Experience(String ma, String fullName, LocalDate ngaySinh, String soDienThoai, int soNamKinhNghiem) {
		super(ma, fullName, ngaySinh, soDienThoai);
		setSoNamKinhNghiem(soNamKinhNghiem);
	}

	public int getSoNamKinhNghiem() {
		return soNamKinhNghiem;
	}

	public void setSoNamKinhNghiem(int soNamKinhNghiem) {
		if(soNamKinhNghiem>0) {
			this.soNamKinhNghiem = soNamKinhNghiem;
		} else
			this.soNamKinhNghiem = 0;
	}

	@Override
	public String toString() {
		return String.format("%s %-15d", super.toString(), this.soNamKinhNghiem);
	}
	
	
	
}
