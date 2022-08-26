package BT3;

public class Xe {

	 private int maXe,dungTich;
	    private double triGia;
	    private String chuXe,loaixe;
	 
	    public Xe(int maXe, int dungTich, double triGia, String chuXe, String loaixe) {
	        this.maXe = maXe;
	        this.chuXe = chuXe;
	        this.loaixe = loaixe;
	        this.dungTich = dungTich;
	        this.triGia = triGia;
	        
	    }
	    public Xe(){
	    	maXe=0;
	    	chuXe="";
	    	loaixe="";
	    	dungTich=0;
	    	triGia=0;   	
	    }

	    public int getMaXe() {
			return maXe;
		}
		public void setMaXe(int maXe) {
			this.maXe = maXe;
		}
		public int getDungTich() {
			return dungTich;
		}
		public void setDungTich(int dungTich) {
			this.dungTich = dungTich;
		}
		public double getTriGia() {
			return triGia;
		}
		public void setTriGia(double triGia) {
			this.triGia = triGia;
		}
		public String getChuXe() {
			return chuXe;
		}
		public void setChuXe(String chuXe) {
			this.chuXe = chuXe;
		}
		public String getLoaixe() {
			return loaixe;
		}
		public void setLoaixe(String loaixe) {
			this.loaixe = loaixe;
		}
		
		
		public double tinhThue(){
	        double thue;
	        if(dungTich<100) thue=triGia*0.01;
	        else if (dungTich >= 100 && dungTich<=200) thue = triGia * 0.03;
	        else thue = triGia * 0.05;
	        return thue;
	    }
	 
	    
	    @Override
	    public String toString() {
	        return maXe + "-"+chuXe + "-"+loaixe + "-"+dungTich + "-"+triGia + "-"+tinhThue();
	}
	 
	    
	    void inThue(){
	        System.out.printf("%5d %5s %5s %10d %10.2f %8.5f \n ",maXe,chuXe,loaixe,dungTich,triGia,tinhThue());
	    }
//		@Override
//		public String toString() {
//			return "Xe [maXe=" + maXe + ", dungTich=" + dungTich + ", triGia=" + triGia + ", chuXe=" + chuXe
//					+ ", loaixe=" + loaixe + "]";
//		}
	}