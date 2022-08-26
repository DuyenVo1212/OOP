package BT2;

public class SinhVien {
		private int maSV;
		private String hoTen;
		private float diemLT;
		private float diemTH;
		/**
		 * Default constructor của lớp SinhVien
		 */
//		public SinhVien(){
//			this(0,"",0.0f,0.0f);	
//		}
		/** 
		 * Constructor đầy đủ của lớp SinhVien. 
		 * Dùng để tạo mới một sinh viên khi biết mã số sinh viên, họ và tên, điểm 
		 * lý thuyết, điểm thực hành
		 * @param masv là mã số sinh viên
		 * @param hoten là họ và tên của sinh viên
		 * @param diemlt là điểm lý thuyết của sinh viên
		 * @param diemth là điểm thực hành của sinh viên
		 */
	public SinhVien() {
		this.maSV=0;
		this.diemLT=0;
		this.diemTH=0;
		this.hoTen="";
	}
		
		public SinhVien(int maSV,String hoTen,float diemLT,float diemTH){
					 super(); 
					 this.maSV = maSV; 
					 this.hoTen = hoTen;
				     this.diemLT = diemLT; 
				     this.diemTH = diemTH; 
				      }
		/**
		 * Lấy mã số sinh viên
		 * @return the masv
		 */
		public int getMaSV() {
			return maSV;
		}
		public void setMaSV(int maSV){
			if (maSV<0)
				this.maSV=0;
			else
				this.maSV=maSV;
		}
		public String getHoTen(){
			return hoTen;
		}
		public void setHoTen(String hoTen){
			this.hoTen=hoTen;
		}
		public float getDiemLT(){
			return diemLT;
		}
		public void setDiemLT(float diemLT){
			if (diemLT>=0 && diemLT <= 10)
				this.diemLT=diemLT;
			else
				this.diemLT=0;
		}
		public float getDiemTH(){
			return diemTH;
		}
		public void setDiemTH(float diemTH){
			if (diemTH >=0 && diemTH <=10)
				this.diemTH=diemTH;
			else
				this.diemTH = 0;
		}
		public float getDiemTB(){
			return (diemLT+diemTH)/2;
		}

		/**
		 * Biểu diễn đối tượng sinh viên ở dạng chuỗi 
		 * @return String 
		 */
		public String toString(){
			return String.format("%5d %-15s %10.2f %10.2f %10.2f",maSV,hoTen,diemLT,diemTH,getDiemTB())
;		}
		public String TieuDe() {
			return String.format("%5s %-15s %10s %10s %10s ", 
					"ma", "ten", "LT", "TH", "TBh" );
		}
		
		}
		
		