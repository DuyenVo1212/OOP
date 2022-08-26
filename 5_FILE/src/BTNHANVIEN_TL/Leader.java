package BTNHANVIEN_TL;

public class Leader extends Employee {

	public Leader() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Leader(int maso, String tennv, double luongcb) {
		super(maso, tennv, luongcb);
		// TODO Auto-generated constructor stub
	}
	public double PhuCap() {
			return 20/100*this.luongcb;
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
