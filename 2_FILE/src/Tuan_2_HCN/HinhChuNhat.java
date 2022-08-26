package Tuan_2_HCN;

public class HinhChuNhat {
	private int chieuDai;
	private int chieuRong;
	private String ten;
	public HinhChuNhat(String ten,int chieuDai, int chieuRong)
	{
		super();
		this.ten=ten;
		this.chieuDai=chieuDai;
		this.chieuRong=chieuRong;
	}
	
	public HinhChuNhat()
	{
		super();
	}

	public int getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(int chieuDai) throws Exception{
		this.chieuDai = chieuDai;
		throw new Exception(" ");
	}

	public int getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}

	public int tinhDienTich()
	{
		return (this.getChieuDai()*this.getChieuRong());
	}
	
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public float tinhChuVi()
	{
		return (float)((this.chieuDai+this.chieuRong)*2);
	}
	
	@Override
	public String toString() {
		String str=" ";
		str+=String.format("%-10s|%10d|%10d|%10d|%10.2f|",this.ten,this.getChieuDai(),this.chieuRong,
				this.tinhDienTich(),this.tinhChuVi());
		return str;
	}
	public String tieuDe()
	{
		String str=" ";
		str+=String.format("%10s|%10s|%10s|%10s|%10s|","Ten","Chieu dai","Chieu rong",
				"Dien tich","Chu vi");
		return str;
	}
}
