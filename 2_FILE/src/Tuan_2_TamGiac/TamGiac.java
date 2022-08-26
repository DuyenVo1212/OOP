package Tuan_2_TamGiac;

public class TamGiac {
	private int ma;
	private int mb;
	private int mc;
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		if(ma>0) this.ma = ma;
	}
	public int getMb() {
		return mb;
	}
	
	public void setMb(int mb) {
		if(mb>0) this.mb = mb;
	}
	public int getMc() {
		return mc;
	}
	public void setMc(int mc) {
		if(mc>0&&
				this.ma+this.mb>mc&&this.ma+mc>mb&&
				this.mb+mc>this.ma)
		this.mc = mc;
	}
	
	public TamGiac() {
		
	}
	public TamGiac(int ma, int mb, int mc) {
		setMa(ma);
		setMb(mb);
		setMc(mc);
		if(ma<0 || mb<0 || mc<0||
			ma+mb<mc || ma+mc<mb || 
			mb+mc<ma) this.ma=this.mb=this.mc=0;	
	}
	public int chuVi()
	{
		return getMa()+getMb()+getMc();
	}
	public float dienTich()
	{
		float p=chuVi()/2;
		return (float) (Math.sqrt(p*(p-getMa()*1.0)*(p-getMb()*1.0)*(p-getMc()*1.0)));
	}
	public String kieuLoai()
	{
		if(ma<0 || mb<0 || mc<0||
				ma+mb<mc || ma+mc<mb || 
				mb+mc<ma)
			return "Khong phai!";
		if(this.ma==this.mb&&this.mb==this.mc)
			return "Tam giac deu";
		if(this.ma==this.mb||this.mb==this.mc||this.ma==this.mc)
			return "Tam giac can";
		return "Thuong";
	}
	
	public String tieuDe()
	{
		String str="";
		str+=String.format("%10s|%10s|%10s|%20s|%10s|%10s|","Canh 1","Canh 2","Canh 3",
				"Kieu tam giac","Chu vi", "Dien tich");
		return str;
	}
	@Override
	public String toString() {
		String s = "";
		s+=String.format("%10d|%10d|%10d|%20s|%10d|%10.2f|",this.ma, this.mb,
				this.mc,kieuLoai(),chuVi(), dienTich());
		return s;
	}
	
}









