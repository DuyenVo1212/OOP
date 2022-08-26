package Tuan_2_QuanLySinhVien;

public class SinhVien {
	private int mssv;
	private String name;
	private float diemLT;
	private float diemTH;
	
	public SinhVien() {
		super();
		this.mssv = 0;
		this.name = "no name";
		this.diemLT = 0.0f;
		this.diemTH = 0.0f;
	}
	public SinhVien(int mssv, String name, float diemLT, float diemTH) {
		super();
		if(mssv>0)
			this.mssv = mssv;
		else this.mssv=-1;
		
		if(!name.isEmpty())
			this.name = name;
		else this.name="null";
		
		if(diemLT>=0 && diemLT<=10)
			this.diemLT=diemLT;
		else this.diemLT =-1;
		
		if(diemTH>=0 && diemTH<=10)
			this.diemTH=diemTH;
		else this.diemTH =-1;
	}
	public int getMssv() {
		return mssv;
	}
	public void setMssv(int mssv) {
		this.mssv = mssv;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(float diemLT) {
		this.diemLT = diemLT;
	}
	public float getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(float diemTH) {
		this.diemTH = diemTH;
	}
	
	public float diemTB()
	{
		return ((float)(getDiemLT()+getDiemTH())/2);
	}

	@Override
	public String toString() {
		String str=" ";
		str+=String.format("%-15d|%-15s|%15.2f|%15.2f|%15.2f|",getMssv(),getName(),getDiemLT(),getDiemTH(),diemTB());
		return str;
	}
	public String tieuDe()
	{
		String str=" ";
		str+=String.format("%-15s|%-15s|%15s|%15s|%15s|","MSSV","Ho va ten","Diem LT",
				"Diem TH","Diem tb");
		return str;
	}
	
	
}
