package BTNHANVIEN_TL;

public class Administrator extends Employee {

	public Administrator() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Administrator(int maso, String tennv, double luongcb) {
		super(maso, tennv, luongcb);
		// TODO Auto-generated constructor stub
	}
	public double PhuCap() {
			return 40/100*this.luongcb;
	}
	@Override
	public double luongthang() {
		// TODO Auto-generated method stub
		return this.luongcb+PhuCap();
	}
	@Override
	public String toString() {
		return super.toString()+ "\t" + ", PhuCap=" + PhuCap()
				+ ", luongthang=" + luongthang();
	}
	}
	
			

