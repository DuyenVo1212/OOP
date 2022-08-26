package Tuan3_ThongTinDangKyXe;

public class ThongTinXe {
	private int  maChuXe;
	private String chuXe;
	private String loaiXe;
	private float triGia;
	private int dungTich;
	public int getMaChuXe() {
		return maChuXe;
	}
	public void setMaChuXe(int maChuXe) {
		this.maChuXe = maChuXe;
	}
	public String getChuXe() {
		return chuXe;
	}
	public void setChuXe(String chuXe) {
		this.chuXe = chuXe;
	}
	public String getLoaiXe() {
		return loaiXe;
	}
	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}
	public float getTriGia() {
		return triGia;
	}
	public void setTriGia(float triGia) throws Exception {
		if(triGia>=0)this.triGia = triGia;
		else throw new Exception("Gia tri xe am!");
	}
	public int getDungTich() {
		return dungTich;
	}
	public void setDungTich(int dungTich) throws Exception {
		if(triGia>=0) this.dungTich = dungTich;
		else throw new Exception("Dung tich xe am!");
		}
	public ThongTinXe(int i, String chuXe, String loaiXe, int dungTich, float triGia) throws Exception {
		super();
		setMaChuXe(i);
		setChuXe(chuXe);
		setLoaiXe(loaiXe);
		setDungTich(dungTich);
		setTriGia(triGia);
		
	}
	public ThongTinXe() {
	}
	public float thueXe() {
		if(this.dungTich<100) 
			return (float) (this.triGia*0.01);
		if(this.dungTich>=100&&this.dungTich<=200) 
			return (float)(this.triGia*0.03);
		return (float)(this.triGia*0.05);
	}
	public String tieuDe() {
		String s="";
		s+=String.format("%15s  %-20s%-15s%10s%15s%15s","Ma chu xe","Ten chu xe", 
				"Loai xe","Dung tich", "Tri gia",  "Thue");
		return s;
	}
	public String toString() {
		String str="";
		str+=String.format("%15d  %-20s%-15s%10d%15.2f%15.2f",this.maChuXe,this.chuXe, this.loaiXe,this.dungTich,
				 this.triGia, thueXe());
		return str;
	}
}
