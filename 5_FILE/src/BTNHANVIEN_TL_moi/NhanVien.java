package BTNHANVIEN_TL_moi;


public class NhanVien implements Comparable<NhanVien> {
	private String manv;
	private int sosp;

	public NhanVien(String manv, int sosp) {
		super();
		this.manv = manv;
		this.sosp = sosp;
	}

	public NhanVien() {
		super();
		manv = "";
		sosp = 0;
		// TODO Auto-generated constructor stub
	}

	public String getManv() {
		return manv;
	}

	public void setManv(String manv) {
		this.manv = manv;
	}

	public int getSosp() {
		return sosp;
	}

	public void setSosp(int sosp) {
		this.sosp = sosp;
	}

	public boolean vuotchuan() {
		return (sosp > 500);
	}

	public String Tongket() {
		if (sosp > 500) {
			return "vuot";
		} else {
			return "";
		}
	}
	public double getluong() {
		if(sosp>500) {
			return sosp*30000;
		}
		else 
			return sosp*2000;
	}
	public static void tieude() {
		System.out.println("ma nan vien"+"\tso san pham"+"\t\tluong"+"\ttong");
	}

	@Override
	public String toString() {
		return "NhanVien [manv=" + manv + ", sosp=" + sosp + ", Tongket()=" + Tongket() + "]";
	}
	public int compareTo(NhanVien o) {
		// TODO Auto-generated method stub
		return this.getManv().compareToIgnoreCase(o.getManv());
	}
}
