package BT1;

public class HinhChuNhat {

	private int chieuDai;
	private int chieuRong;
	
	public HinhChuNhat(int chieuDai, int chieuRong)
	{
		super();
	
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

	public void setChieuRong(int chieuRong) throws Exception {
		this.chieuRong = chieuRong;
		throw new Exception(" ");
	}

	public float DienTich()
	{
		return (this.getChieuDai()*this.getChieuRong());
	}
	
	public float ChuVi()
	{
		return (float)((this.chieuDai+this.chieuRong)*2);
	}
	
	@Override
	public String toString() {
		
		return String.format("%10d|%10d|%10.2f|%10.2f|",chieuDai,chieuRong,
				DienTich(),ChuVi());
		
	}
	public String TieuDe()
	{
		String str=" ";
		str+=String.format("%10s|%10s|%10s|%10s|","Chieu dai","Chieu rong",
				"Dien tich","Chu vi");
		return str;
	}
}
