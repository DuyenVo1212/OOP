package CD;

public class Album {
    //khai báo các thuộc tính
    private int maCD;
    private String tenCD;
    private String caSy;
    private int soBH;
    private float giaThanh;
    //khởi tạo constructor mặc định
    public Album() {
    }
    //khởi tạo constructor có tham số
    public Album(int cD, String tenCD, String caSy, int soBH, float giaThanh) {
        this.maCD = maCD;
        this.tenCD = tenCD;
        this.caSy = caSy;
        this.soBH = soBH;
        this.giaThanh = giaThanh;
    }
    //------------begin getter and setter--------------
    public int getMaCD() {
        return maCD;
    }
 
    public void setMaCD(int maCD) {
		if(maCD > 0) {
			this.maCD = maCD;
		}
		else {
			this.maCD = 999999;
		}
	}
 
    public String getTenCD() {
        return tenCD;
    }
 
    public void setTenCD(String tenCD) {
    	if(tenCD == "") {
			this.tenCD = tenCD;
		}
		else {
			this.tenCD = "Chua xac dinh";
		}
	}
 
    public String getCaSy() {
        return caSy;
    }
 
    public void setCaSy(String caSy) {
        this.caSy = caSy;
    }
 
    public int getSoBH() {
        return soBH;
    }
 
    public void setSoBH(int soBH) {
        this.soBH = soBH;
    }
 
    public float getGiaThanh() {
        return giaThanh;
    }
 
    public void setGiaThanh(float giaThanh) {
        this.giaThanh = giaThanh;
    }
    //------------end getter and setter--------------
    @Override
    public String toString() {
        return "Album{" +
                "cD=" + maCD +
                ", tenCD='" + tenCD + "" +
                ", caSy='" + caSy + "" +
                ", soBH=" + soBH +
                ", giaThanh=" + giaThanh +
                '}';
    }
    //khởi tạo phương thức hiện thị theo format
    public void hienThiAlbum(){
        System.out.printf("%-10d %-20s %-20s %-10d %-20.1f \n",maCD,tenCD,caSy,soBH,giaThanh);
    }
 
}